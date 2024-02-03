package org.example.restapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.restapi.model.BookRequest;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {
    @PutMapping("/put")
    public void put(
            @RequestBody BookRequest bookRequest
            ){
        log.info("Request : {}", bookRequest);
    }
}
