select `id`, `name`, `subject`, `score`
from `score`;

select `id`, `storeName` As "이름", `menu` As "메뉴"
from `review`; 

select count(`name`) from `score;

-- 컬럼명에 별칭 붙이기
select `name` As "이름", `subject` As "과목", `score` As "성적"
from `score`; 

select `year`, `semester`, `term`, `subject`, `score`
from `score`
where `name` = "유재석";

select * from `score`
where `year` >= 2020;

select * from `score`
where `year` >= 2020 and `semester` = 1 and `term` = "중간고사";

select count(*) from `score`
where `name` = "유재석" and `score` >= 90;