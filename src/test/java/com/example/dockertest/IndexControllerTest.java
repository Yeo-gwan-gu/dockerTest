package com.example.dockertest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class IndexControllerTest {

        @GetMapping("index")
        public ResponseEntity<String> index() {
            return ResponseEntity.ok().body("hello");
        }

    @GetMapping("welcome")
    public ResponseEntity<String> welcome() {
        return ResponseEntity.ok().body("welcome");
    }

}
