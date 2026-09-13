SELECT s.student_id, student_name, u.subject_name, COUNT(e.subject_name) AS attended_exams
FROM Students s
CROSS JOIN Subjects u
LEFT JOIN Examinations e
ON s.student_id=e.student_id
AND u.subject_name = e.subject_name
GROUP BY s.student_id, student_name, u.subject_name
ORDER BY s.student_id;