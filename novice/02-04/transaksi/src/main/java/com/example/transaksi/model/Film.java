package com.example.transaksi.model;

import javax.persistence.*;

@Entity
@Table(name="film")
public class Film {
  @Id
  @GeneratedValue
  private Long id;

  @Column(name= "Judul")
  private String judul;

  @Column(name= "Genre")
  private String genre;

  @Column(name= "Negara")
  private String negara;

  @Column(name= "Tahun")
  private Integer tahun;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getJudul() {
    return judul;
  }

  public void setJudul(String judul) {
    this.judul = judul;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getNegara() {
    return negara;
  }

  public void setNegara(String negara) {
    this.negara = negara;
  }

  public Integer getTahun() {
    return tahun;
  }

  public void setTahun(Integer tahun) {
    this.tahun = tahun;
  }
}