
package co.cld.uc.poo.Gestion_De_Viajes_35.entidades;

import java.util.List;

public class Cadena {
    private List<Sucursal> sucursales;
    private List<Hotel> hoteles;
    private List<Vuelo> vuelos;
    private List<Turista> turistas;
    private String telefono;

    public Cadena(List<Sucursal> sucursales, List<Hotel> hoteles, List<Vuelo> vuelos, List<Turista> turistas, String telefono) {
        this.sucursales = sucursales;
        this.hoteles = hoteles;
        this.vuelos = vuelos;
        this.turistas = turistas;
        this.telefono = telefono;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public List<Hotel> getHoteles() {
        return hoteles;
    }

    public void setHoteles(List<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public List<Turista> getTuristas() {
        return turistas;
    }

    public void setTuristas(List<Turista> turistas) {
        this.turistas = turistas;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
