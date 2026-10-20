SELECT machine_id,
ROUND(SUM(IF(activity_type='end',timestamp,-timestamp))/COUNT(DISTINCT process_id),3) as processing_time
FROM Activity
GROUP BY machine_id;