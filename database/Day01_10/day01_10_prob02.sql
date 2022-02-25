insert into `review`
(`storeName`, `menu`, `userName`, `point`, `review`)
values
("bugerking", "wapper", "lee", 4.0, "fast delivery"),
("kyochon", "origin", "byeong", 4.5, "best, always has been"),
("food", "original", "byeong", 4.5, "best, always has been");

select * from `review`;

alter table `review` modify column `point` decimal(2, 1) not null;

insert into `review`
(`storeName`, `menu`, `userName`, `point`, `review`)
values
("test1", "wapper", "lee", 4.0, null),
("test2", "origin", "byeong", 4.5, null),
("test3", "original", "byeong", 4.5, null);

-- 테이블 전체 조회
select * from `review`; 

-- 선택해서 가져오기 
select `id`, `storeName`, `menu`, `userName`
from `review`

-- 테이블명에 별칭 붙이기: 보기에 바뀌는건 없음
select * from `review` As `reflect`; 

-- 컬럼명에 별칭 붙이기
select `id`, `storeName` As "이름", `menu` As "메뉴"
from `review`; 

-- drop table `table`; -- delte table

-- 특정 컬럼 중복값 제거 ) 동명이인 제거하는 경우
select distinct `storeName` from `review`;

-- 데이터의 개수 조회, 행의 개수
select count(*) from `review`;
select count(`storeName`) from `review;
select count(1) from `review`;

-- 조건에 일치하는 데이터 조회
# id 컬럼이 n번인 데이터를 조회
select * from `review` where `id` = 3; 

# 이름이 ~~~ 인 사용자의 메뉴 조회
select `menu` from `review`
where `storeName` = "스토어네임입니다2";

# 이름이 ~~~ 아닌 사용자의 메뉴 조회
select `menu` from `review`
where `storeName` != "스토어네임입니다2";

# 데이터의 생성일이 특정일 ("2022-01-10 00:00:00") 이후인 데이터드 ㄹ조회
select * from `review`
where `createdAt` > "2022-01-10 00:00:00";

# null 아닌 데이터 조회
select * from `review`
where `menu` is not null;

# id 가 1,3,4 번인 데이터 조회
select * from `review`
where `id` in (1, 3, 4);

-- multiple conditions
select * from `review`
where `id` = 1 or `id` = 3 or `id` = 4;

# 이름이 ~면서 메뉴가 ~ 인 데이터 조회
select * from `review`
where `storeName` = "스토어네임" and `menu` = "유저네임입니다2";







 
