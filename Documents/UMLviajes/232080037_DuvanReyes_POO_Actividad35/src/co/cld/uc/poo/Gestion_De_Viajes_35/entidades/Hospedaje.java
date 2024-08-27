package co.cld.uc.poo.Gestion_De_Viajes_35.entidades;

import java.util.Date;

public class Hospedaje extends Hotel{
    private Date fechaLlegada;
    private String regimen;
    private Date fechaPartida;
    private Hotel hotel;
    
    public Hospedaje(Date fechaLlegada, String regimen, Date fechaPartida, String codigo, String nombre, String direccion, String telefono, String ciudad, int noDePlazas) {
        super(codigo, nombre, direccion, telefono, ciudad, noDePlazas);
        this.fechaLlegada = fechaLlegada;
        this.regimen = regimen;
        this.fechaPartida = fechaPartida;
    }

    public Hospedaje() {
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public Date getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(Date fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    
}
