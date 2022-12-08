package com.example.AnalisisProject.service;

import com.example.AnalisisProject.entity.Organizacion;
import com.example.AnalisisProject.repository.OrganizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrganizacionService {
    @Autowired
    private OrganizacionRepository repository;

    public List<Organizacion> listAll() { return repository.findAll(); }

    public Organizacion get(int id) { return repository.findById(id).get(); }
}
