-- 코드를 입력하세요
SELECT b.CATEGORY , SUM(bs.SALES)
FROM BOOK b JOIN BOOK_SALES bs ON (b.BOOK_ID = bs.BOOK_ID)
WHERE bs.SALES_DATE < '2022-02-01' AND bs.SALES_DATE > '2021-12-31'
GROUP BY b.CATEGORY
ORDER BY b.CATEGORY ASC;