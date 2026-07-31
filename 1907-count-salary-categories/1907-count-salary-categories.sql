SELECT 
    'Low Salary' AS Category,
    SUM(income < 20000) AS accounts_count
FROM Accounts

UNION

SELECT 
    'Average Salary',
    SUM(income BETWEEN 20000 AND 50000)
FROM Accounts

UNION

SELECT 
    'High Salary',
    SUM(income > 50000)
FROM Accounts;

/*
SELECT 
CASE
    WHEN income < 20000 THEN 'Low Salary'
    WHEN income >= 20000 AND income < 50000 THEN 'Average Salary'
    ELSE 'High Salary'
END AS category, 
COUNT(account_id) AS accounts_count
FROM Accounts
GROUP BY category;
*/
