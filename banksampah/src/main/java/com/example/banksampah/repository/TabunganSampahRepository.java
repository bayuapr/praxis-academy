package com.example.banksampah.repository;

import com.example.banksampah.model.TabunganSampah;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TabunganSampahRepository extends JpaRepository<TabunganSampah, Long>{
    // Optional<TabunganSampah> findByNomorRekening(Long nomor_rekening);
}