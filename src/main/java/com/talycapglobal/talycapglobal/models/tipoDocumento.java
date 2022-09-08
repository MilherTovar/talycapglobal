package com.talycapglobal.talycapglobal.models;

import javax.persistence.*;

@Entity
@Table(name="tipoDocumento")
public class tipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Long getId() {
        return id;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    private String tipoDocumento;
    public void setId(Long id) {
        this.id = id;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    private String descripcion;
}
