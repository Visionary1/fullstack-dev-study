# one line comment
-- one line comment
/*
multi-line comment
*/

/*
	사람 정보 저장 테이블
	행번호 | 이름 | 생년월일 | 취미 | 자기소개(없을 수도 있음) | 작성 시간 | 수정 시간
*/
-- 모든 테이블명' 로 감싸기
-- 쿼리는 대소문자 구분 안함  
create table `like`(
	`id` int not null auto_increment primary key
    , `name` varchar(10) not null
    , `birth` smallint not null
    , `hobby` varchar(100) not null
    , `introduce` text null -- NULL 을 안 붙이면 기본값은 Null 허용
    , `createdAt` timestamp default current_timestamp
    , `updatedAt` timestamp default current_timestamp
) ENGINE=InnoDB default CHARSET=utf8mb4;

