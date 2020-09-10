package com.example.transaksi.controller;

import com.example.transaksi.model.TipeTransaksi;
import com.example.transaksi.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/")
public class TransaksiController {
    private TransaksiRepository transaksiRepository;

    @Autowired 
    public TransaksiController(TransaksiRepository transaksiRepository){
        this.transaksiRepository = transaksiRepository;
    }
    @GetMapping("/data/all")
    Iterable<TipeTransaksi> all() {
      return transaksiRepository.findAll();
    }

    @GetMapping("/data/{id}")
    TipeTransaksi userById(@PathVariable Long id) {
      return transaksiRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/data/save") 
    TipeTransaksi save(@RequestBody TipeTransaksi tipeTransaksi){
        return transaksiRepository.save(tipeTransaksi);
    }
    @PutMapping("/data/{id}")
    TipeTransaksi updateuser(@RequestBody TipeTransaksi newUser, @PathVariable Long id) {
      
      return transaksiRepository.findById(id)
      .map(tipeTransaksi -> {
        tipeTransaksi.setNama_transaksi(newUser.getNama_transaksi());
        tipeTransaksi.setKode_transaksi(newUser.getKode_transaksi());
        return transaksiRepository.save(tipeTransaksi);

      })
      .orElseGet(() -> {
         newUser.setId(id);
        return transaksiRepository.save(newUser);
      });
      }

      @DeleteMapping("/data/{id}")
      public void deleteTipeTransaksi(@PathVariable Long id){
        transaksiRepository.deleteById(id);
      }
  }