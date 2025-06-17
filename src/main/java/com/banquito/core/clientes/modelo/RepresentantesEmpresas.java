package com.banquito.core.clientes.modelo;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.Objects;

@Entity
@Table(name = "representantes_empresas", schema = "public")
public class RepresentantesEmpresas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_representante", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresas idEmpresa;

    @Column(name = "id_empresa", insertable = false, updatable = false)
    private Integer idEmpresaId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Clientes idCliente;

    @Column(name = "rol", nullable = false, length = 25)
    private String rol;

    @Column(name = "fecha_asignacion", nullable = false)
    private Instant fechaAsignacion;

    @Column(name = "estado", nullable = false, length = 15)
    private String estado;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    // Constructores
    public RepresentantesEmpresas() {
    }

    public RepresentantesEmpresas(Integer id) {
        this.id = id;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Empresas getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresas idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getIdEmpresaId() {
        return idEmpresaId;
    }

    public void setIdEmpresaId(Integer idEmpresaId) {
        this.idEmpresaId = idEmpresaId;
    }

    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Instant getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Instant fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
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
        RepresentantesEmpresas that = (RepresentantesEmpresas) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString con todas las propiedades
    @Override
    public String toString() {
        return "RepresentantesEmpresas{" +
                "id=" + id +
                ", idEmpresaId=" + idEmpresaId +
                ", idCliente=" + idCliente +
                ", rol='" + rol + '\'' +
                ", fechaAsignacion=" + fechaAsignacion +
                ", estado='" + estado + '\'' +
                ", version=" + version +
                '}';
    }
}