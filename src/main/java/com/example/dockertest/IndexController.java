package com.example.dockertest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class IndexController {

    @Value("${index.string}")
    private String indexString;

    @GetMapping("/index")
    public ResponseEntity<String> index() {
        return ResponseEntity.ok().body(indexString); // index.string 값 확인
    }

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok().body("welcome");
    }

}
