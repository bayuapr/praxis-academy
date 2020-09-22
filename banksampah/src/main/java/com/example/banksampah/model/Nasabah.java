package com.example.banksampah.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity
@Table(name="nasabah")
public class Nasabah {
  @Id
  @GeneratedValue
  private Long id_nasabah;

  @ManyToOne
  @JoinColumn(name = "id_pegawai", referencedColumnName= "id_pegawai",insertable = false, updatable = false)
  private Pegawai pegawai;
  private Long id_pegawai;

  
  @Column(name= "NamaNasabah")
  private String nama_nasabah;

  @Column(name= "Alamat")
  private String alamat;

  @Column(name= "NomorTelpon")
  private Long nomor_telpon;

  @Column(name= "Email")
  private String email;

  @Column(name= "NomorRekening")
  private Long nomor_rekening;

  public Long getId_nasabah() {
    return id_nasabah;
  }

  public void setId_nasabah(Long id_nasabah) {
    this.id_nasabah = id_nasabah;
  }

  public Pegawai getPegawai() {
    return pegawai;
  }

  public void setPegawai(Pegawai pegawai) {
    this.pegawai = pegawai;
  }

  public Long getId_pegawai() {
    return id_pegawai;
  }

  public void setId_pegawai(Long id_pegawai) {
    this.id_pegawai = id_pegawai;
  }

  public String getNama_nasabah() {
    return nama_nasabah;
  }

  public void setNama_nasabah(String nama_nasabah) {
    this.nama_nasabah = nama_nasabah;
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

  public Long getNomor_rekening() {
    return nomor_rekening;
  }

  public void setNomor_rekening(Long nomor_rekening) {
    this.nomor_rekening = nomor_rekening;
  }
}