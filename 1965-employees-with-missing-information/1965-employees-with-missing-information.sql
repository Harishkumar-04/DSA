# Write your MySQL query statement below

select employee_id
from (select e.employee_id 
from employees e

union all

select s.employee_id
from salaries s
) as a
group by employee_id
having count(*)<2
order by employee_id;