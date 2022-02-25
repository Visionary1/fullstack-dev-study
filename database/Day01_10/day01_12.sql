-- limit
-- get first 50

# sakila db 

select * from `city` limit 50;

-- 처음부터 50개

select * from `city` limit 0, 50;


-- 101번째부터 50개 가져오기
select * from `city` limit 100, 50;

-- Like 
-- C 로 시작하는 도시명 찾기
select * from `city`
where `city` like "c%";

-- c로 끝나는 도시명 찾기 -- 권장 안함 (table full scan) 
select * from `city`
where `city` like "%c";
-- "%c%"; 하면 댐!

-- like 대소문자 구별 - binary() 함수 이용
-- c가 들어가는 도시명 찾기
select * from `city` where `city` like "%C%";

# 오름차순
select * from `city`
order by `country_id` asc;

# 내림차순
select * from `city`
order by `country_id` desc;

# city가 c로 시작하는 데이터를 country_id 내림차순 정렬하고 10개만 가져오기
select * from `city`
where `city` like "c%"
order by `country_id` desc 
limit 10;

# concat 함수 -- String을 이어준다
select concat("hello", " world") As str;

select * from `film`;

select concat("제목", `title`, ", 설명: ", `description`) As result
from `film`;


-- 연습 문제
-- 개수 제한, 정렬, 문자열 만들기
-- 1. 개수 제한
-- 10개의 성적 정보만 출력하세요.

select * from `score` limit 10;

-- 2. 정렬하기
-- score를 기준으로 높은 점수부터 모든 행을 내림차순으로 출력하세요.

select * from `score`
order by `score` asc;

-- 3. 조건부 정렬
-- 2020년 1학기 기말고사 중 국어 과목의 시험을 가장 잘본 순서로 정렬하여 모든 필드를 출력하세요.

select * from `score`
where `year` = 2020 AND `semester` = 1 AND `term` = "기말고사" AND `subject` = "국어"
order by `score` desc;

-- 4. 문자열 만들기
-- 성적 테이블 전체 결과를 concat을 활용해서 아래와 같은 형태로 출력하세요.
-- 출력 결과 예

select
	concat(`year`, '년', `semester`, '학기', `term`, ' ', `name`, ' - ', `subject`, `score`, '점') AS score_info
from score


-- 문자열 찾기, 정렬
--  
-- - SELECT와 다양한 문법

/*
1. 문자열 찾기 맛있으면짖는개의 리뷰중 왈왈로 시작하는 리뷰의 전체 필드 정보를 출력하세요.
결과 행 개수
2
*/

select * from `review`
where `userName` = "맛있으면짖는개" AND `review` like "왈왈%";

-- 2. 정렬 하기
-- createAt을 기준으로 최신 10개의 리뷰만 전체 필드 정보를 출력하세요.

select * from `review`
order by `createdAt` desc limit 10;


-- 3. 별점 높은순
-- 교촌치킨의 전체 필드를 별점 높은 순으로 출력하세요.
select * from `review`
where `storeName` = "교촌치킨"
order by `point` desc;


-- 4. 가장 낮은 별점
-- 전체 별점 중 가장 낮은 별점을 준 작성자와 가게명을 출력하세요.

select `userName`, `storeName` from `review`
order by `point`
limit 1;

/*

테이블 생성
*/

create table `entrant` (
	`id` int not null auto_increment primary key,
    `name` varchar(10) not null,
    `license` varchar(20) not null,
    `score` int not null
) engine=innoDB default charset=utf8mb4;

insert into `entrant` (`name`, `license`, `score`)
values
("신보람", "정보처리기사", 87),
("김바다", "컴퓨터활용능력", 95),
("박태형", "정보처리기사", 99),
("박지민", "정보처리기사", 87),
("신보람", "컴퓨터활용능력", 87),
("김남준", "정보처리기사", 87),
("정호석", "컴퓨터활용능력", 99),
("민윤기", "정보처리기사", 100),
("김바다", "정보처리기사", 78),
("김바다", "정보처리기사", 82);

#group by 그룹화 -- 동명이인들을 그룹으로 묶음
select `name` from `entrant`
group by `name`;

-- distinct 중복제거 (ㄹㅇ 중복제거)
select distinct `name` from `entrant`; 


-- 중복제거 (그룹화해서) 
select `license` from `entrant`
group by `license`;

-- 사람 별 응시 시험 개수 구하기 
select `name`, count(*) As count from `entrant`
group by `name`;

-- 자격증 종류별 점수 합계 구하기
select `license`, sum(`score`) As sum from `entrant`
group by `license`;

-- 자격증 종류별 점수 평균 구하기
select `license`, avg(`score`) from `entrant`
group by `license`; 

# having - group by 된 결과에 조건 붙이기
-- 자격증 시험을 2개 이상 응시한 사람으 ㅣ이름 출력
select `name`, count(1) as count from `entrant`
group by `name`
having count(1) >= 2;
-- having count >= 2 로 써도됨, as count 했으면

select `license`, avg(`score`) as `average` from `entrant`
group by 

-- 연습 문제
-- GROUP BY와 HAVING절

-- 1. 그룹별 개수 세기
-- 리뷰 작성자별로 몇 개의 리뷰를 작성했는지 출력하세요.
select * from `review`

select `userName`, count(1) from `review`
group by `userName`;

-- 2. 그룹별 평균 구하기
-- 가게 별 별점의 평균점수를 출력하세요

select `storeName`, avg(`point`) from `review`
group by `storeName`;

-- 3. 그룹 조건
-- 리뷰 작성 건수가 4건 이상인 작성자를 출력하세요.

select `userName`, count(1) from `review`
group by `userName`
having count(1) >= 2;

-- 4. 학생별 평균
-- 2020년 1학기 기말고사 학생별 평균을 출력하세요.

select * from `score`;

select `name`, avg(`score`) from `score`
where `year` = "2020" AND `semester` = 1 AND `term` = "기말고사"
group by `name`;

-- 5. 성적별 평균
-- 2020년 과목별 평균을 출력하세요.

select `subject`, avg(`score`) from `score`
where `year` = "2020"
group by `subject`;

-- 6. 석차 구하기
-- 2020년 모든 시험의 학생별 평균을 구하고 석차 순서로 출력하세요.

select `name`, avg(`score`) as `average` from `score`
where `year` = 2020
group by `name`
order by `average` desc;










