/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author omar5
 */
public class Acudiente implements Interfaces {

    private String Nombre, telefono;

    public Acudiente(String Nombre, String telefono) {
        this.Nombre = Nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String getInfo() {
        String Info = "";
        Info = "dato del acudiente:\n"
                + "Nombre: " + getNombre()
                + "\n Telefono: " + getTelefono();
        return Info;

    }
}
