package com.banquito.core.clientes.modelo;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "direcciones_clientes", schema = "public")
public class DireccionesClientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_direccion", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Clientes idCliente;

    @Column(name = "tipo", nullable = false, length = 15)
    private String tipo;

    @Column(name = "linea1", nullable = false, length = 150)
    private String linea1;

    @Column(name = "linea2", length = 150)
    private String linea2;

    @Column(name = "codigo_postal", nullable = false, length = 6)
    private String codigoPostal;

    @Column(name = "codigo_geografico", nullable = false, length = 20)
    private String codigoGeografico;

    @Column(name = "fecha_creacion", nullable = false)
    private Instant fechaCreacion;

    @Column(name = "fecha_actualizacion", nullable = false)
    private Instant fechaActualizacion;

    @Column(name = "estado", nullable = false, length = 15)
    private String estado;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    // Constructores
    public DireccionesClientes() {
    }

    public DireccionesClientes(Integer id) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLinea1() {
        return linea1;
    }

    public void setLinea1(String linea1) {
        this.linea1 = linea1;
    }

    public String getLinea2() {
        return linea2;
    }

    public void setLinea2(String linea2) {
        this.linea2 = linea2;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCodigoGeografico() {
        return codigoGeografico;
    }

    public void setCodigoGeografico(String codigoGeografico) {
        this.codigoGeografico = codigoGeografico;
    }

    public Instant getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Instant fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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
        DireccionesClientes that = (DireccionesClientes) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString con todas las propiedades
    @Override
    public String toString() {
        return "DireccionesClientes{" +
                "id=" + id +
                ", idCliente=" + idCliente +
                ", tipo='" + tipo + '\'' +
                ", linea1='" + linea1 + '\'' +
                ", linea2='" + linea2 + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", codigoGeografico='" + codigoGeografico + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                ", estado='" + estado + '\'' +
                ", version=" + version +
                '}';
    }
}