1、与JEST的区别

    1、端口为9300
    使用9300端口相当于伪装成ES的一个阶段
    
    2、Entity对象与ES中的doc一一对应
    
2、None of the configured nodes are available
   
    因为SpringBoot和ES的版本问题，我放弃。。。。 
    
    Spring Boot Version (x)	Spring Data Elasticsearch Version (y)	Elasticsearch Version (z)
    x <= 1.3.5	y <= 1.3.4	z <= 1.7.2*
    x >= 1.4.x	2.0.0 <=y < 5.0.0**	2.0.0 <= z < 5.0.0**