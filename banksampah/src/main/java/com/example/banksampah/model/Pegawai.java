package com.example.banksampah.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
// import javax.persistence.ManyToOne;
// import javax.persistence.JoinColumn;

@Entity
@Table(name="pegawai")
public class Pegawai {
  @Id
  @GeneratedValue
  private Long id_pegawai;

  // @ManyToOne
  // @JoinColumn(name = "id_nasabah", referencedColumnName= "id_nasabah",insertable = false, updatable = false)
  // private Nasabah nasabah;
  // private Long id_nasabah;

  @Column(name= "NamaPegawai")
  private String nama_pegawai;

  @Column(name= "Alamat")
  private String alamat;

  @Column(name= "NomorTelpon")
  private Long nomor_telpon;

  @Column(name= "Email")
  private String email;


  public Long getId_pegawai() {
    return id_pegawai;
  }

  public void setId_pegawai(Long id_pegawai) {
    this.id_pegawai = id_pegawai;
  }

  // public Nasabah getNasabah() {
  //   return nasabah;
  // }

  // public void setNasabah(Nasabah nasabah) {
  //   this.nasabah = nasabah;
  // }

  // public Long getId_nasabah() {
  //   return id_nasabah;
  // }

  // public void setId_nasabah(Long id_nasabah) {
  //   this.id_nasabah = id_nasabah;
  // }


  public String getNama_pegawai() {
    return nama_pegawai;
  }

  public void setNama_pegawai(String nama_pegawai) {
    this.nama_pegawai = nama_pegawai;
  }

  public String getAlamat() {
    return alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public Long getNomor_telpon() {
    return nomor_telpon;
  }

  public void setNomor_telpon(Long nomor_telpon) {
    this.nomor_telpon = nomor_telpon;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}