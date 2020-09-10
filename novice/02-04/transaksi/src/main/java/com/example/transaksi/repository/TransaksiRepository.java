package com.example.transaksi.repository;

import com.example.transaksi.model.TipeTransaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaksiRepository extends JpaRepository<TipeTransaksi, Long>{

}