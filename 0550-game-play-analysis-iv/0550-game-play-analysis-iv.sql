SELECT ROUND(COUNT(a.player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity),2)
AS fraction
FROM Activity a
JOIN (
    SELECT player_id, MIN(event_date) as first_date
    FROM Activity
    GROUP BY player_id
) f
ON a.player_id=f.player_id
AND DATEDIFF(a.event_date, f.first_date) = 1;

/*
SELECT ROUND(
    COUNT(a.player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity),
    2
) AS fraction
FROM Activity a
WHERE DATEDIFF(
    a.event_date,
    (
        SELECT MIN(a2.event_date)
        FROM Activity a2
        WHERE a2.player_id = a.player_id
    )
) = 1;
*/
   