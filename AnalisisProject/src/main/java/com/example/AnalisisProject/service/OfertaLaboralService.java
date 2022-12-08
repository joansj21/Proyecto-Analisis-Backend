package com.example.AnalisisProject.service;

import com.example.AnalisisProject.entity.OfertaLaboral;
import com.example.AnalisisProject.repository.OfertaLaboralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OfertaLaboralService {
    @Autowired
    private OfertaLaboralRepository repository;

    public List<OfertaLaboral> listAll() { return repository.findAll(); }

    public void save(OfertaLaboral ofertaLaboral) { repository.save(ofertaLaboral); }

    public OfertaLaboral get(int id) { return repository.findById(id).get(); }
}
