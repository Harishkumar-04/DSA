/*
select p.product_name, sum(o.unit) as unit from products p join orders o on p.product_id=o.product_id where o.order_date like '2020-02-%' group by p.product_id having unit>=100;
*/

select p.product_name, sum(o.unit) as unit from products p 
join orders o on p.product_id=o.product_id 
where year(o.order_date)=2020 AND month(o.order_date)=2 
group by p.product_id,p.product_name
having unit>=100;