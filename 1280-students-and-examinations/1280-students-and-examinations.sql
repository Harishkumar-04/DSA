# Write your MySQL query statement below

select s.student_id, s.student_name, sj.subject_name, 
(
select count(e2.student_id) from examinations e2
where s.student_id=e2.student_id and sj.subject_name=e2.subject_name
) as attended_exams
from students s
join subjects sj
left join examinations e
on s.student_id=e.student_id
group by s.student_id, sj.subject_name
order by student_id, sj.subject_name