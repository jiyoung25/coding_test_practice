-- https://school.programmers.co.kr/learn/courses/30/lessons/164673

-- 다음은 중고거래 게시판 정보를 담은 USED_GOODS_BOARD 테이블과 중고거래 게시판 첨부파일 정보를 담은 USED_GOODS_REPLY 테이블입니다.
-- USED_GOODS_BOARD 테이블은 다음과 같으며 BOARD_ID, WRITER_ID, TITLE, CONTENTS, PRICE, CREATED_DATE, STATUS, VIEWS은
-- 게시글 ID, 작성자 ID, 게시글 제목, 게시글 내용, 가격, 작성일, 거래상태, 조회수를 의미합니다.
-- USED_GOODS_REPLY 테이블은 다음과 같으며 REPLY_ID, BOARD_ID, WRITER_ID, CONTENTS, CREATED_DATE는 각각 댓글 ID, 게시글 ID, 작성자 ID, 댓글 내용, 작성일을 의미합니다.
-- USED_GOODS_BOARD와 USED_GOODS_REPLY 테이블에서 2022년 10월에 작성된 게시글 제목, 게시글 ID, 댓글 ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일을 조회하는 SQL문을 작성해주세요. 결과는 댓글 작성일을 기준으로 오름차순 정렬해주시고, 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬해주세요.


SELECT board.TITLE TITLE, board.BOARD_ID BOARD_ID, reply.REPLY_ID REPLY_ID, reply.WRITER_ID WRITER_ID, reply.CONTENTS CONTENTS, TO_CHAR(reply.CREATED_DATE, 'YYYY-MM-DD') CREATED_DATE
FROM USED_GOODS_BOARD board
INNER JOIN USED_GOODS_REPLY reply ON board.BOARD_ID=reply.BOARD_ID
WHERE board.CREATED_DATE BETWEEN TO_DATE('2022-10-01', 'YYYY-MM-DD') AND TO_DATE('2022-10-31','YYYY-MM-DD')
ORDER BY CREATED_DATE, TITLE ASC;

--MEMO>> 정렬(ORDER BY)를 2가지 이상 하고싶으면 ','로 구분한다.