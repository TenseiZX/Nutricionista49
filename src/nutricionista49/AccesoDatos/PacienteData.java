
package nutricionista49.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nutricionista49.entidades.Paciente;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PacienteData {
    
    private Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    
    Paciente paciente=null;
    
    ArrayList <Paciente> pacientes=new ArrayList<>();
    
    
    public PacienteData() {
        con = Conexion.getConexion();
    }
    
    
    public void guardarPaciente(Paciente paciente){
    String sql= "INSERT INTO paciente(dni,apellido,nombre,domicilio,telefono,estado)"
                + "VALUES(?,?,?,?,?,?)";
    
   
    
        try {
            ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setString(4, paciente.getDomicilio());
            ps.setString(5, paciente.getTelefono());
            ps.setBoolean(6, paciente.isEstado());
            
            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            
            
            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente Guardado");
            }
            
            ps.close();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error entrada duplicada");
        }
    
    }
    
    
    public void eliminarPaciente(int id) {
        String sql = "UPDATE paciente SET estado=0 WHERE idPaciente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente");
        }
    }
    
    
    public void ModificarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET dni=?,apellido=?,nombre=?,domicilio=?,telefono=? WHERE idPaciente=? ";

        
        
        try {
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setString(4, paciente.getDomicilio());
            ps.setString(5, paciente.getTelefono());
            ps.setInt(6, paciente.getIdPaciente());
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente modificado exitosamente.");

            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: al acceder a la tabla paciente");
        }

    }
    
    
    public Paciente buscarPacientePorDni(int dni) {
        String sql = "SELECT idPaciente,dni,apellido,nombre,domicilio,telefono FROM paciente WHERE dni=?";
                
//        Paciente paciente=null;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "Error: El id del Paciente no existe. ");
                return null;
            }
            
            ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: al acceder a la tabla Paciente");
        }
        return paciente;

    }
    
    
    public List<Paciente> ListarPaciente(){
        
        List<Paciente> pacientes = new ArrayList<Paciente>();
        
        String sql="select dni,apellido,nombre,domicilio,telefono from paciente where estado=1;";
        
//        String [] datos =new String[5];
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Paciente paciente;
            
            while (rs.next()) {
                paciente = new Paciente();
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setEstado(true);
                
                pacientes.add(paciente);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pacientes");
        }
        return pacientes;
        
    }
    
    
    public List<Paciente> ListarPacienteID(int id){
        
        List<Paciente> pacientes = new ArrayList<Paciente>();
        
        String sql="select idPaciente,dni,apellido,nombre,domicilio,telefono from paciente where idPaciente=? and estado=1;";
        
//        String [] datos =new String[5];
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Paciente paciente;
            
            while (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                
                pacientes.add(paciente);

            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pacientes");
        }
        
        return pacientes;
        
    }
    
    
//    public void mostrarPacientes(JTable tablaPaciente){
//        
//        DefaultTableModel modelo=new DefaultTableModel(){
//            @Override
//            public boolean isCellEditable(int i, int i1) {
//                return false; // 
//            }
//        
//        };
//        
//        String sql="";
//        
//        modelo.addColumn("id");
//        modelo.addColumn("dni");
//        modelo.addColumn("apellido");
//        modelo.addColumn("nombre");
//        modelo.addColumn("domicilio");
//        modelo.addColumn("telefono");
//        
//        tablaPaciente.setModel(modelo);
//        
//        sql="select * from paciente where estado=1;";
//        
//        String [] datos =new String[6];
//        
//        try {
//            ps=con.prepareStatement(sql);
//            rs=ps.executeQuery();
//            
//            while(rs.next()){
//            datos [0]=rs.getString(1);
//            datos [1]=rs.getString(2);
//            datos [2]=rs.getString(3);
//            datos [3]=rs.getString(4);
//            datos [4]=rs.getString(5);
//            datos [5]=rs.getString(6);
//            
//            modelo.addRow(datos);
//            }
//            
//            tablaPaciente.setModel(modelo);
//            
//            
//            
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error: al acceder a los datos de la base de datos");
//        }
//        
//    }
    
    
    
    
    
}
