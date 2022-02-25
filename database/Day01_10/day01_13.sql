-- 종합문제
--  
-- - SELECT와 다양한 문법
-- 1. 테이블 생성
-- 위 데이터를 기반으로 테이블을 설계하고 생성하세요.
-- 테이블 이름은 weatherHistory 으로 만드세요.
-- 컬럼 이름은 위 데이터의 괄호안에 단어를 이용하세요.
-- 자동으로 증가하는 id를 만드세요.
-- 생성시간과, 업데이트 시간을 관리하는 컬럼을 포함하세요.
-- 표에 있는 날짜와 생성시간은 따로 만들어 관리하세요.
create table `weatherHistory` (
	`id` int not null auto_increment primary key,
    `date` DATE not null,
    `weather` varchar(10) not null,
    `temperatures` DECIMAL(3, 1) not null, 
    `precipitation` DECIMAL(3, 1) not null,
    `microDust` varchar(10) not null,
    `windSpeed` decimal(4, 1) not null,
    `createdAt` timestamp default CURRENT_TIMESTAMP,
    `updatedAt` timestamp default CURRENT_TIMESTAMP
) engine=innoDB default charset=utf8mb4;

drop table `weatherHistory`;


-- 2. 데이터 저장
-- 생성된 테이블에 위 데이터를 모두 insert 하세요.
insert into `weatherHistory` 
(`date`, `weather`, `temperatures`, `precipitation`, `microDust`, `windSpeed`)
values
("2015-07-01", "비", "21.9", 83.5, "보통", 2.9),
("2015-07-02", "비", "22.6", 59.5, "보통", 2.5),
("2015-07-03", "흐림", "27.4", 0.0, "좋음", 2.9),
("2015-07-04", "맑음", "27.3", 0.0, "좋음", 6.1),
("2015-07-05", "구름조금", "25.3", 0.0, "나쁨", 4.3),
("2015-07-06", "맑음", "23.9", 0.0, "나쁨", 6.5),
("2015-07-07", "맑음", "23.7", 0.0, "좋음", 5.8),
("2015-07-08", "흐림", "23.3", 0.0, "좋음", 5.4),
("2015-07-09", "비", "20.8", 4.0, "보통", 4.0),
("2015-07-10", "비", "23.7", 6.5, "보통", 2.5),
("2015-07-11", "비", "26.8", 3.0, "좋음", 4.7),
("2015-07-12", "비", "26.6", 1.0, "나쁨", 5.4),
("2015-07-13", "구름조금", "27.3", 0.0, "최악", 6.5),
("2015-07-14", "맑음", "27.9", 0.0, "보통", 6.8);

select * from `weatherHistory`


-- 3. 가장 높은 기온
-- 기온이 가장 높은 날의 정보를 출력하세요.
select `date`, `weather`, `temperatures` from `weatherHistory`
order by `temperatures` desc limit 1;


-- 4. 날씨 카운트
-- 날씨의 종류 별로 각각 며칠이 존재하는지 구하고, 많은 순서대로 출력하세요.
-- 출력 컬럼은 아래 출력 예시를 참조하세요.
select `weather`, count(1) from `weatherHistory`
group by `weather`
order by count(1) desc;

-- 5. 미세먼지와 강수량
-- 미세먼지 상태 별 평균 강수량을 출력하세요.
-- 단, 강수량이 없는 경우 출력하지 마세요.
-- 출력 컬럼은 아래 출력 예시를 참조하세요.
select `microDust`, avg(`precipitation`) from `weatherHistory`
group by `microDust`
having avg(`precipitation`) > 0;

-- 6. 미세먼지 와 풍속
-- 미세먼지 상태 별로 평균 풍속을 구하고 평균 풍속이 높은 순으로 출력하세요.
-- 단, 평균 풍속이 4.0km/h 이상인 정보만 출력 하세요.
-- 출력 컬럼은 아래 출력 예시를 참조하세요.
select `microDust`, avg(`windSpeed`) from `weatherHistory`
group by `microDust`
having avg(`windSpeed`) >= 4.0
order by avg(`windSpeed`) desc;

-- 테이블 생성하며 인덱스 등록하기
create table `student` (
	`id` int not null auto_increment,
    `name` char(4) not null,
    `address` varchar(50) not null,
    `department` enum("국문과", "영문과", "컴퓨터공학과", "전자공학과", "물리학과") not null,
    `introduction` text not null,
    `studentId` char(100) not null,
    primary key (`id`),
    unique key `idx_studentId` (`studentId`) using btree,
    key `idx_department` (`department`),
    key `idx_department_address` (`department`, `address`)
) engine=InnoDb default charset=utf8mb4;

drop table `student`

create table `student` (
	`id` int not null auto_increment,
    `name` char(4) not null,
    `address` varchar(50) not null,
    `department` enum("국문과", "영문과", "컴퓨터공학과", "전자공학과", "물리학과") not null,
    `introduction` text not null,
    `studentId` char(100) not null,
    primary key (`id`)
) engine=InnoDb default charset=utf8mb4;

# unique key 추가 - studentId 컬럼에는 중복값이 들어갈 수 없다
alter table `student` add unique index `idx_studentId` (`studentId`) using btree;

# 일반 인덱스 추가
alter table `student` add index `idx_department` (`department`)

# 일반 복합 인덱스 추가
alter table `student` add index `idx_department_address` (`department`, `address`)

-- 인덱스 좀 공부해봐야 할 듯 dyor

select * from `customer`;

-- 인덱스가 없는 컬럼 like (~로 시작하거나, ~로 끝나거나 := like~ ~) 
select * from `customer` where `first_name` like "a%";

explain select * from `customer` where `first_name` like "A%";
explain select * from `customer` where `first_name` like "%A";
explain select * from `customer` where `first_name` like "%A%";
-- type, rows 를 보면 되는데
/*
	type ALL 은 full scan - ㅆㅎㅌㅊ 효율성
    ALL 로 나오면 ㄹㅇ 잘 못 짠 쿼리문이다
    코드 최적화가 ㅆㅎㅌㅊ인거
    데이터 테이블 크기가 작으면 상관은 없음, 커질 때 문제임
*/ 

explain select * from `customer` where `last_name` like "A%"; # range scan - ㅍㅌㅊ최적화, 효율성

explain select * from `customer` where `last_name` like "%A"; # full scan ㅆㅎㅌㅊ 효율성

explain select * from `customer` where `last_name` like "%A%"; # full scan ㅆㅎㅌㅊ 효율성

# pk 로 값 조회
select * from `customer` where `customer_id` = 3;
# const 로 나옴 Pk는 


# index 가 없는 컬럼값 조회 : full scan ㅆㅎㅌㅊ
explain select * from `film` where `length` = 100;

# index 가 있는 값 조회 : ref ㅍㅅㅌㅊ
select * from `customer` where `store_id` = 2;

# pk 로 범위 조회 : range ㅍㅌㅊ
explain select * from `film` where `film_id` < 10;

# range ㅍㅌㅊ
explain select * from `film` where `film_id` < 1000;

# index 가 없는 컬럼 범위 조회 -- full scan
explain select * from `film` where `length` < 50;


-- length 컬럼 Index 추가
alter table `film` add index `idx_length` (`length`);

-- index 로 범위 조회

# range
explain select * from `film` where `length` < 50;

-- 인덱스 추가해놨는데 옵티마이저는 풀스캔하기로 결정한다 , 데이터가 좀 적기에 통계적으로 이게 더 유리할 것으로 판단한 듯.  
explain select * from `film` where `length` < 100;

# 인덱스 삭제하기
alter table `film` drop index `idx_length`;


-- 실행 계획 확인과 인덱스 설정
--  
-- - INDEX
-- 연습 문제
-- 실행 계획 확인과 인덱스 설정
-- 리뷰 테이블을 이용해서 아래 문제를 풀어보세요.

-- 1. 실행 계획 확인
-- 아래와 같은 예시의 데이터의 조회가 가장 많이 이루어진다.


-- 해당하는 쿼리를 작성해서 실행계획을 확인해 보세요.

-- 이정재가 작성한 리뷰 리스트
explain select * from `review` where `userName` = "이정재";

-- 별점이 3.0 이하의 별점 중 이병헌이 작성한 리뷰 리스트 
explain select * from `review` where `point` <= 3.0 AND `userName` = "이병헌";

-- 교촌치킨의 4.0 이상의 별점 리뷰 리스트
select * from `review` where `storeName` = "교촌치킨" AND `point` >= 4.0;

-- 가게별 별점 평균
explain select `storeName`, avg(`point`) from `review`
group by `StoreName`;

-- add index
alter table `review` add index `idx_userName` (`userName`);
alter table `review` add index `idx_storeName` (`storeName`);

/*
	클러스터드 인덱스와 논클러스터드 인덱스의 차이
    
    클러스터드 인덱스 (id) , 논클러스터드 인덱스 (index)
    
    
	
*/
 





 




