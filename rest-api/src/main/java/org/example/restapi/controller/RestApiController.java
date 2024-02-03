package org.example.restapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.example.restapi.model.BookQueryParam ;
@RestController
@Slf4j
@RequestMapping("/api")
public class RestApiController {
    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello Spring Boot";
    }
    @GetMapping(path = "/echo/{message}")
    public String echo(
            @PathVariable String message
    ){
        System.out.println("echo : "+message);
        return message.toUpperCase();
    }

    // https://www.foo.bar/api/book?category=IT&issuedYear=2023&issued-month=01&issued_day=31
    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam(name = "issued_day") String issuedDay
    ){
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issuedDay);
    }

    @GetMapping(path = "/book2")
    public void queryParamDto(
            BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam);
    }
    @DeleteMapping(path = {
            "/user/{userName}/delete/",
            "/user/{userName}/del/"
    })
    public void delete(
            @PathVariable String userName
    ){
        log.info("user-name : {}", userName);
    }
}

