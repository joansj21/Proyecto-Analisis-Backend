package com.example.AnalisisProject.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OfertaLaboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_puesto")
    private String nombrePuesto;
    @Column(name = "tipo_jornada")
    private String tipoJornada;
    //@Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    @Column(name = "periodo_visibilidad")
    private Date periodoVisibilidad;
    @Column(name = "extension_contrato")
    private int extensionContrato;
    @Column(name = "num_vacante")
    private int numVacante;

    @Column(name = "habilidades_blandas")
    private String habilidadesBlandas;

    @Column(name = "habilidades_tecnicas")
    private String habilidadesTecnicas;

    @Column(name = "idiomas")
    private String idiomas;

    @Column(name = "certificaciones")
    private String certificaciones;

    @Column(name = "experiencia_laboral")
    private String experienciaLaboral;

    //clase a y clase b, a esta asociado con una b, y b con muchas a, many to one
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Organizacion.class)
    @JoinColumn(name = "organizacion_id")
    private Organizacion organizacion;

    @ManyToOne(cascade = CascadeType.ALL, targetEntity = CoordinadorCarrera.class)
    @JoinColumn(name = "coordinador_id")
    private CoordinadorCarrera coordinadorCarrera;

    public OfertaLaboral(int id, String nombrePuesto, String tipoJornada, Date periodoVisibilidad,
                         int extensionContrato, int numVacante, Organizacion organizacion,
                         CoordinadorCarrera coordinadorCarrera, String habilidadesBlandas,
                         String habilidadesTecnicas, String idiomas, String certificaciones, String experienciaLaboral) {
        this.setHabilidadesBlandas(habilidadesBlandas);
        this.setHabilidadesTecnicas(habilidadesTecnicas);
        this.setIdiomas(idiomas);
        this.setCertificaciones(certificaciones);
        this.setExperienciaLaboral(experienciaLaboral);
        this.setCoordinadorCarrera(coordinadorCarrera);
        this.setId(id);
        this.setNombrePuesto(nombrePuesto);
        this.setTipoJornada(tipoJornada);
        this.setPeriodoVisibilidad(periodoVisibilidad);
        this.setExtensionContrato(extensionContrato);
        this.setNumVacante(numVacante);
        this.setOrganizacion(organizacion);
    }

    public OfertaLaboral() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public Date getPeriodoVisibilidad() {
        return periodoVisibilidad;
    }

    public void setPeriodoVisibilidad(Date periodoVisibilidad) {
        this.periodoVisibilidad = periodoVisibilidad;
    }

    public int getExtensionContrato() {
        return extensionContrato;
    }

    public void setExtensionContrato(int extensionContrato) {
        this.extensionContrato = extensionContrato;
    }

    public int getNumVacante() {
        return numVacante;
    }

    public void setNumVacante(int numVacante) {
        this.numVacante = numVacante;
    }

    public Organizacion getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(Organizacion organizacion) {
        this.organizacion = organizacion;
    }


    public CoordinadorCarrera getCoordinadorCarrera() {
        return coordinadorCarrera;
    }

    public void setCoordinadorCarrera(CoordinadorCarrera coordinadorCarrera) {
        this.coordinadorCarrera = coordinadorCarrera;
    }

    public String getHabilidadesBlandas() {
        return habilidadesBlandas;
    }

    public void setHabilidadesBlandas(String habilidadesBlandas) {
        this.habilidadesBlandas = habilidadesBlandas;
    }

    public String getHabilidadesTecnicas() {
        return habilidadesTecnicas;
    }

    public void setHabilidadesTecnicas(String habilidadesTecnicas) {
        this.habilidadesTecnicas = habilidadesTecnicas;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }
}
