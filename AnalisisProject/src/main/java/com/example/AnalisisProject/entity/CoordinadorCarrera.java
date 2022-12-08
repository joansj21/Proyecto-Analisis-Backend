package com.example.AnalisisProject.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
public class CoordinadorCarrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "extension")
    private String numExtension;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    @Column(name = "fecha_inicio")
    private Date fechaInicio;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "correo_institucional")
    private String correoInstitucional;
    @Column(name = "correo_personal")
    private String correoPersonal;

    public CoordinadorCarrera(int id, String numExtension, Date fechaInicio, String nombre,
                              String apellidos, String correoInstitucional, String correoPersonal) {
        this.setId(id);
        this.setNumExtension(numExtension);
        this.setFechaInicio(fechaInicio);
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setCorreoInstitucional(correoInstitucional);
        this.setCorreoPersonal(correoPersonal);
    }



    public CoordinadorCarrera(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumExtension() {
        return numExtension;
    }

    public void setNumExtension(String numExtension) {
        this.numExtension = numExtension;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }
}
