SELECT u.user_id,
(SELECT ROUND(AVG(u2.activity_duration),2)
FROM useractivity u2
WHERE u2.user_id=u.user_id 
AND u2.activity_type='free_trial'
) AS trial_avg_duration,
(SELECT ROUND(AVG(u2.activity_duration),2)
FROM useractivity u2
WHERE u2.user_id=u.user_id  
AND u2.activity_type='paid'
) AS paid_avg_duration
FROM useractivity u
GROUP BY u.user_id
HAVING COUNT(CASE WHEN u.activity_type = 'free_trial' THEN 1 END) > 0
AND COUNT(CASE WHEN u.activity_type = 'paid' THEN 1 END) > 0
ORDER BY u.user_id;