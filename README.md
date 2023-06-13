# java_trials
a repo for my java coding experiments


# notes 

> 3 keys of web services:
- designed for machine to machine (or application to application) interaction
- should be interoperable - not platform dependent
- should allow communication over a network


>SOAP:

-Format
- SOAP XML Request 
- SOAP XML Response
 
-Transport 
- SOAP over MQ 
- SOAP over HTTP

-Service Definition 
- WSDL

> Spring Boot Magic
- How are request handled?
  * DispatcherServlet (DispatcherServletAutoConfiguration)
- How does bean object get converted to Json?
  * ResponseBody + JacksonHttpMessageConverters
- Who is configuring error mapping?
  * ErrorMvcAutoConfiguration
- How are all jars available?
  * Starter Projects (Spring Boot Starter Web - spring webmvc, spring-web, spring-boot-starter-tomcat, spring-boot-starter-json)

> Request Methods for REST API
- get --> retrieve details of a resource
- post --> create a new resource
- put --> update an existing resource
- patch --> update part of a resource
- delete --> delete a resource 

> REST API Documentation
- Your REST API consumers need to understand your REST API:
  - Resources
  - Actions
  - Request / Response Structure (constraints / validations)
- Challenges
  - Accuracy: how do you ensure that your documentation is upto date and correct?
  - Consistency: you might have 100s of Rest API in an enterprise. How do you ensure consistency?
- Options
  - Manually Maintain Documentation (additional effort keep it in sync with code)
  - Generate from code (open api && swagger)

- Content Negotiation
  - Accept Header
   <dependency>
    		<groupId>com.fasterxml.jackson.dataformat</groupId>
    		<artifactId>jackson-dataformat-xml</artifactId>
    </dependency>
  - Accept Language header


> Launch MySQL as Docker Container

```
docker run --detach --env MYSQL_ROOT_PASSWORD=dummypassword --env MYSQL_USER=social-media-user --env MYSQL_PASSWORD=dummypassword --env MYSQL_DATABASE=social-media-database --name mysql --publish 3306:3306 mysql:8-oracle
```

mysqlsh commands
```
\connect social-media-user@localhost:3306
\sql
use social-media-database
select * from user_details;
select * from post;
\quit
```

/pom.xml Modified
```java
<!--		<dependency>-->
<!--			<groupId>com.h2database</groupId>-->
<!--			<artifactId>h2</artifactId>-->
<!--			<scope>runtime</scope>-->
<!--		</dependency>-->
<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
</dependency>
```

/src/main/resources/application.properties Modified
```java
#spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.show-sql=true
spring.datasource.url=jdbc:mysql://localhost:3306/social-media-database
spring.datasource.username=social-media-user
spring.datasource.password=dummypassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
```


mysqlsh commands & view table details:

![image](https://github.com/fatihmaskaraoglu/java_trials/assets/8976615/1d77fd81-7a26-4bd2-86a9-29da7f6d41fa)

docker view for container:

![image](https://github.com/fatihmaskaraoglu/java_trials/assets/8976615/dab557aa-8600-43f0-890b-ad2cb5d7c68f)
