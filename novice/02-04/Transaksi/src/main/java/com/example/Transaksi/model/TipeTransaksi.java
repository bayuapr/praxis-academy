package com.example.Transaksi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="transaksi")
public class Transaksi {
  @Id
  @GeneratedValue
  private Long id;
  private String name_transaksi;
  private String kode_transaksi;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNama_transaksi() {
    return name;
  }

  public void setNama_transaksi(String nama_transaksi) {
    this.nama_transaksi = nama_transaksi;
  }

  public String getKode_transaksi() {
    return kode_transaksi;
  }

  public void setKode_transaksi(String kode_transaksi) {
    this.kode_transaksi = kode_transaksi;
  }
}