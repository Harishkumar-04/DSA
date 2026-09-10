SELECT e.employee_id 
FROM Employees e 
LEFT JOIN Employees m 
on e.manager_id=m.employee_id 
where e.salary<30000 
and m.employee_id is null 
and e.manager_id is not null 
order by e.employee_id;

/*
SELECT employee_id
FROM Employees
WHERE salary < 30000
AND manager_id NOT IN (SELECT employee_id FROM Employees)
ORDER BY employee_id;
*/