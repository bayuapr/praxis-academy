package com.example.transaksi.controller;

import com.example.transaksi.model.Sekolah;
import com.example.transaksi.repository.SekolahRepository;
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
public class SekolahController {
    private SekolahRepository sekolahRepository;

    @Autowired 
    public SekolahController(SekolahRepository sekolahRepository){
        this.sekolahRepository = sekolahRepository;
    }
    @GetMapping("/sekolah/all")
    Iterable<Sekolah> all() {
      return sekolahRepository.findAll();
    }

    @GetMapping("/sekolah/{id}")
    Sekolah userByNomor_sekolah(@PathVariable("Nomor_sekolah") Long id) {
      return sekolahRepository.findByNomor_sekolah(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/sekolah/save") 
    Sekolah save(@RequestBody Sekolah sekolah){
        return sekolahRepository.save(sekolah);
    }
    @PutMapping("/sekolah/{id}")
    Sekolah updateuser(@RequestBody Sekolah newUser, @PathVariable Long id) {
      
      return sekolahRepository.findByNomor_sekolah(id)
      .map(sekolah -> {
        sekolah.setNomorSekolah(newUser.getNomorSekolah());
        sekolah.setNamaSekolah(newUser.getNamaSekolah());
        return sekolahRepository.save(sekolah);

      })
      .orElseGet(() -> {
         newUser.setNomorSekolah(id);
        return sekolahRepository.save(newUser);
      });
      }

      @DeleteMapping("/sekolah/{id}")
      public void deleteUser(@PathVariable Long id){
        sekolahRepository.deleteByNomor_sekolah(id);
      }
  }