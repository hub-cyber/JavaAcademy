#sql anñadidos , muestra la infgormacion 
#city_id,descripcion de city, state_id, descripcion del state, shipping_zone_id, descripcion de zone; 
select c.city_id,c.description,s.state_id,s.description,s.shipping_zone_id,sh.description from CITY as c, 
STATE as s, SHIPPING_ZONE as sh where c.state_id= s.state_id 
and s.shipping_zone_id = sh.shipping_zone_id order by city_id asc ;