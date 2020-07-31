# This is a springboot maven project.
To build the project, u can import it in any ide and run as Spring boot app
or using mvn spring-boot:run on cmd.

# I have used mysql DB (U can check pom.xml for all the dependencies)
## I have created mysql db service with db user as root/root.
# port is 8081


## Please refer application.properties for all the ports and configuration.
Path: springboot-rest-apis/src/main/resources/application.properties
https://github.com/himstanny/springboot-rest-apis/blob/master/src/main/resources/application.properties




### I have used in memory user with credentials (admin/admin)
So to access the apis like /employee and /employees?gender=<>&minage=<>&maxage=<>, 
u have to give basic auth in postman in authorization section


## Sample requests:


### To Login
POST method
No AUth required
URI : http://localhost:8081/api/login

Request Body:
{
	    
	"username": "admin",
	"password": "admin"
       
} 

## To create an employee

POST method
URI : http://localhost:8081/api/employee
Basic auth: admin/admin
Request Body:
{
        
    "name": "emp1",
    "age": 28,
    "gender": "FEMALE"
 } 
      
      
### To get based on gender and age range

GET method
URI:http://localhost:8081/api/employees?gender=MALE&minage=18&maxage=40
Basic auth: admin/admin




# Configurations


## This is port of the application (http://localhost:8081/api/createEmployee)
server.port=8081

##Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties) 
spring.datasource.url=jdbc:mysql://localhost:3306/honeywell
spring.datasource.username=root
spring.datasource.password=root

#Logging info
logging.level.root=WARN

#For the very first time to create Employee table in db , please put the value 'create' instead of 'none'. After that
#again put as none.
spring.jpa.hibernate.ddl-auto=none


## Hibernate Properties
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect