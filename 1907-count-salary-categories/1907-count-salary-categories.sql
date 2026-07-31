/*
SELECT 'Low Salary' AS category,
       COUNT(*) AS accounts_count
FROM Accounts
WHERE income < 20000

UNION ALL

SELECT 'Average Salary',
       COUNT(*)
FROM Accounts
WHERE income BETWEEN 20000 AND 50000

UNION ALL

SELECT 'High Salary',
       COUNT(*)
FROM Accounts
WHERE income > 50000;

*/


SELECT
    category,
    COUNT(account_id) AS accounts_count
FROM
(
    SELECT
        account_id,
        CASE
            WHEN income < 20000 THEN 'Low Salary'
            WHEN income <= 50000 THEN 'Average Salary'
            ELSE 'High Salary'
        END AS category
    FROM Accounts
) AS A
RIGHT JOIN
(
    SELECT 'Low Salary' AS category
    UNION ALL
    SELECT 'Average Salary'
    UNION ALL
    SELECT 'High Salary'
) AS C
USING (category)
GROUP BY category;
