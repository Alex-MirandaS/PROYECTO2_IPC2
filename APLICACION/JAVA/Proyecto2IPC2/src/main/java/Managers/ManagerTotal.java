/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Managers;

import BaseDatos.Conexion;
import ENUMS.EntidadesEnum;
import Recursos.QuerysBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class ManagerTotal {

    private Connection conexion;
    private QuerysBD querys;
    // QUERYS   
//    private String insertarCaja = "INSERT INTO Miembro (Ganacia, Valor) VALUES(?,?)";
//    private String borrarCaja = "DELETE FROM Caja WHERE id_Caja = ?";
//    private String seleccionarCaja = "SELECT * FROM Caja WHERE id_Caja = ?";
//
//     private String seleccionarEstado = "SELECT * FROM Caja WHERE Ganacia = ?";
//    private String seleccionarTodo = "SELECT * FROM Caja";
//    private String updateEstado = "UPDATE Caja SET Ganacia = ? WHERE id_Caja = ?";
//    private String updateValor = "UPDATE Caja SET Valor = ? WHERE id_Caja = ?";

    public ManagerTotal() {
        this.conexion = Conexion.getConnection();
        querys = new QuerysBD();
    }

    public void insertarEntidad(String[] datos, EntidadesEnum entidad) {

        try {
            String insertarEntidad = querys.getInsertar()
                    + entidad.getNombre()
                    + "(" + atributos(entidad) + ") "
                    + querys.getValues()
                    + "(" + agregarSignosI(atributos(entidad).toCharArray().length) + ")";
            PreparedStatement ps = conexion.prepareStatement(insertarEntidad);
            ps.setString(1, datos[0]);
            ps.setString(2, datos[1]);
            ps.setString(3, datos[2]);
            ps.setString(4, datos[3]);
            ps.setDouble(5, Double.parseDouble(datos[4]));
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ManagerTotal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String atributos(EntidadesEnum entidad) {
        String[] retornar = null;
        switch (entidad) {
            case MIEMBRO:
                retornar = querys.getAtributosEntidad();
                break;
        }
        return agregarComas(retornar);
    }

    private String agregarComas(String[] atributos) {
        String atributosTexto = "";
        for (int i = 0; i < atributos.length; i++) {
            if (!(i + 1 == atributos.length)) {
                atributosTexto += atributos[i] + ",";
            } else {
                atributosTexto += atributos[i];
            }
        }
        return atributosTexto;
    }

    private String agregarSignosI(int cantidad) {
        String valores = "";
        for (int i = 0; i < cantidad; i++) {
            if (!(i + 1 == cantidad)) {
                valores += querys.getSignoI() + ",";
            } else {
                valores += querys.getSignoI();
            }
        }
        return valores;
    }

//    public void borrarCaja(int idCaja) {
//
//        try {
//            PreparedStatement ps = conexion.prepareStatement(borrarCaja);
//            ps.setInt(1, idCaja);
//            ps.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(ManagerTotal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public void updateCaja(int idCaja, String datoCambiado, CajaEnum tipoCambio) {
//
//        try {
//            PreparedStatement ps = null;
//
//            switch (tipoCambio) {
//                case Estado:
//                    ps = conexion.prepareStatement(updateEstado);
//                    ps.setBoolean(1, Boolean.parseBoolean(datoCambiado));
//                    ps.setInt(2, idCaja);
//                    break;
//                case Valor:
//                    ps = conexion.prepareStatement(updateValor);
//                    ps.setDouble(1, Double.parseDouble(datoCambiado));
//                    ps.setInt(2, idCaja);
//                    break;
//            }
//            ps.executeUpdate();
//        } catch (SQLException ex) {
//            Logger.getLogger(ManagerTotal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public ArrayList<Caja> seleccionarTodo() {
//        ArrayList<Caja> cajas = new ArrayList<>();
//        try {
//            PreparedStatement ps = conexion.prepareStatement(seleccionarTodo);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int idCaja = rs.getInt("id_Caja");
//                boolean estado = rs.getBoolean("Ganacia");
//                double valor = rs.getDouble("Valor");
//                cajas.add(new Caja(valor, idCaja, estado));
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ManagerTotal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return cajas;
//    }
//
//    public Caja seleccionarCaja(int idCaja) {
//        Caja caja = null;
//        try {
//
//            PreparedStatement ps = conexion.prepareStatement(seleccionarCaja);
//            ps.setInt(1, idCaja);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                boolean estado = rs.getBoolean("Ganacia");
//                double valor = rs.getDouble("Valor");
//                caja = new Caja(valor, idCaja, estado);
//                break;
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ManagerTotal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return caja;
//    }
//
//    public ArrayList<Caja> seleccionarEstado(boolean ganancia) {
//        ArrayList<Caja> cajas = new ArrayList<>();
//        try {
//
//            PreparedStatement ps = conexion.prepareStatement(seleccionarEstado);
//            ps.setBoolean(1, ganancia);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int idCaja = rs.getInt("id_Caja");
//                double valor = rs.getDouble("Valor");
//                cajas.add(new Caja(valor, idCaja, ganancia));
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(ManagerTotal.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return cajas;
//    }

}
