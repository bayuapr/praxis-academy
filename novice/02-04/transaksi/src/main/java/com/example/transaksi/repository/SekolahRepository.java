package com.example.transaksi.repository;

import com.example.transaksi.model.Sekolah;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SekolahRepository extends JpaRepository<Sekolah, Long>{
    Optional<Sekolah> findByNomorSekolah(Long nomor_sekolah);
}