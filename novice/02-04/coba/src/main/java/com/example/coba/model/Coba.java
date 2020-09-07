package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="cobas")
public class Coba {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String name;
  private String email;

  public Coba() {
    
  }

  public Coba(String name, String emai) {
      this.name = name;
      this.email = email;

  }

  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId(){
        return id;
    }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString(){
      return "Coba [id=" + id + ", name=" + name + ", email=" + email
      + "]";
  }
}