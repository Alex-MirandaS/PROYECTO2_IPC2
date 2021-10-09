/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Recursos;

/**
 * 
 * @author Alex
 */
public class QuerysBD {
    //Principales
    private String insertar = "INSERT INTO ";
    private String borrar = "DELETE FROM ";
    private String seleccionar = "SELECT * FROM "; 
    private String update = "UPDATE ";
    //Complementos
    private String where = "WHERE ";
    private String set = "SET ";
    private String values = "VALUES ";
    private String signoI = "?";
    private String igual = "= ";
    //Entidades
    //Miembro
    private String [] atributosEntidad = {"Nombre_Miembro","Descripcion_Miembro","Contraseña","Tipo","Cantidad_Capital"}; 

    public String getInsertar() {
        return insertar;
    }

    public String getBorrar() {
        return borrar;
    }

    public String getSeleccionar() {
        return seleccionar;
    }

    public String getUpdate() {
        return update;
    }

    public String getWhere() {
        return where;
    }

    public String getSet() {
        return set;
    }

    public String getSignoI() {
        return signoI;
    }

    public String getValues() {
        return values;
    }

    public String getIgual() {
        return igual;
    }

    public String[] getAtributosEntidad() {
        return atributosEntidad;
    }
    
    
    
}
