-- 1. 별점 조건
-- 별점이 3.0 이하인 리뷰의 모든 필드를 출력하세요.
-- 결과 행 개수
-- 4
select * from `review`
where `point` <= 3.0;

-- 2-- . 복합 조건
-- -- 교촌치킨의 리뷰내용이 있는 행만 출력하세요.
-- -- 메뉴, 리뷰내용, 별점만 출력하세요.
-- -- 결과 행 개수
-- -- 3
select * from `review`
where `storeName` = "교촌치킨" and `review` is not null;

-- 3. 개수 세기
-- 전지현이 BHC 를 총 몇 번 시켰는지 출력하세요.
-- 결과
-- 4
select count(1) As count from `review`
where `userName` = "전지현" and `storeName` = "BHC";


-- 4. 날짜 조건
-- 강동원의 리뷰중 2025-03-10 이후(3월 11일부터) 행의 모든 필드를 출력하세요.
-- 결과 행 개수

-- 1
select * from `review`
where `userName` = "강동원" and `createdAt` > "2025-03-11 00:00:00";

-- 5. 복합 조건
-- 이정재의 리뷰중에 리뷰내용이 있거나 별점이 4.5 이상인 모든 필드를 출력하세요.
-- 결과 행 개수

-- 5
select * from `review`
where `userName` = "이정재" and (`review` is not null or `point` >= 4.5);

/*
id가 4인 데이터의 email 주소를 aaa@gmial.com 으로 변경하기
*/
select * from `user`;
update `user`
set
`email` = `aaa@gmail.com`,
`updatedAt` = now()
where `id` = 4;

# id 가 2인 데이터의 취미를 '맛집탐방', 자기소개 '강남 맛집 전문가' 변경
update `user`
set
`hobby` = '맛집탐방',
`introduce` = '강남 맛집 전문',
`updatedAt` = now()
where `id` = 2;

/*
연습 문제
UPDATE - 점수 업데이트
*/
-- 1. 점수 업데이트
-- id가 5인 행의 점수를 100 으로 수정하세요.

select * from `score`;

update `score`
set
`score` = 100,
`updatedAt` = now()
where `id` = 5;

-- 2. 점수 업데이트
-- 이광수의 2019년 2학기 수학 성적으로 85로 수정하세요.

update `score`
set
`score` = 85,
`updatedAt` = now()
where 
	`year` = 2019 
    and `semester` = 2 
    and `subject` = "수학";

-- 리뷰 관리 테이블(review)을 이용해서 아래 문제를 풀어 보세요.
-- 3. 리뷰내용 추가
-- id 가 10인 행의 리뷰 내용을 아래 내용으로 추가하세요.
-- 역시 치킨은 BBQ 인정!
select * from `review`;

update `review`
set
`review` = "역시 치킨은 BBQ 인정!",
`updatedAt` = now()
where `id` = 10;

-- 4. 일괄 변경
-- id 가 8인 행의 별점을 4.8 로 바꾸고 리뷰내용을 아래 내용으로 수정하세요
-- 식어도 맛있어요!!

update `review`
set
	`point` = 4.8,
	`review` = "식어도 맛있어요!!",
	`updatedAt` = now()
where `id` = 8;

-- id가 1인 데이터 삭제하기
select * from `user` where `id` = 1;
delete from `user` where `id` = 1;

# 테이블 내용 전체 삭제
delete from `user`;

# 전체 삭제, 초기화
truncate table `user`;

-- 1. 데이터 삭제
-- id가 16 리뷰 행을 삭제하세요.
select * from `review`;

select * from `review` where `id` = 16;
delete from `review` where `id` = 16;

-- 2. 조건 삭제
-- 이정재의 리뷰중 2점 미만의 리뷰를 삭제하세요.

select * from `review` where `userName` = "이정재" and `point` < 2.0;

delete from `review` where `userName` = "이정재" and `point` < 2.0;

-- 2. Query 종합문제

-- 1. 테이블 생성
-- 위 데이터를 기반으로 테이블을 설계하고 생성하세요.
-- 테이블 이름은 booking 으로 만드세요.
-- 컬럼 이름은 위 데이터의 괄호안에 단어를 이용하세요.
-- 자동으로 증가하는 id를 만드세요.
-- 생성시간과, 업데이트 시간을 관리하는 컬럼을 포함하세요.

drop table `booking`;

CREATE TABLE `booking` (
    `id` int NOT NULL AUTO_INCREMENT primary key,
    `name` varchar(10) NOT NULL,
    `headcount` smallint NOT NULL,
    `day` smallint NOT NULL,
    `date` DATE NOT NULL,
    `phoneNumber` varchar(20) NOT NULL,
    `state` varchar(10) NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- 2. 데이터 저장
-- 생성된 테이블에 위 데이터를 모두 insert 하세요.

select * from `booking`;

INSERT INTO `booking`
(`name`, `headcount`, `day`, `date`, `phoneNumber`, `state`)
VALUES
("강하늘", 2, 1, "2025-07-21", "010-1234-1111", "대기중"),
("김종국", 4, 1, "2025-08-04", "010-1212-2121", "확정"),
("박명수", 2, 4, "2025-06-12", "010-0000-0000", "취소"),
("마동석", 2, 1, "2025-10-30", "010-1010-0101", "대기중"),
("박나래", 10, 3, "2025-06-23", "010-1111-2222", "확정"),
("혜리", 2, 2, "2025-04-12", "010-9999-9999", "확정"),
("황찬성", 25, 1, "2025-09-11", "010-0000-2222", "확정"),
("탁재훈", 4, 3, "2025-07-12", "010-1111-0000", "대기중"),
("장나라", 2, 1, "2025-09-12", "010-1111-0000", "확정");

-- 3. 날짜 조건
-- 2025 년 8월 부터 예약된 예약내역을 모두 출력하세요.
-- 출력 컬럼은 아래 출력 예시-- 를 참조하세요.

-- name	date	state
-- 김종국	2025-08-04	확정
-- 마동석	2025-10-30	대기중
-- 황찬성	2025-09-11	확정
-- 장나라	2025-09-12	확정

select `name`, `date`, `state` from `booking`
where `date` >= "2025-08-01";

-- 4. 복합 조건
-- 예약상태가 확정 인 내역중에 숙박인원이 4명 이상이거나 숙박일수가 2일 이상인 경우를 모두 출력하세요.
-- 출력 컬럼은 아래 출력 예시를 참조하세요.
-- 출력 예시

-- name	headcount	day	state
-- 김종국	4	1	확정
-- 박나래	10	3	확정
-- 혜리	2	2	확정
-- 황찬성	25	1	확정

select `name`, `headcount`, `day`, `state` from `booking`
where `state` = "확정" and (`headcount` >= 4 or `day` >= 2);

-- 5. 카운트
-- 숙박일수가 1일이고 예약상태가 대기중인 내역의 개수를 출력하세요.
-- 결과
-- 2
select count(*) from `booking`
where `day` = 1 and `state` = "대기중";

-- 6. 예약 상태 변경
-- 마동석과 탁재훈의 예약 상태를 취소로 변경하세요.
update `booking`
set
`state` = "취소"
where `name` = "마동석" or `name` = "탁재훈";

-- 7. 취소 삭제
-- 예약상태가 취소인 내역을 모두 삭제하세요.

delete from `booking` where `state` = "취소";











 


