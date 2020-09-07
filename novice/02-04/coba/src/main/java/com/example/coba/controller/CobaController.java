package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.validation.Valid;

import com.example.model.Coba;
import com.example.exception.ResourceNotFoundException;
import com.example.repository.CobaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping(path="/coba") 
public class CobaController {
  @Autowired 
  private CobaRepository cobaRepository;

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Coba> getAllCobas() {
    return cobaRepository.findAll();
  }

  @GetMapping(path="/coba/{id}")
  public ResponseEntity<Coba> getCobaById(@PathVariable(value = "id") Long cobaId)
  throws ResourceNotFoundException {
    Coba coba = cobaRepository.findById(cobaId)
      .orElseThrow(() -> new ResourceNotFoundException("Coba not found for this id :: " + cobaId));
    return ResponseEntity.ok().body(coba);
}

  @PostMapping(path="/cobas") // Map ONLY POST Requests
  public Coba createCoba(@Valid @RequestBody Coba coba) {
    return cobaRepository.save(coba);
  }

  @PutMapping(path="/cobas/{id}")
  public ResponseEntity<Coba> updateCoba(@PathVariable(value = "id") Long cobaId,
         @Valid @RequestBody Coba cobaDetails) throws ResourceNotFoundException {
        Coba coba = cobaRepository.findById(cobaId)
        .orElseThrow(() -> new ResourceNotFoundException("Coba not found for this id :: " + cobaId));

        coba.setEmail(cobaDetails.getEmail());
        coba.setName(cobaDetails.getName());
        final Coba updatedCoba = CobaRepository.save(coba);
        return ResponseEntity.ok(updatedCoba);
    }

    @DeleteMapping(path="/cobas/{id}")
    public Map<String, Boolean> deleteCoba(@PathVariable(value = "id") Long cobaId)
         throws ResourceNotFoundException {
        Coba coba = cobaRepository.findById(cobaId)
       .orElseThrow(() -> new ResourceNotFoundException("Coba not found for this id :: " + cobaId));

        cobaRepository.delete(coba);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}