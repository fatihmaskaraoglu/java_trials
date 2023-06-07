package com.myapp.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path ="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
