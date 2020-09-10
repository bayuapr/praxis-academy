package com.example.transaksi.model;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="TipeTransaksi")
public class TipeTransaksi {
  @Id
  @GeneratedValue
  private Long id_transaksi;

  @Column(name= "NamaTransaksi")
  private String nama_transaksi;

  @Column(name= "KodeTransaksi")
  private String kode_transaksi;


  public Long getIdTransaksi() {
    return id_transaksi;
  }

  public void setId(Long id_transaksi) {
    this.id_transaksi = id_transaksi;
  }

  public String getNama_transaksi() {
    return nama_transaksi;
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