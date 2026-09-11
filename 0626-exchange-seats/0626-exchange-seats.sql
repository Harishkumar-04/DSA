SELECT id,
CASE
    WHEN id=(SELECT MAX(id) FROM Seat) AND id%2=1 THEN student
    WHEN id%2=1 THEN LEAD(student) OVER (ORDER BY id)
    ELSE LAG(student) OVER (ORDER BY id)
END AS student
FROM Seat;