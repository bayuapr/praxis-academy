package com.example.demo.repository;

import com.example.demo.model.TipeTransaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaksiRepository extends JpaRepository<TipeTransaksi,Long> {

}