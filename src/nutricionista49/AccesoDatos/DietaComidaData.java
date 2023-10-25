
package nutricionista49.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import nutricionista49.entidades.Comida;
import nutricionista49.entidades.Dieta;
import nutricionista49.entidades.DietaComida;


public class DietaComidaData {
    
    private Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    
    DietaComida dc=null;
    
    private ComidaData cd = new ComidaData();
    private DietaData dd = new DietaData();
    
    
    
    public DietaComidaData() {
        con = Conexion.getConexion();
    }
    
    
    
    public void guardarDietaComida(DietaComida dietacomida){
        
        String sql= "insert into dietacomida(idComida,idDieta,estado) values (?,?,?) ";
        
        try {
            ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            
            
            ps.setInt(1, dietacomida.getComida().getIdComida());
            ps.setInt(2, dietacomida.getDieta().getIdDieta());
            ps.setBoolean(3, dietacomida.isEstado());
            
            
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            
            if (rs.next()==true) {

                dietacomida.setIdDietaComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "DietaComida guardada con exito");

            }

            ps.close();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a dietaComida");
        }
    
    
    }
    
    
//    public List<DietaComida> listarPermitidas(){
//        
//    List<DietaComida> dietacomidas = new ArrayList<DietaComida>();
//    
//    String sql="select * from dietacomida where estado=1;";
//        
//
//        
//        try {
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            DietaComida dietacomida;
//            
//            while (rs.next()) {
//                dietacomida = new DietaComida();
//               
//                
//                Comida com = cd.buscarComida(rs.getInt("idComida"));
//                dietacomida.setComida(com);
//                
//                Dieta diet= dd.buscarDietaID(rs.getInt("idDieta"));
//                dietacomida.setDieta(diet);
//                
////                dietacomida.setNombre(rs.getString("nombre"));
////                dietacomida.setDetalle(rs.getString("detalle"));
////                dietacomida.setCantCalorias(rs.getInt("cantCalorias"));
//                dietacomida.setEstado(true);
//                
//                dietacomidas.add(dietacomida);
//
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pacientes");
//        }
//        return dietacomidas;
//    
//    }
    
    
    public List<DietaComida> listarPermitidas(int id){
        
    List<DietaComida> dietacomidas = new ArrayList<DietaComida>();
    
    String sql="SELECT dietacomida.idDieta,dietacomida.idComida FROM dietacomida JOIN dieta on (dietacomida.idDieta = dieta.idDieta) join comida on (dietacomida.idComida = comida.idComida) WHERE dietacomida.idDieta = ? and comida.estado=1;";
        

        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            DietaComida dietacomida;
            
            while (rs.next()) {
                dietacomida = new DietaComida();
               
                
                Comida com = cd.buscarComida(rs.getInt("idComida"));
                dietacomida.setComida(com);
                
                Dieta diet= dd.buscarDietaID(rs.getInt("idDieta"));
                
                dietacomida.setDieta(diet);
                
                dietacomida.setEstado(true);
                
                dietacomidas.add(dietacomida);

            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pacientes");
        }
        return dietacomidas;
    
    }
    
    
    public void borrarIngrediente(int idComida, int idDieta) {

        String sql = "delete from dietacomida where idComida=? and idDieta=?";

        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, idComida);
            ps.setInt(2, idDieta);
            
          int msj=JOptionPane.showConfirmDialog(null,"¿Esta seguro que desea dar de baja esté ingrediente?");
          if(msj==0){
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "ingrediente retirado de la dieta");
          }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: al acceder a la BD"+ex);
        }

    }
    
    public boolean buscarComida(int idComida, int idDieta){
    
    String sql = "select * from dietacomida where idComida=? and idDieta=?";

        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, idComida);
            ps.setInt(2, idDieta);
            rs=ps.executeQuery();
            
            if(rs.next()){
            return true;
            
            }
            
            return false;
    
        
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "entrada duplicada"+ex);
        }
        
    return false;
    
    }
    
}
