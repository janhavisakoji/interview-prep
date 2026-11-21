-- LC 1757 - Recyclable and Low Fat Products
SELECT product_id FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';

-- LC 584 - Find Customer Referee
-- Key trick: use IS NULL, because NULL <> 2 is not true
SELECT name FROM Customer
WHERE referee_id <> 2 OR referee_id IS NULL;

-- LC 595 - Big Countries
-- Key trick: "at least one condition" means OR; "at least" means >=
SELECT name, population, area FROM World
WHERE area >= 3000000 OR population >= 25000000;

-- LC 1148 - Article Views I
-- Key trick: author_id = viewer_id means they read their own article; DISTINCT removes repeats
SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id = viewer_id
ORDER BY id;

-- LC 1683 - Invalid Tweets
-- Key trick: CHAR_LENGTH counts characters; "more than 15" means > 15
SELECT tweet_id FROM Tweets
WHERE CHAR_LENGTH(content) > 15;