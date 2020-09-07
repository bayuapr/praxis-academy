package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="transaksi")
public class TipeTransaksi {
  @Id
  @GeneratedValue
  private Long id;
  private String nama_transaksi;
  private String kode_transaksi;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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