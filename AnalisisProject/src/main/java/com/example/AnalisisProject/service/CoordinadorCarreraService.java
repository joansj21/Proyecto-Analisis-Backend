package com.example.AnalisisProject.service;

import com.example.AnalisisProject.entity.CoordinadorCarrera;
import com.example.AnalisisProject.repository.CoordinadorCarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CoordinadorCarreraService {
    @Autowired
    private CoordinadorCarreraRepository repository;

    public List<CoordinadorCarrera> listAll() { return repository.findAll(); }

    public CoordinadorCarrera get(int id) { return repository.findById(id).get(); }
}
