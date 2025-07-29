/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



import java.sql.Timestamp;
import java.util.Date;

public class Reserva {
    private int idReserva;
    private int idUsuario;
    private int idVuelo;
    private int cantidadAsientos;
    private Date fechaReserva;

    public Reserva() {}

    public Reserva(int idReserva, int idUsuario, int idVuelo, int cantidadAsientos, Date fechaReserva) {
        this.idReserva = idReserva;
        this.idUsuario = idUsuario;
        this.idVuelo = idVuelo;
        this.cantidadAsientos = cantidadAsientos;
        this.fechaReserva = fechaReserva;
    }


    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }
    
    public int getIdVuelo() {
        return idVuelo;
    }
  
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    
    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
    
    public Date getFechaReserva() {
        return fechaReserva;
    }  

    public Timestamp getFechaR() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Timestamp getFecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
