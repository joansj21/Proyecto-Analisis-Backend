package com.example.AnalisisProject.repository;

import com.example.AnalisisProject.entity.CoordinadorCarrera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinadorCarreraRepository extends JpaRepository<CoordinadorCarrera, Integer> {
}
