/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ENUMS;

/**
 *
 * @author Alex
 */
public enum EntidadesEnum {
    
    MIEMBRO("Miembro ");


    String nombre;

    private EntidadesEnum(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
