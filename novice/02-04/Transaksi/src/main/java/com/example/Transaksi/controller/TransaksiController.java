package com.example.Transaksi.controller;

import com.example.Transaksi.model.TipeTransaksi;
import com.example.Transaksi.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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


}