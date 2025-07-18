package com.banquito.core.cuentas.modelo;

import com.banquito.core.general.modelo.Monedas;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "tipos_cuentas")
public class TiposCuentas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_cuenta", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "id_moneda", nullable = false)
    private Monedas idMoneda;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "id_tasa_interes_por_defecto", nullable = false)
    private TasasIntereses idTasaInteresPorDefecto;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", length = 150)
    private String descripcion;

    @Column(name = "requisitos_apertura", nullable = false, length = 300)
    private String requisitosApertura;

    @Column(name = "tipo_cliente", nullable = false, length = 15)
    private String tipoCliente;

    @Column(name = "fecha_creacion", nullable = false)
    private Instant fechaCreacion;

    @Column(name = "fecha_modificacion", nullable = false)
    private Instant fechaModificacion;

    @Column(name = "estado", nullable = false, length = 15)
    private String estado;

    @Column(name = "version", nullable = false, precision = 9)
    private BigDecimal version;

    @OneToMany(mappedBy = "idTipoCuenta")
    private Set<Cuentas> cuentas = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Monedas getIdMoneda() {
        return idMoneda;
    }

    public void setIdMoneda(Monedas idMoneda) {
        this.idMoneda = idMoneda;
    }

    public TasasIntereses getIdTasaInteresPorDefecto() {
        return idTasaInteresPorDefecto;
    }

    public void setIdTasaInteresPorDefecto(TasasIntereses idTasaInteresPorDefecto) {
        this.idTasaInteresPorDefecto = idTasaInteresPorDefecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRequisitosApertura() {
        return requisitosApertura;
    }

    public void setRequisitosApertura(String requisitosApertura) {
        this.requisitosApertura = requisitosApertura;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Instant getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Instant fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Instant getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Instant fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public Set<Cuentas> getCuentas() {
        return cuentas;
    }

    public void setCuentas(Set<Cuentas> cuentas) {
        this.cuentas = cuentas;
    }

}