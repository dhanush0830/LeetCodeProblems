# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE REFEREE_ID != 2 OR referee_id IS NULL;