package com.myapp.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController
public class HelloWorldController {
    // hello world
    @RequestMapping(method = RequestMethod.GET, path ="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path ="/hello-world-get-mapping")
    public String helloWorldWithGetMapping(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET, path ="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
}
