select(
    select num 
    from mynumbers 
    group by num 
    having count(num)=1 
    order by num desc 
    limit 1
    )
    as num;

/*

select max(num) as num from mynumbers 
where num in(
    select num 
    from mynumbers 
    group by num 
    having count(*)=1
    );

*/
