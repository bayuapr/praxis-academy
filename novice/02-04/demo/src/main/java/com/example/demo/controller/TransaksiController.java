package com.example.demo.controller;

import com.example.demo.model.TipeTransaksi;
import com.example.demo.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController // This means that this class is a Controller
public class TransaksiController {
    private TransaksiRepository transaksiRepository;

    @Autowired 
    public TransaksiController(TransaksiRepository transaksiRepository){
        this.transaksiRepository = transaksiRepository;
    }

    @GetMapping(path="/user/all")
    Iterable<TipeTransaksi> all() {
      return transaksiRepository.findAll();
    }

    @GetMapping(path="/user/{id}")
    TipeTransaksi userById(@PathVariable Long id) {
      return transaksiRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @PostMapping(path="/user/save") 
    TipeTransaksi save(@ResponseBody TipeTransaksi user){
        return transaksiRepository.save(user);
    }
  }


