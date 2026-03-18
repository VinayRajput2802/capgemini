package org.cg.controller;

import org.apache.coyote.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("abc")
    public @ResponseBody String sayHello(){
        return "Hello.html";
    }

    @GetMapping("xyz/{name}")
    public String sayHello1(@PathVariable String name){

        return "Hello "+name;
    }
}
