package com.talycapglobal.talycapglobal.models;

import javax.persistence.*;
@Entity
@Table(name = "usuario")
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    public Long getId() {
        return id;
    } 
    public void setId(Long id) {
        this.id = id;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTipoDocumento(tipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getPrimerNombre() {
        return primerNombre;
    }
    public String getSegundoNombre() {
        return segundoNombre;
    }
    public String getPrimerApellido() {
        return primerApellido;
    }
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public Long getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public tipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }
    private Long telefono;
    public ciudad getCiudad() {
        return ciudad;
    }
    public void setCiudad(ciudad ciudad) {
        this.ciudad = ciudad;
    }
    private String direccion;
    @OneToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name="tipoDocumento")
    private tipoDocumento tipoDocumento;
    @OneToOne(cascade = {CascadeType.REFRESH})
    @JoinColumn(name="ciudad")
    private ciudad ciudad;

    private String identificacion;
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
