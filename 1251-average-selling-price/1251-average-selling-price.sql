SELECT
    p.product_id,
    IFNULL(
        ROUND(
            SUM(p.price * u.units) / SUM(u.units),
            2
        ),
        0
    ) AS average_price
FROM Prices p
LEFT JOIN UnitsSold u
    ON p.product_id = u.product_id
    AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id;

-- case when sum(u.units) is null then 0 else round(sum(p.price*u.units)/sum(u.units),2) 
-- COALESCE(Round(sum(p.price*u.units)/sum(u.units),2),0)
-- ROUND(IFNULL(SUM(p.price*u.units)/SUM(u.units),0),2)