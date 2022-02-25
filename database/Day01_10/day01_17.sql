-- 테이블 설계 - 부동산 매물
-- - 테이블 설계

-- 1. 부동산 매물 테이블 만들기
-- 공인중개사에서 등록한 부동산(real estate) 매물을 관리하는 테이블들을 설계하고 만드세요.
-- 아래의 정보를 통해 두 개의 테이블로 설계하고 만드세요.

-- 여러개의 공인중개사 사무실(realtor)이 있고, 
CREATE TABLE `realtor` (

	-- 공인중개 사무실 이름 (office)
	`id` INT NOT NULL auto_increment PRIMARY KEY

	-- 공인중개 사무실 연락처 (phoneNumber)
	,`office` VARCHAR(20) NOT NULL

	-- 공인중개 사무실 주소(address)
	,`phoneNumber` VARCHAR(20) NOT NULL

	-- 공인중개 사무실 주소(address)
	,`address` VARCHAR(50) NOT NULL
    
	-- 공인중개 등급 (grade) : '프리미엄중개사' 또는 '안심중개사' 또는 '일반중개사'
	,`grade` VARCHAR(7) NOT NULL
) engine = InnoDB DEFAULT charset = utf8mb4;

-- 공인중개사에서 등록한 매물 정보(real estate) 들이 저장된다
CREATE TABLE `real_estate` (
	`id` INT NOT NULL auto_increment 

	-- realtor ID 공인중개사 사무실 id
    ,`realtorID` INT NOT NULL PRIMARY KEY

	-- 매물 주소(address)
	,`address` VARCHAR(50) NOT NULL

	-- 매물 면적(area) : 평방 미터
	,`area` SMALLINT NOT NULL

	-- 거래 종류 (type) : '매매' 또는 '전세' 또는 '월세'
	,`type` VARCHAR(2) NOT NULL

	-- 거래 가격 (price) :
	-- 단위 만원매매인경우 거래 가격 의미
	-- 전세 혹은 월세 인경우 보증금을 의미
	,`price` INT NOT NULL
    
	-- 월세 (rentPrice) : 
	-- 단위 만원
	-- 매매 또는 전세인경우 값 없음
	,`rentPrice` INT
) engine = InnoDB DEFAULT charset = utf8mb4;


-- 2. 정보 입력
-- 생성한 테이블에 아래 정보를 적절히 저장하세요.

-- id   office      phoneNumber     address         grade	    address	                    area    type	price	rentPrice
-- 1    황금부동산     02-300-2000     서울시 동작구      안심중개사	 레미얀 레이크 아파트 301동 905호   84	    전세	 40000      NULL
-- 2	대박공인중개사  02-000-7777     서울시 서초구	   일반중개사     레알편한세상 시티 505동 101호     110      매매	 120000	    NULL
-- 3	황금부동산     02-300-2000	   서울시 동작구	  안심중개사	 롱데캐슬 101동 402호            87      월세	  20000	     200
-- 4	황금부동산     02-300-2000	   서울시 동작구	  안심중개사	 슼뷰 오피스텔 1210호             55      월세	   10000	  100
-- 5	대박공인중개사  02-000-7777     서울시 서초구	   일반중개사	  푸르지용 리버 203동 804호        123	    매매    170000	    NULL

-- 공인중개사 사무실
INSERT INTO `realtor` (`office`, `phonenumber`, `address`, `grade`)
VALUES ("황금부동산", "02-300-2000", "서울시 동작구", "안심중개사"),
       ("대박공인중개사", "02-000-7777", "서울시 서초구", "일반중개사");

-- 매물 정보
INSERT INTO `real_estate` (`realtorid`, `address`, `area`, `type`, `price`, `rentprice`)
VALUES (1, "레미얀 레이크 아파트 301동 905호", 84, "전세", 40000, NULL),
       (2, "레알편한세상 시티 505동 101호", 110, "매매", 120000, NULL),
       (1, "롱데캐슬 101동 402호", 87, "월세", 20000, 200),
       (1, "슼뷰 오피스텔 1210호", 55, "월세", 10000, 100),
       (2, "푸르지용 리버 203동 804호", 123, "매매", 170000, NULL);


-- 3. 매물 찾기
-- 황금 부동산의 월세 매물의 아래 정보를 출력하세요.
-- 공인중개 사무실, 공인중개 사무실 연락처, 매물 주소, 보증금, 월세

-- SELECT * FROM `real_estate` WHERE `realtorid` = 1 AND `type` = "월세";
-- SELECT * FROM `realtor` WHERE `office` = "황금부동산";

SELECT
firm.office, -- 공인중개 사무실
firm.phoneNumber, -- 공인중개 사무실 연락처
house.address, -- 매물 주소
house.price, -- 보증금
house.rentPrice -- 월세
FROM realtor AS firm
JOIN real_estate AS house ON firm.id = house.realtorID
WHERE firm.office = "황금부동산" AND house.type = "월세";

-- select "황금부동산", "010-0000-0000", `address`, `price`, `rentPrice` from `real_estate`;


-- 4. 옵션 리스트
-- 매물의 옵션정보를 저장하는 테이블을 만드세요.
-- 옵션 종류
-- 에이컨, 세탁기, 냉장고, 옷장
-- 매물 정보와 연결되도록 테이블을 설계하고, 데이터를 넣어보세요.

CREATE TABLE `options` (
	`id` INT NOT NULL auto_increment PRIMARY KEY

	-- real estate ID 매물 ID
    ,`estateID` INT NOT NULL

	-- 에이컨
	,`ac` BOOLEAN NOT NULL

	-- 세탁기
	,`washer` BOOLEAN NOT NULL

	-- 냉장고
	,`fridge` BOOLEAN NOT NULL

	-- 옷장
	,`closet` BOOLEAN NOT NULL
) engine = InnoDB DEFAULT charset = utf8mb4;

-- it's better not to change table, hence ...

drop table options

 CREATE TABLE `options` (
	`id` INT NOT NULL auto_increment PRIMARY KEY

	-- real estate ID 매물 ID
    ,`estateID` INT NOT NULL
    
    -- options
    , `options` varchar(50) NOT NULL
) engine = InnoDB DEFAULT charset = utf8mb4;

INSERT INTO `options` (`estateID`, `options`)
VALUES  (1, "ac"),
		(1, "washer"),
        (2, "fridge"),
        (2, "closet"),
        (3, "ac");
        
select * from `options`;

-- INSERT INTO `options` (`estateID`, `ac`, `washer`, `fridge`, `closet`)
-- VALUES (1, TRUE, TRUE, TRUE, TRUE),
-- 	   (2, FALSE, TRUE, TRUE, TRUE),
-- 	   (3, FALSE, FALSE, TRUE, TRUE),
-- 	   (4, FALSE, FALSE, FALSE, TRUE),
-- 	   (5, FALSE, FALSE, FALSE, FALSE);

-- 테이블 출력
-- SELECT *
-- FROM real_estate,
--      OPTIONS
-- WHERE real_estate.id = options.estateID;

# join
-- join 하지 않는 경우
-- 판매 물폼 리스트 가져오기
select * from `seller` where `nickname` = "야옹";
select * from `usedGoods` where sellerId = 1;

-- 1 (판매자) : N (판매 물품) 관계 
# join
select `seller`.*, `usedGoods`.* from `seller` join `usedGoods` on seller.id = usedGoods.sellerId
where `seller`.`nickname` = "야옹";

# 테이블 별명 붙이기
select A.*, B.*
from `seller` As A
join `usedGoods` As B
on A.id = B.sellerId;

# inner join : 테이블의 교집함
# 판매 물품 리스트 가져오기
select A.*, B.*
from `seller` AS A
inner join `usedGoods` AS B
on A.id = B.sellerId
where A.nickname = "왈왈";

-- 없으면 당연히 안 나오고 
select A.*, B.*
from `seller` AS A
inner join usedGoods AS B
on A.id = B.sellerId
where A.nickname = "누구야";

# left join (outer join) 좌측 테이블 전체 - 우측 테이블 Null 허용
select A.*, B.*
from `seller` AS A
left join `usedGoods` AS B
on A.id = B.sellerId;

# right join(outer) : 좌측 테이블 null 허용 - 우측 테이블 전체
select A.*, B.*
from `usedGoods` AS A
right join `seller` AS B
on A.sellerId = B.id;

select A.nickname, A.temperature
from `seller` AS A
left join `usedGoods` AS B
on A.id = B.sellerId
where B.title like "바퀴벌레%";

-- 연습 문제
-- JOIN (1) 

-- 리뷰 테이블을 통해서 아래 문제들을 풀어보세요.
-- 기존 테이블을 삭제하고 아래 CREATE 문을 통해서 테이블을 분석하고, 이를 통해서 테이블을 생성하세요.

drop table new_review;
drop table store;

CREATE TABLE `new_review` (
    `id` int NOT NULL AUTO_INCREMENT primary key,
    `storeId` int NOT NULL,
    `menu` varchar(32) NOT NULL,
    `userName` varchar(32) NOT NULL,
    `point` decimal(2,1) DEFAULT 3.5,
    `review` varchar(256),
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `store` (
    `id` int NOT NULL AUTO_INCREMENT primary key, 
    `name` varchar(32) NOT NULL,
    `phoneNumber` varchar(16) NOT NULL,
    `address` varchar(64) NOT NULL, 
    `businessNumber` varchar(32) NOT NULL,
    `introduce` text, 
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `store` (
    `name`, `phoneNumber`, `address`, `businessNumber`, `introduce`, `createdAt`, `updatedAt`
)
VALUES ("교촌치킨", '02-000-0000', '서울시 서초구', '111-111-1111', '항상 맛있는 닭을 선사 합니다.', now(), now()),
("BHC", '02-111-0000', '서울시 서초구', '111-222-1111', '전지현씨 BHC', now(), now()),
("버거킹", '02-222-1111', '서울시 서초구', '333-222-12222', '맥도날드 가지말고 여기로와요', now(), 
now()),
("도미노피자", '02-222-2222', '서울시 서초구', '111-222-12222', '방문포장 반값!!!', now(), 
now()),
("피자알볼로", '02-000-1111', '서울시 서초구', '123-010-12222', NULL, now(), 
now()),
("할머니순대국", '02-123-4567', '서울시 서초구', '100-200-14000', '12시간 푹고은 육수', now(), 
now()),
("배달삼겹", '02-222-8888', '서울시 서초구', '333-5454-9999', '우리돼지 한돈만 사용합니다!!', now(), 
now()),
("가장맛있는족발", '02-012-8080', '서울시 서초구', '133-253-1243', '리뷰이벤트 막국수 드려요!!', now(), now());

INSERT INTO `new_review` (
    `storeId`, `menu`, `userName`, `point`, `review`, `createdAt`, `updatedAt`
) VALUES (1, '오리지날 콤보', '이병헌', 4.5, '콤보는 항상 진리입니다.', now(), now()),
(2, '핫후라이드', '전지현', 5, NULL, now(), now()),
(2, '뿌링클', '이정재', 3.5, '내가 뿌링클 상인가?', now(), now()),
(3, '와퍼세트', '이병헌', 4.0, '패티 너무좋아요', now(), now()),
(1, '오리지날 콤보', '맛있으면짖는개', 4.5, '왈왈왈!! 왈왈!', now(), now()),
(2, '뿌링클', '전지현', 5, NULL, now(), now()),
(8, '족발(앞다리)', '이병헌', 4.5, '막국수 서비스 좋아요!', now(), now()),
(7, '삼겹혼밥세트', '정우성', 4.0, '항상 맛있어요 같이오는 김치찌개 짱맛', now(), now()),
(2, '마쵸킹', '전지현', 5, NULL, now(), now()),
(1, '오리지날 콤보', '정우성', 4.5, NULL, now(), now()),
(4, '도미노피자', '이정재', 4.5, '피자알볼로보다 맛있어요', now(), now()),
(5, '피자알볼로', '이정재', 4.5, '도미노피자 보다 맛있어요', now(), now()),
(7, '삼겹혼밥세트', '이병헌', 4.0, NULL, now(), now()),
(8, '매운족발', '정우성', 4.5, '메뉴가 반반족발로 잘못왔어요. 맛있어서 그냥 먹었어요', now(), now()),
(7, '삽겹이인세트', '이정재', 1.5, '다탔어!! XX 열받네', now(), now()),
(5, '피자알볼로', '맛있으면짖는개', 3.0, '....', now(), now()),
(2, '뿌링클', '전지현', 5, NULL, now(), now()),
(8, '족발(앞다리)', '이병헌', 4.5, '빠른배달 칭찬해!', now(), now()),
(7, '목살 고기만', '이정재', 2.0, '고기가 덜익어서 왔어요!', now(), now()),
(4, '도미노피자', '맛있으면짖는개', 4.5, '왈왈왈!! 왈왈!!', now(), now()), 
(8, '반반족발', '이병헌', 3.5, NULL, now(), now());


-- 1. INNER JOIN
-- 두 테이블을 JOIN문을 이용해서 아래와 같은 형태로 출력하세요.

-- name		phoneNumber		menu		userName	point	review
-- 교촌치킨	02-000-0000		오리지날 콤보	이병헌		4.5		콤보는 항상 진리입니다.
-- BHC		02-111-0000		핫후라이드		전지현		5.0		NULL
-- BHC		02-111-0000		뿌링클		이정재		3.5		내가 뿌링클 상인가?

select store.name, store.phoneNumber, review.menu, review.userName, review.point, review.review
from `store` As store
join `new_review` As review
on store.id = review.storeId;

-- 2. LEFT JOIN
-- LEFT 조인을 사용하여 아래와 같은 형태로 출력하세요.

-- name		phoneNumber		menu		userName	point	review
-- 교촌치킨	02-000-0000		오리지날 콤보	이병헌		4.5		콤보는 항상 진리입니다.
-- 교촌치킨	02-000-0000		오리지날 콤보	맛있으면짖는개	4.5		왈왈왈!! 왈왈!
-- .					
-- .					
-- 할머니순대국	02-123-4567		NULL		NULL		NULL	NULL
-- .					
-- .					
-- 배달삼겹	02-222-8888		삼겹혼밥세트	정우성		4.0		항상 맛있어요 같이 오는 김치찌개 짱맛

select store.name, store.phoneNumber, review.menu, review.userName, review.point, review.review
from store as store
left join new_review as review
on store.id = review.storeId;

-- 3. 낮은 리뷰 추출
-- 배달삼겹 가게의 3.0 미만의 별점 리뷰를 올림차순으로 출력하세요.
-- 출력 컬럼은 메뉴, 작성자, 별점, 리뷰내용 입니다.
-- 결과 행 개수
-- 2

select review.menu, review.userName, review.point, review.review
from store as store
join new_review as review
on store.id = review.storeId
where store.name = "배달삼겹" AND review.point < 3.0
order by review.point asc;


-- 4. 리뷰내용 있는 리스트
-- 이병헌의 리뷰중 4.5 이상이고 리뷰내용이 존재하는 리뷰만 출력하세요.
-- 출력 컬럼은 가게이름, 메뉴, 별점, 리뷰내용 입니다.
-- 결과 행 개수
-- 3

select store.name, review.menu, review.point, review.review
from store as store
join new_review as review
on store.id = review.storeId
where review.userName = "이병헌" AND review.point >= 4.5 AND review.review is not null;


-- 5. 맛집 랭킹
-- 별점 평균이 높은 순서로 5개만 출력하세요.
-- 출력 컬럼은 가게이름, 가게전화 번호, 평균별점 입니다.
-- 결과

-- name			phoneNumber		averagePoint
-- BHC			02-111-0000		4.70000
-- 교촌치킨		02-000-0000		4.50000
-- 도미노피자		02-222-2222		4.50000
-- 가장맛있는족발	02-012-8080		4.25000
-- 버거킹			02-222-1111		4.00000

select store.name, store.phoneNumber, avg(review.point)
from store as store
join new_review as review
		on store.id = review.storeId
# store.name 보다 id 가 더 정확함, 이름이 겹칠 수 있으니
group by store.id
order by avg(review.point) desc limit 5;


-- 연습 문제
-- JOIN (2)

-- 부동산 테이블을 통해서 아래 문제들을 풀어보세요.

-- 기존 테이블을 삭제하고 아래 CREATE 문을 통해서 테이블을 분석하고, 이를 통해서 테이블을 생성하세요.

drop table real_estate;
drop table realtor;

CREATE TABLE `real_estate` (
    `id` int NOT NULL AUTO_INCREMENT primary key,
    `realtorId` int NOT NULL,
    `address` varchar(64) NOT NULL,
    `area` int NOT NULL,
    `type` char(2) NOT NULL,
    `price` int NOT NULL,
    `rentPrice` int,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `realtor` (
    `id` int NOT NULL AUTO_INCREMENT primary key,
    `office` varchar(16) NOT NULL,
    `phoneNumber` varchar(16) NOT NULL,
    `address` varchar(64) NOT NULL,
    `grade` varchar(8) NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `realtor` 
(`office`, `phoneNumber`, `address`, `grade`, `createdAt`, `updatedAt`)
VALUES 
('황금부동산', '02-300-2000', '서울시 서초구', '안심중개사', now(), now()),
('대박공인중개사', '02-000-7777', '서울시 동작구', '일반중개사', now(), now()), 
('굿모닝부동산', '02-999-1111', '서울시 강남구', '안심중개사', now(), now()), 
('희망공인중개사', '02-222-0909', '서울시 송파구', '일반중개사', now(), now()),
('럭키공인중개사', '02-777-7777', '서울시 동작구', '일반중개사', now(), now()),
('믿음부동산', '02-333-9999', '서울시 서초구', '프리미엄중개사', now(), now());

SELECT * FROM `realtor`;

INSERT INTO `real_estate` 
(`realtorId`, `address`,  `area`, `type`, `price`, `rentPrice`, `createdAt`, `updatedAt`)
VALUES 
(1, '레이얀 레이크 아파트 301동 905호', 84, '전세', 40000, NULL, now(), now()),
(5, '레알편한세상 시티 505동 101호', 110, '매매', 120000, NULL, now(), now()), 
(1, '롱데캐슬 101동 402호', 87, '월세', 20000, 200, now(), now()), 
(5, '슼뷰 오피스텔 1210호', 55, '월세', 10000, 100, now(), now()), 
(2, '푸르지용 파크 701동 2104호', 97, '매매', 90000, NULL, now(), now()),
(1, '굿타워 오피스텔 804호', 65, '전세', 20000, NULL, now(), now()), 
(4, '미래 홈타운 103동 104호', 88, '전세', 65000, NULL, now(), now()),
(2, '강남 헤리티지 시티 902동 606호', 90, '매매', 130000, NULL, now(), now()), 
(4, '푸르지용 리버 203동 804호', 123, '매매', 170000, NULL, now(), now()),
(1, '롱데캐슬 503동 802호', 107, '월세', 90000, 150, now(), now()), 
(2, '레알편한세상 시티 105동 806호', 110, '매매', 150000, NULL, now(), now()),
(6, '루체스타 오피스텔 1105호', 53, '월세', 10000, 50, now(), now()), 
(2, '와이파크 시티 205동 1603호', 113, '매매', 120000, NULL, now(), now()), 
(4, '썅떼빌리버 오피스텔 2214호', 45, '월세', 20000, 80, now(), now()), 
(6, '쉐리빌 아파트 603동 1904호', 75, '전세', 50000, NULL, now(), now()),
(1, '그랑시아 103동 306호', 145, '전세', 230000, NULL, now(), now()),
(4, '그랑샤 굿윌 베스트 뷰 파크 502동 1402호', 88, '월세', 40000, 150, now(), now()), 
(5, '풍님 하버 파크빌 402동 702호', 87, '월세', 70000, 100, now(), now()), 
(6, '샤이 리버뷰 파크 803동 1704호', 145, '매매', 230000, NULL, now(), now()),
(1, '휴먼시아 드림빌 208동 604호', 111, '전세', 60000, NULL, now(), now());

-- 1. 매물 정보 확인
-- 매매 13억 이하(130,000만원) 매물을 면적 내림차순으로 출력하세요.
-- 출력 컬럼은 공인중개사 사무실명, 공인중개사 사무실 전화번호, 매물 주소, 면적, 금액 입니다.

-- 출력 결과
-- office		phoneNumber		address						area	price
-- 대박공인중개사	02-000-7777		와이파크 시티 205동 1603호		113		120000
-- 럭키공인중개사	02-777-7777		레알편한세상 시티 505동 101호		110		120000
-- 대박공인중개사	02-000-7777		푸르지용 파크 701동 2104호		97		90000
-- 대박공인중개사	02-000-7777		강남 헤리티지 시티 902동 606호	90		130000

select firm.office, firm.phoneNumber, house.address, house.area, house.price
from `realtor` AS firm
join `real_estate` AS house
on firm.id = house.realtorId
where house.type = "매매" AND house.price <= 130000
order by house.price desc;

-- 2. 안심중개사
-- '안심중개사' 등급의 공인중개사가 등록한 월세 매물을 월세 금액 오름차순으로 출력하세요.
-- 출력 컬럼은 공인중개사 사무실명, 공인중개사 사무실 전화번호, 매물 주소, 보증금액, 월세금액, 면적 입니다.
-- 보증금액 컬럼: price
-- 월세금액 컬럼: rentPrice

select firm.office, firm.phoneNumber, house.address, house.price, house.rentPrice, house.area
from `realtor` AS firm
join `real_estate` AS house
on firm.id = house.realtorId
where firm.grade = "안심중개사" AND house.type = "월세"
order by house.rentPrice asc;

-- 3. 매물 확인
-- 서울시 서초구에 있는 공인중개사 사무실 매물 중 전세 7억 이하(70,000만원) 매물을 보증금액 오름차순으로 출력하세요.
-- 출력 컬럼은 공인중개사 사무실명, 공인중개사 사무실 전화번호, 주소, 보증금액, 면적 입니다.
-- 출력 결과

-- office	phoneNumber	address						price	area
-- 황금부동산	02-300-2000	굿타워 오피스텔 804호			20000	65
-- 황금부동산	02-300-2000	레이얀 레이크 아파트 301동 905호	40000	84
-- 믿음부동산	02-333-9999	쉐리빌 아파트 603동 1904호		50000	75
-- 황금부동산	02-300-2000	휴먼시아 드림빌 208동 604호		60000	111

select firm.office, firm.phoneNumber, house.address, house.price, house.area
from `realtor` AS firm
join `real_estate` AS house
on firm.id = house.realtorId
# % 이렇게 시작하는거 쓰지마 e.g. %서울시 서초구
where firm.address like "서울시 서초구%" AND house.type = "전세" AND house.price <= 70000
order by house.price asc;

-- 4. 공인중개사 매물 개수
-- 공인중개사 별로 매물 개수를 내림차순으로 출력하세요.
-- 출력 컬럼은 공인중개사 사무실명, 매물 개수 입니다.
-- 출력 결과

-- office		count
-- 황금부동산		6
-- 대박공인중개사	4
-- 희망공인중개사	4
-- 럭키공인중개사	3
-- 믿음부동산		3

select firm.office, count(house.realtorId) as count
from `realtor` AS firm
join `real_estate` AS house
on firm.id = house.realtorId
group by firm.id
order by count desc;

-- 5. 매물 확인
-- '대박공인중개사' 매물중 매매, 전세 중 100평방미터 이상의 매물을 금액 오름차순으로 출력하세요.
-- 출력 컬럼은 공인중개사 사무실명, 공인중개사 사무실 전화번호, 매물 주소, 금액, 면적 입니다.
-- 출력 결과

-- office	phoneNumber	address	price	area
-- 대박공인중개사	02-000-7777	와이파크 시티 205동 1603호	120000	113
-- 대박공인중개사	02-000-7777	레알편한세상 시티 105동 806호	150000	110

select firm.office, firm.phoneNumber, house.address, house.price, house.area
from `realtor` AS firm
join `real_estate` AS house
on firm.id = house.realtorId
where firm.office = "대박공인중개사" AND house.type != "월세" AND house.area >= 100
order by house.price asc;


-- 연습 문제
-- 종합문제 (1)

-- 개발자 채용 공고
-- 개발자 채용 공고 정보가 아래와 같이 주어져있다.

-- 1. 테이블 생성
-- 위 데이터를 기반으로 테이블을 설계하고 생성하세요.
-- 중복되는 데이터가 저장 되지 않도록 table을 적절히 나누어서 설계 하세요.
-- 자동으로 증가하는 id를 만드세요.
-- 생성시간과, 업데이트 시간을 관리하는 컬럼을 포함하세요.

CREATE TABLE `firm` (
    `id` int NOT NULL AUTO_INCREMENT primary key,
    `name` varchar(20) NOT NULL,
    `business` varchar(20) NOT NULL,
    `scale` varchar(10) NOT NULL,
    `headcount` int NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `recruit` (
    `id` int NOT NULL AUTO_INCREMENT primary key,
    `firmID` int NOT NULL,
    `position` varchar(50) NOT NULL,
    `qualification` varchar(30) NOT NULL,
    `responsibilities` varchar(30) NOT NULL,
    `type` varchar(10) NOT NULL,
    `region` varchar(10) NOT NULL,
    `salary` int NOT NULL,
    `deadline` DATE NOT NULL,
    `createdAt` timestamp DEFAULT CURRENT_TIMESTAMP,
    `updatedAt` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


-- 2. 데이터 저장
-- 생성된 테이블에 위 데이터를 모두 insert 하세요.

INSERT INTO `firm` (`name`, `business`, `scale`, `headcount`)
values 	("Cacao", "인터넷 포털", "대기업", 2848),
		("Rine", "모바일 무선", "대기업", 1138),
		("NG소프트", "컨텐츠 게임", "중견기업", 4430),
		("쿠퐁", "쇼핑몰", "중견기업", 5350),
		("Naber", "인터넷 포털", "대기업", 4048),
		("우와한형제들", "소프트웨어 솔루션", "중견기업", 926);
        
        
INSERT INTO `recruit` (`firmID`, `position`, `responsibilities`, `qualification`, `type`, `region`, `salary`, `deadline`)
values 	(1, "안드로이드 개발자", "메신저 앱 개발", "kotlin 경력 3년 이상", "정규직", "성남시 분당구", 7300, "2026-03-13"),
		(1, "안드로이드 개발자", "쇼핑 서비스 개발", "kotlin 경력 3년 이상", "정규직", "성남시 분당구", 6300, "2026-04-04"),
        (1, "웹 back-end 개발자", "이모티콘 샵 API 서버 개발", "spring 경력 3년 이상", "정규직", "성남시 분당구", 7000, "2026-03-28"),
        (2, "아이폰 앱 개발자", "메신저 앱 개발", "RxSwift 개발 경력 3년 이상", "정규직", "성남시 분당구", 7600, "2026-04-01"),
        (2, "웹 back-end 개발자", "Rine 포스팅 기능 API 개발", "spring 경력 3년 이상", "정규직", "성남시 분당구", 6600, "2026-03-29"),
        (3, "게임 개발자", "게임 개발", "Unreal Engine 경력 5년 이상", "정규직", "성남시 분당구", 8400, "2026-04-20"),
        (3, "모바일 게임 개발자", "리뉘쥐 모바일 게임 개발", "Unreal Engine 개발 가능자", "계약직", "성남시 분당구", 8500, "2026-04-05"),
        (4, "웹 back-end 개발자", "오픈마켓 웹 개발", "spring 개발 가능자", "정규직", "서울시 송파구", 8100, "2026-05-02"),
        (4, "웹 front-end 개발자", "오픈마켓 웹 개발", "react 개발 가능자", "계약직", "서울시 송파구", 9000, "2026-04-10"),
        (5, "웹 back-end 개발자", "Naber 메일 기능 개발자", "spring 경력 5년 이상", "계약직", "성남시 분당구", 9800, "2026-04-20"),
        (5, "동영상 플레이어 개발자", "네이버TV 플레이어 개발", "동영상 코덱 기술 개발 가능자", "정규직", "성남시 분당구", 7800, "2026-05-01"),
        (5, "웹 front-end 개발자", "Now 웹 개발", "Vue.js 개발 가능자", "정규직", "성남시 분당구", 7000, "2026-04-15"),
        (6, "웹 back-end 개발자", "사내 인트라넷 개발", "spring 경력 3년 이상", "계약직", "서울시 송파구", 8800, "2026-04-15"),
        (6, "웹 back-end 개발자", "쇼핑 라이브 API 개발", "spring 경력 3년 이상", "정규직", "서울시 송파구", 8200, "2026-05-12");

-- 3. 연봉순 정렬
-- 연봉을 기준으로 내림 차순으로 정렬해서 출력하세요.
-- 출력 컬럼은 아래 표를 참고 하세요.
-- 출력 결과

-- name		position			qualification				type	salary
-- Naber	웹 back-end 개발자		spring 개발 경력 5년 이상		계약직	9800
-- 쿠퐁		웹 front-end 개발자	react 개발 가능자				계약직	9000
-- 우와한형제들	웹 back-end 개발자		spring 개발경력 3년이상			계약직	8800
-- NG소프트	모바일 게임 개발자		Unreal Engine 개발 가능자		계약직	8500
-- NG소프트	게임 개발자			Unreal Engine 개발 5년 이상	정규직	8400

select firm.name, recruit.position, recruit.qualification, recruit.type, recruit.salary FROM firm JOIN recruit
on firm.id = recruit.firmID
order by recruit.salary desc;


-- 4. 복합 조건
-- 대기업 정규직 연봉 7000만원 이상의 공고를 연봉이 높은 순으로 3개만 출력하세요.
-- 출력 결과

-- name		scale	position			qualification			type	salary
-- Naber	대기업	동영상 플레이어 개발자	동영상 코덱 기술 개발 가능자	정규직	7800
-- Rine		대기업	아이폰 앱 개발자		RxSwift 개발 결력 3년 이상	정규직	7600
-- Cacao	대기업	안드로이드 개발자		kotlin 경력 3년 이상		정규직	7300

select firm.name, firm.scale, recruit.position, recruit.qualification, recruit.type, recruit.salary FROM firm JOIN recruit
on firm.id = recruit.firmID
where 
	firm.scale = "대기업" AND
	recruit.type = "정규직" AND 
	recruit.salary >= 7000
order by recruit.salary desc limit 3;


-- 5. 기업별 공고 수
-- 출력 결과

-- 마감일이 2026년 5월 이전인, 기업별 정규직 공고 수를 출력하세요.
-- 공고수 내림 차순으로 출력하세요.
-- name		count	business	headcount
-- Cacao	3		인터넷 포털	2848
-- Rine		2		무선 모바일	1138
-- NG소프트	1		컨텐츠 게임	4430
-- Naber	1		인터넷 포털	4048

select firm.name, count(recruit.firmID) AS count, firm.business, firm.headcount
FROM firm JOIN recruit
on firm.id = recruit.firmID
where 
	recruit.deadline < "2026-05-01" AND
	recruit.type = "정규직"
group by firm.id
order by count desc;


-- 6. 근무형태 별 평균 연봉
-- 중견기업의 근무 형태별 평균연봉을 구하여 출력하세요.
-- 출력 결과

-- type		salary
-- 정규직		8233.3334
-- 계약직		8766.6667

select recruit.type, avg(recruit.salary) FROM firm JOIN recruit
on firm.id = recruit.firmID
where firm.scale = "중견기업"
group by recruit.type;


-- 7. 기업별 평균 연봉
-- 기업별 평균 연봉을 구하세요.
-- 단, 근무 지역이 성남시 분당구 이고 평균 연봉이 7300 이상만 출력하세요.
-- 사원수를 기준으로 내림차순으로 출력하세요.
-- 출력 결과

-- name		salary		scale	headcount
-- NG소프트	8450.000	중견기업	4430
-- Naber	8200.000	대기업	4048

select firm.name, avg(recruit.salary), firm.scale, firm.headcount FROM firm JOIN recruit ON firm.id = recruit.firmID
where recruit.region = "성남시 분당구"
group by recruit.firmID
having avg(recruit.salary) >= 7300
order by firm.headcount desc;



