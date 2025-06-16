package com.banquito.core.clientes.modelo;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "empresas", schema = "public")
public class Empresas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa", nullable = false)
    private Integer id;

    @Column(name = "tipo_identificacion", nullable = false, length = 10)
    private String tipoIdentificacion;

    @Column(name = "numero_identificacion", nullable = false, length = 13)
    private String numeroIdentificacion;

    @Column(name = "nombre_comercial", nullable = false, length = 100)
    private String nombreComercial;

    @Column(name = "razon_social", nullable = false, length = 100)
    private String razonSocial;

    @Column(name = "tipo", nullable = false, length = 10)
    private String tipo;

    @Column(name = "fecha_constitucion", nullable = false)
    private LocalDate fechaConstitucion;

    @Column(name = "correo_electronico", nullable = false, length = 40)
    private String correoElectronico;

    @Column(name = "sector_economico", nullable = false, length = 15)
    private String sectorEconomico;

    @Column(name = "fecha_registro", nullable = false)
    private Instant fechaRegistro;

    @Column(name = "fecha_actualizacion", nullable = false)
    private Instant fechaActualizacion;

    @Column(name = "estado", nullable = false, length = 15)
    private String estado;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    // Constructores
    public Empresas() {
    }

    public Empresas(Integer id) {
        this.id = id;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaConstitucion() {
        return fechaConstitucion;
    }

    public void setFechaConstitucion(LocalDate fechaConstitucion) {
        this.fechaConstitucion = fechaConstitucion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSectorEconomico() {
        return sectorEconomico;
    }

    public void setSectorEconomico(String sectorEconomico) {
        this.sectorEconomico = sectorEconomico;
    }

    public Instant getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Instant fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Instant getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Instant fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    // equals y hashCode usando solo la clave primaria
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresas empresas = (Empresas) o;
        return Objects.equals(id, empresas.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString con todas las propiedades
    @Override
    public String toString() {
        return "Empresas{" +
                "id=" + id +
                ", tipoIdentificacion='" + tipoIdentificacion + '\'' +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", nombreComercial='" + nombreComercial + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fechaConstitucion=" + fechaConstitucion +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", sectorEconomico='" + sectorEconomico + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaActualizacion=" + fechaActualizacion +
                ", estado='" + estado + '\'' +
                ", version=" + version +
                '}';
    }
}