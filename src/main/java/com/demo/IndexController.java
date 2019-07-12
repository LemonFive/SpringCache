package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> users() {
        return userService.list();
    }

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable("id") Long id) {
        User user = userService.findUserById(id);
        return user;
    }

    @PutMapping("/upuser/{id}")
    public User upuser(@PathVariable("id") Long id) {
        return userService.upuser(id);
    }

    @PutMapping("/user/{id}/{name}")
    public User update(@PathVariable("id") Long id, @PathVariable("name") String name) {
        User user = userService.findUserById(id);
        user.setName(name);
        userService.update(user);
        return userService.findUserById(id);
    }

}
