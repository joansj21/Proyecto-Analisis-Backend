package com.example.AnalisisProject.controller;

import com.example.AnalisisProject.entity.CoordinadorCarrera;
import com.example.AnalisisProject.entity.Organizacion;
import com.example.AnalisisProject.service.CoordinadorCarreraService;
import com.example.AnalisisProject.service.OrganizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
@RestController
@RequestMapping(path = "/api/coordinador")
@CrossOrigin(origins = "http://localhost:4200")
public class CoordinadorCarreraController {
    @Autowired
    private CoordinadorCarreraService service;

    @GetMapping("/getAll")
    public List<CoordinadorCarrera> list() {
        return service.listAll();
    }

    @GetMapping("/getOrganizacion/{id}")
    public ResponseEntity<CoordinadorCarrera> get(@PathVariable Integer id) {
        try {
            CoordinadorCarrera coordinadorCarrera = service.get(id);
            return new ResponseEntity<CoordinadorCarrera>(coordinadorCarrera, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<CoordinadorCarrera>(HttpStatus.NOT_FOUND);
        }
    }
}
