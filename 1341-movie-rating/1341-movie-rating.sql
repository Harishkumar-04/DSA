# Write your MySQL query statement below

(select title as results
from movies m
join movierating mr
on m.movie_id=mr.movie_id
where year(created_at)=2020 and month(created_at)=2
group by title
order by avg(rating) desc, title
limit 1)

union all

(select name as results
from users u
join movierating mr
on u.user_id=mr.user_id
group by name
order by count(movie_id) desc, name
limit 1)





