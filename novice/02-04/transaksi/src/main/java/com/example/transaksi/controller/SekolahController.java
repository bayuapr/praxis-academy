package com.example.transaksi.controller;

import com.example.transaksi.model.Sekolah;
import com.example.transaksi.repository.SekolahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Optional;
import java.util.List;
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
    Sekolah getByNomor_sekolah(@PathVariable("id") Long nomor_sekolah) {
      return sekolahRepository.findByNomorSekolah(nomor_sekolah).get();
    }

    @PostMapping("/sekolah/save") 
    Sekolah save(@RequestBody Sekolah sekolah){
        return sekolahRepository.save(sekolah);
    }

    @PutMapping("/sekolah/{id}")
    public Sekolah update(@PathVariable("id") Long nomor_sekolah, @RequestBody Sekolah newSekolah) {
        Sekolah sekolah = sekolahRepository.findByNomorSekolah(nomor_sekolah).get();
        sekolah.setNamaSekolah(newSekolah.getNamaSekolah());
        return sekolahRepository.save(sekolah);
      }

      @DeleteMapping("/sekolah/{id}")
      public void deleteSekolah(@PathVariable ("id") Long nomor_sekolah){
        Sekolah sekolah = sekolahRepository.findByNomorSekolah(nomor_sekolah).get();
        sekolahRepository.delete(sekolah);
      }
  }