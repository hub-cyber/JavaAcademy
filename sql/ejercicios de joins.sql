use mydb;

select u.username,u.name,u.user_role_id,ur.description
from user as u
right JOIN user_role as ur ON u.user_role_id = ur.user_role_id WHERE U.user_role_id IS NULL;

#GET AL RELEVANT USERS DATA AND THEIR SHIPTO 
SELECT U.USERNAME, U.NAME  user, ur.user_role_id,ur.description user_role,
st.ship_to_id,st.name  ship_to
,st.address
,st.city_id,
ci.description
from user as u
inner join user_role ur On u.user_role_id = ur.user_role_id
inner join ship_to st on u.username = st.user ;

select * from city;


##Get all relevant data from cities containing "ca" as description and whose shippingZone cost is greather than 50
select c.city_id
,c.description city 
, s.description
,sz.*
from city c 
inner join state s on c.state_id = s.state_id
inner join shipping_zone sz on s.shipping_zone_id = sz.shipping_zone_id
where c.description like "%ca%" and shipping_cost > 50;


##3 Create a reporte from cats created in 2015, their satatus aand their order_date 
##if they have. order the result by cart_id 
select c.cart_id,
c.create_date,
s.description cart_status,
o.order_id,
o.order_date
from cart c 
inner join status s on c.status_id = s.status_id 
left join orders o on c.cart_id = O.cart_id
where date_format(c.create_date,"%Y") ="2015" 
order by cart_id;

##left (excluyendo el inner)
select c.cart_id,
c.create_date,
s.description cart_status,
o.order_id,
o.order_date
from cart c 
inner join status s on c.status_id = s.status_id 
left join orders o on c.cart_id = O.cart_id
where date_format(c.create_date,"%Y") ="2015" 
and o.order_id is null
order by cart_id;

## rigth join 
## count cities by states, including states that don't have any city .
##order the results by number of cities
select s.* 
, count(c.city_id) cities
from city c
right join  state s on c.state_id = s.state_id
group by s.state_id
order by cities, s.state_id; 

##rigth excluido el inner 
select s.state_id, s.description 
from city c 
right join state s on c.state_id = s.state_id
where c.state_id is null;

## get the number of carts by shipto and status, from carts "created" and "delivered"
## and which the average of cart_amount on each group is between 3000 and 5000
select * from status;
select * from ship_to;
select  c.ship_to_id,c.status_id,sh.name,s.description, count(cart_id) as cart_count, 
avg(c.cart_amount) as promedio
from cart as c 
join ship_to as sh on c.ship_to_id = sh.ship_to_id
join status as s on c.status_id = s.status_id
where c.status_id in (1100,1300)
group by c.ship_to_id, c.status_id
having promedio between 3000 and 15000;

## get the number of items by category and uom sort the result by category
## and then by uom 
select * from uom;
select * from category;
select * from item;

select cat.description, i.uom_id, count(item_id) as items
from category_item as i
join category as cat on cat.category_id = i.item_id
group by cat.category_id;



SELECT i.description, c.description FROM category_item CAT
LEFT JOIN category C on CAT.category_id = C.category_id
LEFT JOIN item i ON i.item_id = CAT.item_id
GROUP BY c.category_id,
i.description,
c.description
;

