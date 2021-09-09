package com.measure.interfaces;

import com.measure.domain.User;
import com.measure.interfaces.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @PostMapping("/register")
    public User register(@RequestBody UserRequest request) {
        return null;
    }

    @GetMapping("/test")
    public String getUserInfo() {
        return "userName : Wang";
    }
}
