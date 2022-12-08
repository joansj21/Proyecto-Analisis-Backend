package com.example.AnalisisProject.controller;

import com.example.AnalisisProject.entity.OfertaLaboral;
import com.example.AnalisisProject.service.OfertaLaboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping(path = "/api/ofertaLaboral")
@CrossOrigin(origins = "http://localhost:4200")
public class OfertaLaboralController {
    @Autowired
    private OfertaLaboralService service;

    @GetMapping("/getAll")
    public List<OfertaLaboral> list() {
        return service.listAll();
    }

    @GetMapping("/getOfertaLaboral/{id}")
    public ResponseEntity<OfertaLaboral> get(@PathVariable Integer id) {
        try {
            OfertaLaboral ofertaLaboral = service.get(id);
            return new ResponseEntity<OfertaLaboral>(ofertaLaboral, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<OfertaLaboral>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping(value = "/update")
    public void update(@RequestBody OfertaLaboral ofertaLaboral){
        service.save(ofertaLaboral);
    }
}
