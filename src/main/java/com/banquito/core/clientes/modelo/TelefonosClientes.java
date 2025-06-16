package com.banquito.core.clientes.modelo;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "telefonos_clientes", schema = "public")
public class TelefonosClientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_telefono", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Clientes idCliente;

    @Column(name = "id_cliente", insertable = false, updatable = false)
    private Integer idClienteId;

    @Column(name = "tipo", nullable = false, length = 10)
    private String tipo;

    @Column(name = "numero_telefono", nullable = false, length = 10)
    private String numeroTelefono;

    @Column(name = "fecha_creacion", nullable = false)
    private Instant fechaCreacion;

    @Column(name = "fechaactualizacion", nullable = false)
    private Instant fechaactualizacion;

    @Column(name = "estado", nullable = false, length = 15)
    private String estado;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    // Constructores
    public TelefonosClientes() {
    }

    public TelefonosClientes(Integer id) {
        this.id = id;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdClienteId() {
        return idClienteId;
    }

    public void setIdClienteId(Integer idClienteId) {
        this.idClienteId = idClienteId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Instant getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Instant fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Instant getFechaactualizacion() {
        return fechaactualizacion;
    }

    public void setFechaactualizacion(Instant fechaactualizacion) {
        this.fechaactualizacion = fechaactualizacion;
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
        TelefonosClientes that = (TelefonosClientes) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString con todas las propiedades
    @Override
    public String toString() {
        return "TelefonosClientes{" +
                "id=" + id +
                ", idClienteId=" + idClienteId +
                ", tipo='" + tipo + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaactualizacion=" + fechaactualizacion +
                ", estado='" + estado + '\'' +
                ", version=" + version +
                '}';
    }
}