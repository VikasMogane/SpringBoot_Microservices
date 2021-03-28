# SpringBoot_Microservices
SpringBoot Microservices robo3T   mongodb


mvn clean install

java -jar user-management\target\user-management-1.0.jar

-------------here steps means video lectures------------

created 1 microservice and added 1 maven module and we run that   --> step 1 and step 2 
if we run project here it will print user-management.java sout line

---------- step 3--------------------------

communiction with microservice with simple rest api 


- how to communicate with rest api--  when we run this service --> then how we will control/communicate this externally

now this after run --> it will point to 8080
if we add controller  and write rest api  -> then it will expose to that point.


run in chrome -- http://localhost:8080/name/vikas/welcome

----------------------------------------


4th part mongo db connectivity


requste comes though api --> then controller will send that to service package  -> in service all validations will be done.
--after service  processing gives response in payload form.
if need db in beween  this we elll use entity and repository package.

http://localhost:8080/user/userId

-----------------------------

All steps
1. Creating microservice
2. Adding Rest apis
3. Connect with Mongo db
4. Adding properties file



-----------------------------

java -jar subscription-management\target\subscription-management-1.0.jar

java -jar user-management\target\user-management-1.0.jar
