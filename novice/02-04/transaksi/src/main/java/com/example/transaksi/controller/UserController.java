package com.example.transaksi.controller;

import com.example.transaksi.model.TipeTransaksi;
import com.example.transaksi.model.User;
import com.example.transaksi.repository.TransaksiRepository;
import com.example.transaksi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UserController {
    private UserRepository UserRepository;

    @Autowired
    public UserController(UserRepository UserRepository){
        this.UserRepository = UserRepository;
    }
    @GetMapping("/user/all")
    Iterable<User> all(){
        return UserRepository.findAll();
    }
    @GetMapping("/user/{id}")
    User userById(@PathVariable Long id){
        return UserRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND));
    }

    @PostMapping("/user/save")
    User save(@RequestBody User user){
        return UserRepository.save(user);
    }
}