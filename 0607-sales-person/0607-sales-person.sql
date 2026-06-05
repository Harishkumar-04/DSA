select name from salesperson
where sales_id not in(
    select orders.sales_id from orders
    join company on orders.com_id=company.com_id
    where company.name='red'
);

/* using aliases

select s.name from salesperson s
where s.sales_id not in(
    select o.sales_id from orders o
    join company c on o.com_id=c.com_id
    where c.name='red'
);

*/