SELECT d.name as Department, e.name as Employee, e.salary as Salary 
from Department d 
left join Employee e 
on d.id=e.departmentId 
WHERE e.salary = (
    SELECT MAX(e2.salary)
    FROM Employee e2
    WHERE e.departmentId=e2.departmentId 
)

/*
SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM Employee e, Department d
WHERE e.departmentId = d.id
  AND e.salary = (
      SELECT MAX(e2.salary)
      FROM Employee e2
      WHERE e.departmentId=e2.departmentId 
  );
*/

/*
SELECT Department.name AS Department ,Employee.name AS Employee, Employee.salary
FROM Department  JOIN Employee  ON Employee.departmentId=Department.id 
WHERE(departmentId, salary) IN
(SELECT departmentId,MAX(salary) FROM Employee GROUP BY departmentId) ;
*/

/*
SELECT Department, Employee, Salary
FROM (
    SELECT d.name AS Department,
           e.name AS Employee,
           e.salary AS Salary,
           DENSE_RANK() OVER (
               PARTITION BY d.id
               ORDER BY e.salary DESC
           ) AS rnk
    FROM Department d
    JOIN Employee e
        ON d.id = e.departmentId
) t
WHERE rnk = 1;
*/