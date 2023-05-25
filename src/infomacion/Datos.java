/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infomacion;

/**
 *
 * @author shack
 */
public class Datos {
    String nombre;
    String fechan;
    String CURP;

    public Datos(String nombre, String fechan, String CURP) {
        this.nombre = nombre;
        this.fechan = fechan;
        this.CURP = CURP;
    }

    public Datos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechan() {
        return fechan;
    }

    public void setFechan(String fechan) {
        this.fechan = fechan;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }
    
}
