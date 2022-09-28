package com.zoolatech.loganalyzer.controller;

import com.zoolatech.loganalyzer.dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class UserController {
    private AtomicInteger idGenerator = new AtomicInteger(0);
    private Map<Integer, User> userMap = new ConcurrentHashMap<>();

    @PostMapping(path = "user")
    public int createUser(@RequestBody User user) {
        int id = idGenerator.incrementAndGet();
        userMap.put(id, user);
        return id;
    }

    @GetMapping(path = "user/{id}")
    @ResponseBody
    public User getUser(@PathVariable int id) {
        return userMap.get(id);
    }

}
