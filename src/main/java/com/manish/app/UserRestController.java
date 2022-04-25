package com.manish.app;

import com.manish.app.model.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRestController {
    @GetMapping(value = "/user",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getUser(){
        return ResponseEntity.ok("Manish Mishra");
    }
}
