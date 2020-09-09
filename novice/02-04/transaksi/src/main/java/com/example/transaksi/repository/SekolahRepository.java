package com.example.transaksi.repository;

import com.example.transaksi.model.Sekolah;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SekolahRepository extends JpaRepository<Sekolah, Long>{
    Sekolah findByNomor_sekolah(@NotNull Long nomor_sekolah);
}