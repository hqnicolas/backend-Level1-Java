package com.shortener.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sobre")
public class AboutShortener {
    @GetMapping
    public ResponseEntity<String> getAbout() {
        return ResponseEntity.status(HttpStatus.OK).body("{\"estudante\":\"Nicolas Borba Pereira\", \"projeto\":\"Encurtador tinyurl\"}");
    }
}