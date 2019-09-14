package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Incredient;

@Repository
public interface IncredientRepository extends JpaRepository<Incredient, Long>{

}