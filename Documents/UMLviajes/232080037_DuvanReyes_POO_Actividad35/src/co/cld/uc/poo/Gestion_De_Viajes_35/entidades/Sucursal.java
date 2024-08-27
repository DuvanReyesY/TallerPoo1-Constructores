package co.cld.uc.poo.Gestion_De_Viajes_35.entidades;

import java.util.List;


public class Sucursal {
    private String codigo;
    private String direccion;
    private String telefono;
    private List<Turista> turista;
            
    public Sucursal() {
    }

    public Sucursal(String codigo, String direccion, String telefono, List<Turista> turista) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.turista = turista;
    }

    public List<Turista> getTurista() {
        return turista;
    }

    public void setTurista(List<Turista> turista) {
        this.turista = turista;
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    
}
