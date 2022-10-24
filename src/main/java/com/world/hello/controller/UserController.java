package com.world.hello.controller;

import com.world.hello.entity.dao.Account;
import com.world.hello.entity.pojo.AccountParam;
import com.world.hello.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Account> getAccounts() {
      return userService.getUserList();
    }

    @PostMapping
    public Account addAccount(@RequestBody AccountParam user) {
        return userService.addUser(user);
    }
}
