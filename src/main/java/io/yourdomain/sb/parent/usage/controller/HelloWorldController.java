package io.yourdomain.sb.parent.usage.controller;

import lombok.extern.log4j.Log4j2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;

@Log4j2
@RestController
public class HelloWorldController {

    @GetMapping(path = "/", produces = { "application/json", "application/xml" })
    @ResponseBody
    public ResponseEntity<Object> get() {
        return new ResponseEntity<>(
                "Hello from " + HelloWorldController.class.getSimpleName() + " at " + Date.from(Instant.now()) + ".",
                HttpStatus.OK);
    }

    @GetMapping(path = "/", produces = { "text/plain" })
    @ResponseBody
    public ResponseEntity<Object> getPlainText() {
        return new ResponseEntity<>(
                "Hello from " + HelloWorldController.class.getSimpleName() + " at " + Date.from(Instant.now()) + ".",
                HttpStatus.OK);
    }

    @GetMapping(path = "/", produces = { "text/html" })
    @ResponseBody
    public ResponseEntity<Object> getHTML() {
        return new ResponseEntity<>("<html><head><title>Hello</title></head><body><h2>Hello from "
                + HelloWorldController.class.getSimpleName() + " at " + Date.from(Instant.now()) + "."
                + "</h2></body></html>", HttpStatus.OK);
    }

}
