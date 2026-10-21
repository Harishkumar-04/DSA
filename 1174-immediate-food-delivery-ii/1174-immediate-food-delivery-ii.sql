SELECT ROUND(AVG(d1.customer_pref_delivery_date = d1.order_date) * 100, 2) 
AS immediate_percentage
FROM delivery d1
WHERE d1.order_date = (
    SELECT MIN(d2.order_date)
    FROM delivery d2
    WHERE d2.customer_id = d1.customer_id
);