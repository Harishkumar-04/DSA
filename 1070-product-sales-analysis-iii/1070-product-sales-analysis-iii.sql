/*
SELECT s.product_id, s.year as  first_year, s.quantity, s.price 
FROM Sales s
JOIN (
    SELECT product_id, min(year) as first_year
    FROM Sales
    GROUP BY product_id
) AS f
ON s.product_id=f.product_id
AND s.year=f.first_year;
*/

SELECT product_id, year as  first_year, quantity, price 
FROM (
    SELECT product_id, year, quantity, price,
    RANK() OVER (
        PARTITION BY product_id
        ORDER BY year
    ) AS f
    FROM Sales
) AS s
WHERE f=1;


/*
SELECT s.product_id, s.year AS first_year, s.quantity, s.price
FROM Sales s
WHERE (s.product_id, s.year) IN (
    SELECT product_id , MIN(year) AS year 
    FROM Sales 
    GROUP BY product_id
)

*/
