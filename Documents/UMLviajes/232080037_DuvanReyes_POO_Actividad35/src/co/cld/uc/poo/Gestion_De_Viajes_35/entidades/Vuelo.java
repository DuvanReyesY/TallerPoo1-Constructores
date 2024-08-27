package co.cld.uc.poo.Gestion_De_Viajes_35.entidades;

import java.util.Date;
import java.util.List;

public class Vuelo {
    protected String numero;
    protected Date fechaHora;
    protected String origen;
    protected String destino;
    protected int plazasTotales;
    protected int plazasClaseTurista;
    private List<ReservaVuelo> reserva;
    
    public Vuelo() {
    }

    public Vuelo(String numero, Date fechaHora, String origen, String destino, int plazasTotales, int plazasClaseTurista, List<ReservaVuelo> reserva) {
        this.numero = numero;
        this.fechaHora = fechaHora;
        this.origen = origen;
        this.destino = destino;
        this.plazasTotales = plazasTotales;
        this.plazasClaseTurista = plazasClaseTurista;
        this.reserva = reserva;
    }

    public List<ReservaVuelo> getReserva() {
        return reserva;
    }

    public void setReserva(List<ReservaVuelo> reserva) {
        this.reserva = reserva;
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
