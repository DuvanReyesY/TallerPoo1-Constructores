package co.cld.uc.poo.Gestion_De_Viajes_35.entidades;

import java.util.Date;
import java.util.List;

public class ReservaVuelo extends Vuelo {
    
    private String clase;
    private Vuelo vuelo;
    
    public ReservaVuelo() {
    }

    public ReservaVuelo(String clase, Vuelo vuelo, String numero, Date fechaHora, String origen, String destino, int plazasTotales, int plazasClaseTurista, List<Object> reserva) {
        this.clase = clase;
        this.vuelo = vuelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPlazasTotales() {
        return plazasTotales;
    }

    public void setPlazasTotales(int plazasTotales) {
        this.plazasTotales = plazasTotales;
    }

    public int getPlazasClaseTurista() {
        return plazasClaseTurista;
    }

    public void setPlazasClaseTurista(int plazasClaseTurista) {
        this.plazasClaseTurista = plazasClaseTurista;
    }
    
}
