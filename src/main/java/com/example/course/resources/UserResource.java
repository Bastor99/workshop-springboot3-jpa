package com.example.course.resources;

import com.example.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = User.builder()
                .id(1L)
                .name("Maria")
                .email("maria@gmail.com")
                .phone("9999999999")
                .password("12345")
                .build();
        return ResponseEntity.ok().body(u);
    }
}
