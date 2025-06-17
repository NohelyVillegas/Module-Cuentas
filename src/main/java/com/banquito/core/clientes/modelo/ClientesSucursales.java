package com.banquito.core.clientes.modelo;
import com.banquito.core.general.modelo.Sucursales;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clientes_sucursales", schema = "public")
public class ClientesSucursales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente_sucursal", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente", nullable = false)
    private Clientes idCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_sucursal", nullable = false)
    private Sucursales codigoSucursal;

    @Column(name = "codigo_sucursal", insertable = false, updatable = false)
    private String codigoSucursalId;

    @Column(name = "estado", nullable = false, length = 15)
    private String estado;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    // Constructores
    public ClientesSucursales() {
    }

    public ClientesSucursales(Integer id) {
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

    public Sucursales getCodigoSucursal() {
        return codigoSucursal;
    }

    public void setCodigoSucursal(Sucursales codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }

    public String getCodigoSucursalId() {
        return codigoSucursalId;
    }

    public void setCodigoSucursalId(String codigoSucursalId) {
        this.codigoSucursalId = codigoSucursalId;
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
        ClientesSucursales that = (ClientesSucursales) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString con todas las propiedades
    @Override
    public String toString() {
        return "ClientesSucursales{" +
                "id=" + id +
                ", idCliente=" + idCliente +
                ", codigoSucursalId='" + codigoSucursalId + '\'' +
                ", estado='" + estado + '\'' +
                ", version=" + version +
                '}';
    }
}