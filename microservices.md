# java_trials

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

