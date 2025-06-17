package com.banquito.core.clientes.modelo;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "accionistas_empresas", schema = "public")
public class AccionistasEmpresas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_accionista", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresas idEmpresa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_participe", nullable = false)
    private Empresas idParticipe;

    @Column(name = "participacion", nullable = false, precision = 5, scale = 2)
    private BigDecimal participacion;

    @Column(name = "tipo_entidad_participe", nullable = false, length = 10)
    private String tipoEntidadParticipe;

    @Column(name = "estado", nullable = false, length = 15)
    private String estado;

    @Version
    @Column(name = "version", nullable = false)
    private Long version;

    // Constructores
    public AccionistasEmpresas() {
    }

    public AccionistasEmpresas(Integer id) {
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

    public Empresas getIdParticipe() {
        return idParticipe;
    }

    public void setIdParticipe(Empresas idParticipe) {
        this.idParticipe = idParticipe;
    }

    public BigDecimal getParticipacion() {
        return participacion;
    }

    public void setParticipacion(BigDecimal participacion) {
        this.participacion = participacion;
    }

    public String getTipoEntidadParticipe() {
        return tipoEntidadParticipe;
    }

    public void setTipoEntidadParticipe(String tipoEntidadParticipe) {
        this.tipoEntidadParticipe = tipoEntidadParticipe;
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
        AccionistasEmpresas that = (AccionistasEmpresas) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString con todas las propiedades
    @Override
    public String toString() {
        return "AccionistasEmpresas{" +
                "id=" + id +
                ", idEmpresa=" + idEmpresa +
                ", idParticipe=" + idParticipe +
                ", participacion=" + participacion +
                ", tipoEntidadParticipe='" + tipoEntidadParticipe + '\'' +
                ", estado='" + estado + '\'' +
                ", version=" + version +
                '}';
    }
}