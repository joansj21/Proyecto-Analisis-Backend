package com.example.AnalisisProject.repository;

import com.example.AnalisisProject.entity.Organizacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizacionRepository extends JpaRepository<Organizacion, Integer> {
}
