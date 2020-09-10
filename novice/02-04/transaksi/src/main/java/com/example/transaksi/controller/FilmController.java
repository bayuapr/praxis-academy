package com.example.transaksi.controller;

import com.example.transaksi.model.Film;
import com.example.transaksi.repository.FilmRepository;
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
@RequestMapping("/film")
public class FilmController {
    private FilmRepository filmRepository;

    @Autowired 
    public FilmController(FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }
    @GetMapping("/all")
    Iterable<Film> all() {
      return filmRepository.findAll();
    }

    @GetMapping("/{id}")
    Film userById(@PathVariable Long id) {
      return filmRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    @PostMapping("/save") 
    Film save(@RequestBody Film film){
        return filmRepository.save(film);
    }
    @PutMapping("/{id}")
    Film updatefilm(@RequestBody Film newUser, @PathVariable Long id) {
      
      return filmRepository.findById(id)
      .map(film -> {
        film.setJudul(newUser.getJudul());
        film.setGenre(newUser.getGenre());
        film.setNegara(newUser.getNegara());
        film.setTahun(newUser.getTahun());
        return filmRepository.save(film);

      })
      .orElseGet(() -> {
         newUser.setId(id);
        return filmRepository.save(newUser);
      });
      }

      @DeleteMapping("/{id}")
      public void deleteFilm(@PathVariable Long id){
        filmRepository.deleteById(id);
      }
  }