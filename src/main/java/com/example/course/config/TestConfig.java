package com.example.course.config;

import com.example.course.entities.User;
import com.example.course.repositiories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = User.builder().id(null).name("Maria Brown").email("maria@gmail.com")
                .phone("988888888").password("123456").build();

        User u2 = User.builder().id(null).name("Alex Green").email("alex@gmail.com")
                .phone("977777777").password("123456").build();

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
