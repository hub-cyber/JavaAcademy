select * from city where city_id > 150 and state_id >15;
select * from state where description like "ch%" or state_id between 1 and 10;
select item_id, description,uom_id from item where description like "Sams%" and uom_id ="pce";
select item_id, description,unit_price from item where unit_price between 1500 and 7500 and item_id
 in 
(2,6,20,28,40,45,60,70);

select  uom_id, unit_price from item where unit_price <1500;
select uom_id, unit_price from item where unit_price <500 order by uom_id, unit_price desc;

select  item_id, count(cart_id) as total_carts, sum(quantity) as total_items , AVG(quantity)
as items_by_cart from cart_line group By item_id order by item_id;

-- 
SELECT * from CART
ORDER BY S;

#having 
SELECT CART_ID , sum(quantity) as total_items from cart_line  group by cart_id 
having sum(quantity) > 4 order by cart_id; 

#Get the number of carts by shipto and status from  carts "not- cancelled"
# and the 50% of sum of cart_amount on each gropup is greater than 400
select ship_to_id, status_id, sum(cart_amount)/2 as cart_amt_sum,
count(cart_id) as count_cart
from cart
where status_id!= 1400 ##son operaciones 
group by ship_to_id, status_id
having cart_amt_sum >4000
order by ship_to_id;

select item_id, concat(uom_id,"-",description ) as description
from item
where description <25;

select item_id, if (length(description)>25, concat(substr(description,1,25),"..."),
description) as description
from item;

select order_id ,
date_format(order_date,"%Y-%m-%d")as order_date,
date_format(schedule_date, "%Y-%m-%d")as schedule_date,
date_format(delivery_date,"%Y-%m-%d")as delivery_date,
datediff(schedule_date,delivery_date)as delivery_span,
if(datediff(schedule_date,delivery_date)>= 0,"Y","N")AS ON_TIMEDELIVERY
FROM ORDERS
WHERE STATUS_ID IN(2300, 2350) AND order_date > date_add(current_date(),interval-7 year);

#Excercise
#get all items containing "set" as description and unit_price beteween 500 and 23000
select item_id, description, features from item where description like "%set%" and unit_price between 500 and 23000;

#get amount of carts per ship_to from cart with status other than created

select ship_to_id, count(cart_amount)as carts
from cart
where status_id!= 3100
group by ship_to_id;
#get the minimum_line_amount per order from orderlines where status_id are among (3100,3300)
#and the minumum_line_amount is greater than 1,500.


