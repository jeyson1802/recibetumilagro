package com.recibetumilagro.cruzada.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "conferencia")
public class Conferencia {
    @Id
    @Column(name = "idconferencia", nullable = false)
    private Integer id;

    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;

    @Column(name = "fecha_inicial", nullable = false)
    private LocalDate fechaInicial;

    @Column(name = "fecha_final", nullable = false)
    private LocalDate fechaFinal;

    @Column(name = "lugar", nullable = false, length = 200)
    private String lugar;

    @Column(name = "horario", nullable = false, length = 200)
    private String horario;

    @Column(name = "correo", nullable = false, length = 200)
    private String correo;

    @Column(name = "contacto", nullable = false)
    private String contacto;

    @Column(name = "link_telegram", length = 200)
    private String linkTelegram;

    @Column(name = "id_email_marketing", length = 10)
    private String idEmailMarketing;

    @Column(name = "api_key_email_marketing", length = 200)
    private String apiKeyEmailMarketing;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idpais", nullable = false)
    private Pais pais;

    @Column(name = "estado", nullable = false, length = 1)
    private String estado;

    @Column(name = "fecha_registro", nullable = false)
    private Instant fechaRegistro;

    @Column(name = "usuario_registro", nullable = false, length = 45)
    private String usuarioRegistro;

    @Column(name = "fecha_modificacion")
    private Instant fechaModificacion;

    @Column(name = "usuario_modificacion", length = 45)
    private String usuarioModificacion;

    public Conferencia() {
    }

    public Conferencia(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getLinkTelegram() {
        return linkTelegram;
    }

    public void setLinkTelegram(String linkTelegram) {
        this.linkTelegram = linkTelegram;
    }

    public String getIdEmailMarketing() {
        return idEmailMarketing;
    }

    public void setIdEmailMarketing(String idEmailMarketing) {
        this.idEmailMarketing = idEmailMarketing;
    }

    public String getApiKeyEmailMarketing() {
        return apiKeyEmailMarketing;
    }

    public void setApiKeyEmailMarketing(String apiKeyEmailMarketing) {
        this.apiKeyEmailMarketing = apiKeyEmailMarketing;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Instant getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Instant fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(String usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public Instant getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Instant fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Override
    public String toString() {
        return "Conferencia{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", fechaInicial=" + fechaInicial +
                ", fechaFinal=" + fechaFinal +
                ", lugar='" + lugar + '\'' +
                ", horario='" + horario + '\'' +
                ", correo='" + correo + '\'' +
                ", contacto='" + contacto + '\'' +
                ", linkTelegram='" + linkTelegram + '\'' +
                ", idEmailMarketing='" + idEmailMarketing + '\'' +
                ", apiKeyEmailMarketing='" + apiKeyEmailMarketing + '\'' +
                ", pais=" + pais +
                ", estado='" + estado + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", usuarioRegistro='" + usuarioRegistro + '\'' +
                ", fechaModificacion=" + fechaModificacion +
                ", usuarioModificacion='" + usuarioModificacion + '\'' +
                '}';
    }
}