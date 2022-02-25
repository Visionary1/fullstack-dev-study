/*
	클러스터드 인덱스와 논클러스터드 인덱스의 차이
    
    클러스터드 인덱스 (id) , 논클러스터드 인덱스 (index)
    
    정규화 (테이블 설계의 법칙들)
    
    제1 정규화
    제2 정규화
    제3 정규화
    ...
*/

# bad table set 
select * from `user` where `hobby` like "%노래%";

# user table
select * from `user`;

# 제 1 정규화 : 한 컬럼에 여러 값이 들어가는 경우, 한 행에 하나의 값만 들어가도록 한다
insert into `user` (`name`, `yyyymmdd`, `hoby`, `introduce`, `email`);
values
("이름", 12345678, "독서", "안녕하세여", "chanseopKim@icloud.com"),
("이름", 12345678, "독서", "안녕하세여", "chanseopKim@icloud.com"),
("이름", 12345678, "독서", "안녕하세여", "chanseopKim@icloud.com");

# 취미만 따로 저장할 수 있는 테이블을 만드는게 좋을 것 같다 
# 누구의 취미인지 알 수 있어야 한다
# user table : 유일한 사람들의 정보만 저장 1
# hobby table : 어떤 사람의 취미 정보 저장 N

create table `new_user` (
	`id` int not null auto_increment primary key
    , `name` varchar(10) not null
    , `yyyymmdd` char(8) not null
    , `introduce` text
    , `email` varchar(32) not null
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) engine=InnoDB default charset=utf8mb4;

create table `hobby` (
	`id` int not null auto_increment primary key
    , `userId` int not null -- new_user 테이블의 id 필드 값 (pk)
    , `hobby` varchar(50)
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) engine=InnoDb default charset=utf8mb4;

-- 사람정보

insert into `new_user`
(`name`, `yyyymmdd`, `introduce`, `email`)
values
("찬섭", "19960423", "chanseopKim@icloud.com", "안녕하세요. 저는 누구일까요?"),
("야호", "20001020", "yaho@naver.com", "야옹");

select * from `new_user`

-- dummy data
insert into `hobby`
(`userId`, `hobby`)
values
(1, "독서"),
(1, "노래"),
(1, "영화"),
(1, "요가"),
(2, "그루밍"),
(2, "사냥하기"),
(2, "스크래치"),
(2, "노래");


-- 성적(score) 테이블 나누기
--  
-- - 테이블 설계
-- 연습 문제


-- 성적(score) 테이블 나누기
-- 1. 성적 테이블 나누기
-- 현재는 성적관리 테이블에 학생의 이름정보만 포함되어 있다.(동명이인 구분 안되는 상황)
-- 아래와 같이 학생의 정보를 더 추가한다.
-- phoneNumber - 학생의 전화번호
-- email - 학생의 이메일 주소
-- dreamJob - 장래희망
-- 테이블 관리가 좀 더 효율적이도록 테이블을 나누어서 새로 테이블을 만드세요.


select * from `score`

ALTER TABLE `score` ADD COLUMN `phoneNumber` int not null AFTER `name`;

drop table `new_score`

# student
create table `new_student` (
	`id` int not null auto_increment primary key
    , `name` varchar(10) not null -- new_user 테이블의 id 필드 값 (pk)
    , `phoneNumber` varchar(20) not null
    , `email` varchar(50) not null
    , `dreamJob` varchar(10) not null
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) engine=InnoDb default charset=utf8mb4;

# exam info
create table `new_score` (
	`id` int not null auto_increment primary key
    , `studentId` int not null
    , `year` smallint not null
    , `semester` smallint not null
    , `term` varchar(10) not null
    , `subject` varchar(10) not null 
    , `score` smallint not null
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) engine=InnoDb default charset=utf8mb4;


-- 2. Insert
-- 위에 표에 표시된 데이터를 나누어진 테이블에 저장하세요.

insert into `new_student`
(`name`, `phoneNumber`, `email`, `dreamJob`)
values
("유재석", "00000000111", "mc_u@naver.com", "래퍼"),
("조세호", "00000000111", "mc_u@naver.com", "래퍼");

insert into `new_score`
(`studentId`,`year`, `semester`, `term`, `subject`, `score`)
values
("1", 2020, 1, "중간고사", "국어", 80),
("1", 2020, 1, "중간고사", "영어", 95),
("1", 2020, 1, "중간고사", "수학", 90),
("2", 2020, 1, "중간고사", "국어", 85),
("2", 2020, 1, "중간고사", "영어", 90),
("2", 2020, 1, "중간고사", "수학", 70);

select * from `new_score`

-- 3. 성적 출력
select * from `new_score`
where `studentId` = 1;

-- 리뷰(review) 테이블 나누기
 
-- - 테이블 설계
-- 연습 문제
-- 리뷰(review) 테이블 나누기

-- 1. 리뷰 테이블 나누기
-- 현재는 리뷰 테이블에 가게의 이름 정보만 저장되어 있다. 가게 정보를 추가로 등록한다.
-- 추가 저장 정보
-- 가게 전화 번호 (phoneNumber)
-- 가게 주소 (address)
-- 가게 사업자번호 (businessNumber)
-- 가게 소개(introduce)
-- 중복데이터를 줄이고 효율적인 방법으로 테이블을 나누어서 설계하고 생성하세요.

select * from `review`

-- 가게
create table `new_store` (
	`id` int not null auto_increment primary key
    , `store` varchar(10) not null
    , `phoneNumber` varchar(20) not null
    , `address` varchar(50) not null
    , `businessNumber` varchar(20) not null
    , `introduce` varchar(50) not null
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) engine=InnoDb default charset=utf8mb4;

-- insert
insert into `new_store`
(`store`, `phoneNumber`, `address`, `businessNumber`, `introduce`)
values
("교촌치킨", "02-000-0000", "서울시 서초구", "111-111-1111", "항상 맛있는 닭을 선사 합니다"),
("BHC", "02-111-0000", "서울시 서초구", "111-222-1111", "전지현씨 BHC"),
("버거킹", "02-222-1111", "서울시 서초구", "111-222-1111", "맥도날드 가지말고 여기러와요");

-- 가게 리뷰 new_review
create table `new_review` (
	`id` int not null auto_increment primary key
    , `storeId` int not null
    , `menu` varchar(20) not null
    , `userName` varchar(50) not null
    , `point` DECIMAL(2, 1) not null
    , `review` varchar(50)
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) engine=InnoDb default charset=utf8mb4;

-- insert
-- 사실 메뉴도 따로 나누는 게 맞음
insert into `new_review`
(`storeId`, `menu`, `userName`, `point`, `review`)
values
(1, "오리지날콤보", "이병헌", 4.5, "콤보는 항상 진리입니다"),
(1, "오리지날콤보", "맛있으면짖는개", 4.5, "왈왈왈!! 왈왈!"),
(2, "핫후라이드", "전지현", 5.0, ""),
(2, "뿌링클", "이정재", 3.5, "내가 뿌링끌 상인가?"),
(2, "뿌링클", "전지현", 5.0, ""),
(3, "와퍼세트", "이병헌", 4.0, "패티 너무 좋아요");


-- 3. 리뷰 출력
-- 교촌치킨의 리뷰 리스트를 아래와 같은 형태로 출력하세요.
select * from `new_review`
where `storeId` = 1;



-- 홍당무 마켓

-- 저장해야 하는 값
-- 판매자 정보 : 닉네임 , 프사 NULL, 물품 목록
-- 물품 : 제목, 설명, 가격, 판매자 PK (판매자 닉네임, 매너온도, 프사)

-- 판매자
create table `seller`(
    `id` int not null auto_increment primary key
    , `nickname` varchar(20) not null
    , `profileImageUrl` varchar(512)
    , `temperature` DECIMAL(3, 1) not null
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) engine=InnoDB default charset=utf8mb4;

-- 물품 테이블
create table `usedGoods`(
    `id` int not null auto_increment primary key
    , `sellerId` int not null
    , `title` varchar(64) not null
    , `description` varchar(512) not null
    , `price` int not null
    , `pictureUrl` varchar(512)
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) engine=InnoDB default charset=utf8mb4;

insert into `seller` (`nickname`, `profileImageUrl`, `temperature`)
values
("야옹", NULL, 36.5),
("왈왈", NULL, 28.3),
("짹짹", NULL, 48.9);

select * from `seller`;

drop table `usedGoods`;

insert into `usedGoods` (`sellerId`, `title`, `description`, `price`, `pictureUrl`)
values
(1, "플스4팝니다", "쿨거래 하실분들 연락주세요", 100000, ""),
(1, "원피스 팝니다", "살이 빠져서 사이즈가 커져서 못 입습니다", 200000, ""),
(3, "후라다 여성지갑 팝니다", "오늘 선물하려 했는데 헤어졌어요", 200000, null),
(2, "바퀴벌레좀 잡아주세요", "제발 잡아주세요, 못들어가고 있어요", 5000, null);

-- 판매 물품 리스트 
select * from `usedGoods` where `sellerId` = 1;


select * from `usedGoods` where `title` like "바퀴벌레%"; # 셀러 아이디가 2번인 걸 앎
select * from `seller` where `id` = 2;

-- 4. 옵션 리스트까지 과제 ! 

