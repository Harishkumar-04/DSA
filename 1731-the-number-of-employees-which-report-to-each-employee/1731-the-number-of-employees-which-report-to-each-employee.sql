# Write your MySQL query statement below

select reports_to as employee_id, (select e2.name from employees e2 where
e1.reports_to=e2.employee_id) as name, count(reports_to) as reports_count,
round(avg(age),0) as average_age from employees e1
where reports_to is not null
group by reports_to
order by employee_id
