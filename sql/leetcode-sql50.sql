-- LC 1757 - Recyclable and Low Fat Products
SELECT product_id FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y';

-- LC 584 - Find Customer Referee
-- Key trick: use IS NULL, because NULL <> 2 is not true
SELECT name FROM Customer
WHERE referee_id <> 2 OR referee_id IS NULL;