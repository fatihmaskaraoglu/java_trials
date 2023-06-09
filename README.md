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

