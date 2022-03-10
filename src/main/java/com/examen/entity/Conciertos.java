
package com.examen.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Conciertos")
public class Conciertos implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idConciertos;
    
    private String Artista_asociado;
    private String costo_evento;
    private String fecha;
    private String capacidad;
    private String lugar;
    
 public Conciertos() {

    }
    public Conciertos(Conciertos conciertos) {
        this.idConciertos = conciertos.getIdConciertos();
        this.Artista_asociado = conciertos.getArtista_asociado();
        this.costo_evento = conciertos.getCosto_evento();
        this.fecha = conciertos.getFecha();
        this.capacidad=conciertos.getCapacidad();
        this.lugar = conciertos.getLugar();
    }

    
    public long getIdConciertos() {
        return idConciertos;
    }

    public void setIdConciertos(long idConciertos) {
        this.idConciertos = idConciertos;
    }

    public String getArtista_asociado() {
        return Artista_asociado;
    }

    public void setArtista_asociado(String Artista_asociado) {
        this.Artista_asociado = Artista_asociado;
    }

    public String getCosto_evento() {
        return costo_evento;
    }

    public void setCosto_evento(String costo_evento) {
        this.costo_evento = costo_evento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
}
