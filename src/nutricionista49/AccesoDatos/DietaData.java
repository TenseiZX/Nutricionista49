package nutricionista49.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import nutricionista49.entidades.Comida;
import nutricionista49.entidades.Dieta;
import nutricionista49.entidades.Paciente;

public class DietaData {

    private Connection con = null;
    PreparedStatement ps;
    ResultSet rs;

    Dieta dieta = null;

    private PacienteData pd = new PacienteData();

    public DietaData() {
        con = Conexion.getConexion();
    }

    public void guardarDieta(Dieta dieta) {

        String sql = "INSERT INTO dieta(idPaciente, nombre,fechaInicial,fechaFinal,pesoInicial,pesoFinal,estado) VALUES (?,?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, dieta.getPaciente().getIdPaciente());

            ps.setString(2, dieta.getNombre());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(4, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(5, dieta.getPesoInicial());
            ps.setDouble(6, dieta.getPesoFinal());
            ps.setBoolean(7, dieta.isEstado());

            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (rs.next()) {

                dieta.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta guardada con exito");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: acceso a base de datos" + ex);
        }

    }

    public List<Dieta> ListarDieta() {

        List<Dieta> dietas = new ArrayList<Dieta>();

        String sql = "select * from dieta where estado=1;";

//        String [] datos =new String[5];
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Dieta dieta;

            while (rs.next()) {
                Dieta diet = new Dieta();
                diet.setIdDieta(rs.getInt("idDieta"));
                
                Paciente pac = pd.buscarPacienteID(rs.getInt("idPaciente"));
                diet.setPaciente(pac);
                
                diet.setNombre(rs.getString("nombre"));
                diet.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                diet.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                diet.setPesoInicial(rs.getDouble("pesoInicial"));
                diet.setPesoFinal(rs.getDouble("pesoFinal"));
                dietas.add(diet);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
        return dietas;
    }

    public void eliminarDieta(int id) {
        String sql = "UPDATE dieta SET estado=0 WHERE idDieta=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Dieta eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Dieta");
        }
    }

    public Dieta buscarDietaID(int id) {

        String sql = "select idDieta,idPaciente,nombre,fechaInicial,fechaFinal,pesoInicial,pesoFinal from dieta where idDieta=? ";

//        Comida comida=null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                dieta = new Dieta();

                dieta.setIdDieta(rs.getInt("idDieta"));
                
//                Paciente paciente = new Paciente();
//                paciente.setIdPaciente(rs.getInt("idPaciente"));
//                dieta.setPaciente(paciente);
                  Paciente paciente = new Paciente();
                  PacienteData pac=new PacienteData();
                  paciente=pac.buscarPacienteID(rs.getInt("idPaciente"));
                  dieta.setPaciente(paciente);
                
                
                
                dieta.setNombre(rs.getString("nombre"));

                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));

                dieta.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "Error: El id de la Dieta no existe. ");
                return null;
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: al acceder a la tabla Dieta");
        }
        return dieta;

    }
    
    
    public void ModificarDieta(Dieta dieta) {
        
        String sql = "UPDATE dieta SET nombre=?,fechaInicial=?,fechaFinal=?,pesoInicial=?,pesoFinal=? WHERE idDieta=? ";

        
        
        try {
            ps = con.prepareStatement(sql);
            
//            ps.setInt(1, dieta.getPaciente().getIdPaciente());
            ps.setString(1, dieta.getNombre());
            ps.setDate(2, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(3, Date.valueOf(dieta.getFechaFinal()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setInt(6, dieta.getIdDieta());
//            ps.setBoolean(7, true);
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Dieta modificada exitosamente.");

            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: al acceder a la tabla Dieta");
        }

    }
    
    
    public List<Dieta> ListarDietaGOR() {

        List<Dieta> dietas = new ArrayList<Dieta>();

        String sql = "select * from dieta where pesoFinal>pesoInicial";

//        String [] datos =new String[5];
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            Dieta dieta;

            while (rs.next()) {
                Dieta diet = new Dieta();
                diet.setIdDieta(rs.getInt("idDieta"));
                
                Paciente pac = pd.buscarPacienteID(rs.getInt("idPaciente"));
                diet.setPaciente(pac);
                
                diet.setNombre(rs.getString("nombre"));
                diet.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                diet.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                diet.setPesoInicial(rs.getDouble("pesoInicial"));
                diet.setPesoFinal(rs.getDouble("pesoFinal"));
                dietas.add(diet);

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex);
        }
        return dietas;
    }
    
    
    

//    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
//    
//        ArrayList<Alumno> alumnosMateria=new ArrayList<>();
//        
//        String sql="select a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado from inscripcion i, alumno a where i.idAlumno = a.idAlumno and idMateria = ? and a.estado=1";
//        
//        try {
//            ps=con.prepareStatement(sql);
//            ps.setInt(1, idMateria);
//            
//            rs=ps.executeQuery();
//            while(rs.next()){
//            Alumno alumno=new Alumno();
//            alumno.setIdAlumno(rs.getInt("idAlumno"));
//            alumno.setDni(rs.getInt("dni"));
//            alumno.setApellido(rs.getString("Apellido"));
//            alumno.setNombre(rs.getString("nombre"));
//            alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
//            alumno.setActivo(rs.getBoolean("estado"));
//            alumnosMateria.add(alumno);
//            }
//            ps.close();
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"error al acceder a la tabla inscripcion");
//        }
//        
//        return alumnosMateria;
//    }
//    public List<Comida> obtenerComidasSi(int id) {
//        List<Comida> comidas = new ArrayList<Comida>();
//
//        String sql = "SELECT dieta.idComida, nombre, detalle,cantCalorias FROM dieta "
//                + "JOIN comida ON(inscripcion.idComida = comida.idComida) WHERE dieta.idPaciente = ? and estado=1";
//        try {
//
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//            Comida comida;
//
//            while (rs.next()) {
//                comida = new Comida();
//                
//                comida.setIdComida(rs.getInt("idComida"));
//                comida.setNombre(rs.getString("nombre"));
//                comida.setDetalle(rs.getString("detalle"));
//                comida.setCantCalorias(rs.getInt("cantCalorias"));
//                comidas.add(comida);
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "error");
//        }
////        System.out.println(materias);
//        return comidas;
//    }
//    
//    
//    public List<Comida> obtenerComidasNo(int id) {
//        List<Comida> comidas = new ArrayList<Comida>();
//
//        String sql = "SELECT dieta.idComida, nombre, detalle,cantCalorias FROM comida "
//                + "where comida.idComida not in (select idComida from dieta where idPaciente=?)";
//        try {
//
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            rs = ps.executeQuery();
//            Comida comida;
//
//            while (rs.next()) {
//                comida = new Comida();
//                
//                comida.setIdComida(rs.getInt("idComida"));
//                comida.setNombre(rs.getString("nombre"));
//                comida.setDetalle(rs.getString("detalle"));
//                comida.setCantCalorias(rs.getInt("cantCalorias"));
//                comidas.add(comida);
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "error");
//        }
////        System.out.println(materias);
//        return comidas;
//    }
}
