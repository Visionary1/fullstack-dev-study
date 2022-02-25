-- 한 행 추가
insert into `review`
(
	--  id auto_increment 이므로 추가하지 않는다
    `storeName`
    , `menu`
    , `userName`
    , `point`
    , `review`
    , `createdAt` -- 기본값이 current_timestamp 이기 때문에 넣지 않아도 현재 시간이 들어감
    , `updatedAt`
)
value
(
	"스토어네임"
    , "메뉴"
    , "유저네임"
    , 0.3
    , "리뷰1, 리뷰2, 리뷰3"
    , now()
    , now()
);

desc `review`;

select * from `review`;

-- 한번에 여러행 추가
insert into `review`
(`storeName`, `menu`, `userName`, `point`, `review`)
values
("스토어네임입니다", "메뉴에요", "유저네임입니다", 0.2, "리뷰입니다"),
("스토어네임입니다2", "메뉴에요2", "유저네임입니다2", 0.3, "리뷰입니다2"),
("스토어네임입니다2", "메뉴에요2", "유저네임입니다3", 0.4, "리뷰입니다3");