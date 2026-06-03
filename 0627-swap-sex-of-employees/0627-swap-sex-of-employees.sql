-- select id,name,
-- case 
-- when sex='m' then 'f'
-- else 'm'
-- end as sex
-- salary from salary;

update salary 
set sex=case
when sex='m' then 'f'
else 'm'
end;