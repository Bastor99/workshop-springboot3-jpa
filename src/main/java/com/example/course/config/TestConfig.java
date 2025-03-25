package com.example.course.config;

import com.example.course.entities.Order;
import com.example.course.entities.User;
import com.example.course.repositiories.OrderRepository;
import com.example.course.repositiories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = User.builder().id(null).name("Maria Brown").email("maria@gmail.com")
                .phone("988888888").password("123456").build();

        User u2 = User.builder().id(null).name("Alex Green").email("alex@gmail.com")
                .phone("977777777").password("123456").build();

        Order o1 = Order.builder().id(null).moment(Instant.parse("2019-06-20T19:53:07Z"))
                .client(u1).build();

        Order o2 = Order.builder().id(null).moment(Instant.parse("2019-07-21T03:42:10Z"))
                .client(u2).build();

        Order o3 = Order.builder().id(null).moment(Instant.parse("2019-07-22T15:21:22Z"))
                .client(u1).build();

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
