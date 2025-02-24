package com.karok.govconnect.controller;

import com.karok.govconnect.entity.User;
import com.karok.govconnect.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gg/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping("/{userId}/join/{channelId}")
    public ResponseEntity<String> joinChannel(@PathVariable Long userId, @PathVariable Long channelId) {
        userService.joinChannel(userId, channelId);
        return ResponseEntity.ok("User joined channel successfully");
    }

}
