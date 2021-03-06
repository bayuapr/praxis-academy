package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Coba;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface CobaRepository extends CrudRepository<Coba, Long> {

}