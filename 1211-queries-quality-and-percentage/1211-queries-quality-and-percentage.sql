SELECT query_name,
    ROUND(AVG(rating / position), 2) AS quality,
    ROUND(
        SUM(
            CASE
                WHEN rating < 3 THEN 1
                ELSE 0
            END
        ) * 100 / COUNT(query_name),
        2
    ) AS poor_query_percentage
FROM Queries
GROUP BY query_name;

-- Round(Sum(rating/position)/count(*),2)
-- round(sum(case when rating < 3 then 1 else 0 end) * 100 / count(*), 2)
-- ROUND(SUM(rating < 3) * 100 / COUNT(*),2)

-- round((sum(rating/position))/count(query_name),2)
-- round(sum(case when rating < 3 then 1 else 0 end) * 100 / count(query_name), 2)

-- ROUND(AVG(rating / position), 2)
-- ROUND(AVG(IF(rating < 3, 100, 0)), 2)
-- ROUND(AVG(rating < 3) * 100, 2)



