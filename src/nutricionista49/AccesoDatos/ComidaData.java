
package nutricionista49.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import nutricionista49.entidades.Comida;


public class ComidaData {
    
    private Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    
    Comida comida=null;
    
    ArrayList <Comida> comidas=new ArrayList<>();
    
    
    public ComidaData() {
        con = Conexion.getConexion();
    }
    
    
    public void guardarComida(Comida comida){
    String sql= "INSERT INTO comida(nombre,detalle,cantCalorias,estado)"
                + "VALUES(?,?,?,?)";
    
   
    
        try {
            ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setBoolean(4, comida.isEstado());
            
            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            
            
            if (rs.next()) {
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida Guardada");
            }
            
            ps.close();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error entrada duplicada");
        }
    
    }
    
    
    public void eliminarComida(int id) {
        String sql = "UPDATE comida SET estado=0 WHERE idComida=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Comida eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Comida");
        }
    }
    
    
    public void ModificarComida(Comida comida) {
        String sql = "UPDATE comida SET nombre=?,detalle=?,cantCalorias=? WHERE idComida=? ";

        
        
        try {
            ps = con.prepareStatement(sql);
            
            
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setInt(4, comida.getIdComida());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Comida modificada exitosamente.");

            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: al acceder a la tabla Comida");
        }

    }
    
    
    public Comida buscarComida(int id) {
        String sql = "select nombre, detalle, cantCalorias from comida where idComida=? ";
                
//        Comida comida=null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                comida = new Comida();
                
                comida.setIdComida(id);
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "Error: El id de la comida no existe. ");
                return null;
            }
            
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: al acceder a la tabla Comida");
        }
        return comida;

    }
    
    
    public List<Comida> ListarComida(){
        
        List<Comida> comidas = new ArrayList<Comida>();
        
        String sql="select idComida,nombre,detalle,cantCalorias from comida where estado=1;";
        
//        String [] datos =new String[5];
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Comida comida;
            
            while (rs.next()) {
                comida = new Comida();
               
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(true);
                
                comidas.add(comida);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pacientes");
        }
        return comidas;
        
    }
    
    
    public List<Comida> ListarComidaID(int id){
        
        List<Comida> comidas = new ArrayList<Comida>();
        
        String sql="select idComida,nombre,detalle,cantCalorias from comida where idcomida=? and estado=1;";
        
//        String [] datos =new String[5];
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Comida comida;
            
            while (rs.next()) {
                comida = new Comida();
                
                comida.setIdComida(rs.getInt("idComida"));
                
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                
                
                
                comidas.add(comida);

            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla comida");
        }
        
        return comidas;
        
    }
    
    
//    private List<Comida> ListarCaloria(int caloria) {
//        
//        List<Comida> comidas = new ArrayList<Comida>();
//    
//        String sql= "select * from comida where cantCalorias<?;";
//        
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, caloria);
//            rs = ps.executeQuery();
//            
//            Comida comida;
//            
//            while (rs.next()) {
//                comida = new Comida();
//                
//                comida.setIdComida(rs.getInt("idComida"));
//                comida.setNombre(rs.getString("nombre"));
//                comida.setDetalle(rs.getString("detalle"));
//                comida.setCantCalorias(rs.getInt("cantCalorias"));
//                
//                comidas.add(comida);
//
//            }
//            ps.close();
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla comida");
//        }
//       
//        return comidas;
//       
//    }
    
    
    public List<Comida> ListarCaloria(int caloria){
        
        List<Comida> comidas = new ArrayList<Comida>();
        
        String sql="select * from comida where cantCalorias<? and estado=1;";
        
//        String [] datos =new String[5];
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, caloria);
            rs = ps.executeQuery();
            Comida comida;
            
            while (rs.next()) {
                comida = new Comida();
                
                comida.setIdComida(rs.getInt("idComida"));
                
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                
                
                
                comidas.add(comida);

            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla comida");
        }
        
        return comidas;
        
    }
    
    
    
    
}
