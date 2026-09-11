SELECT product_id,
IFNULL(
        (SELECT new_price 
        FROM Products p2
        where p1.Product_id=p2.Product_id
        AND change_date <= '2019-08-16'
        ORDER BY change_date desc
        LIMIT 1
        ),
    10) AS price 
FROM Products p1
GROUP BY product_id;
    
