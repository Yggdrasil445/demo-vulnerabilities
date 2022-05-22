package com.eagle55391.demovulnerabilities.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class DemoController {

    @GetMapping("test/{id}")
    public String index(@PathVariable("id") String id) {
        return id;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        if (name != null)
            return name;
        else
            return "greeting";
    }

}

