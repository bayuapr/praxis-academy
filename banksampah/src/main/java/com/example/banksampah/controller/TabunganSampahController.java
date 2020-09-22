package com.example.banksampah.controller;

import java.util.Optional;
import java.util.List;
import com.example.banksampah.model.TabunganSampah;
import com.example.banksampah.repository.TabunganSampahRepository;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/tabungansampah")
public class TabunganSampahController {
    private TabunganSampahRepository tabungansampahRepository;

    @Autowired 
    public TabunganSampahController(TabunganSampahRepository tabungansampahRepository){
        this.tabungansampahRepository = tabungansampahRepository;
    }
    @GetMapping("/all")
    Iterable<TabunganSampah> all() {
      return tabungansampahRepository.findAll();
    }

    @GetMapping("/{id}")
    TabunganSampah userById(@PathVariable Long id) {
      return tabungansampahRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save") 
    TabunganSampah save(@RequestBody TabunganSampah tabungansampah){
        return tabungansampahRepository.save(tabungansampah);
    }
    @PutMapping("/{id}")
    TabunganSampah update(@RequestBody TabunganSampah newUser, @PathVariable Long id) {
      return tabungansampahRepository.findById(id)
      .map(tabungansampah ->{
        tabungansampah.setId_nasabah(newUser.getId_nasabah());
        tabungansampah.setJenis_sampah(newUser.getJenis_sampah());
        tabungansampah.setJumlah_sampah(newUser.getJumlah_sampah());
        tabungansampah.setSaldo_debit(newUser.getSaldo_debit());
        tabungansampah.setSaldo_kredit(newUser.getSaldo_kredit());
        tabungansampah.setTanggal_transaksi(newUser.getTanggal_transaksi());
        return tabungansampahRepository.save(tabungansampah);
    })
    .orElseGet(() -> {
       newUser.setId(id);
      return tabungansampahRepository.save(newUser);
    });
    }
      @DeleteMapping("/{id}")
      public void deleteTabunganSampah(@PathVariable Long id){
        tabungansampahRepository.deleteById(id);
      }
  }