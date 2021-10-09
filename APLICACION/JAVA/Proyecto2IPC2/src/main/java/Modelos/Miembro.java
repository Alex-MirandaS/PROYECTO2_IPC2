/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelos;

import ENUMS.TipoMiembroEnum;

/**
 * 
 * @author Alex
 */
public class Miembro {

    private Integer nombreMiembro;
    private Integer descripcionMiembro;
    private Integer contraseña;
    private Integer capital;
    private TipoMiembroEnum tipoMiembro;

    public Miembro(Integer nombreMiembro, Integer descripcionMiembro, Integer contraseña, Integer capital, TipoMiembroEnum tipoMiembro) {
        this.nombreMiembro = nombreMiembro;
        this.descripcionMiembro = descripcionMiembro;
        this.contraseña = contraseña;
        this.capital = capital;
        this.tipoMiembro = tipoMiembro;
    }

    public Integer getNombreMiembro() {
        return nombreMiembro;
    }

    public Integer getDescripcionMiembro() {
        return descripcionMiembro;
    }

    public Integer getContraseña() {
        return contraseña;
    }

    public Integer getCapital() {
        return capital;
    }

    public TipoMiembroEnum getTipoMiembro() {
        return tipoMiembro;
    }


    
}
