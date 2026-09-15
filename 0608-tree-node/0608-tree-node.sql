SELECT id,
CASE
    WHEN p_id IS NULL THEN 'Root'
    WHEN EXISTS ( 
        SELECT p_id
        FROM Tree t2
        WHERE t.id=t2.p_id
    )THEN 'Inner'
    ELSE 'Leaf'
END AS Type
FROM Tree t;