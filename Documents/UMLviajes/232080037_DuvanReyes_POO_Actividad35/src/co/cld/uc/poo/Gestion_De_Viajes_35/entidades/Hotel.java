package co.cld.uc.poo.Gestion_De_Viajes_35.entidades;

import java.util.List;

public class Hotel {
    protected String codigo;
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String ciudad;
    private int noDePlazas;
    private List<Hospedaje> hospedaje;

    public Hotel(String codigo, String nombre, String direccion, String telefono, String ciudad, int noDePlazas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.noDePlazas = noDePlazas;
    }

    public Hotel() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNoDePlazas() {
        return noDePlazas;
    }

    public void setNoDePlazas(int noDePlazas) {
        this.noDePlazas = noDePlazas;
    }

    
}
