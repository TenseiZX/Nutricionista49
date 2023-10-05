
package nutricionista49;

import java.sql.Connection;
import nutricionista49.AccesoDatos.Conexion;
import nutricionista49.AccesoDatos.PacienteData;
import nutricionista49.entidades.Paciente;


public class Nutricionista49 {

   
    public static void main(String[] args) {
        
        Connection con = Conexion.getConexion();
        
//PRUEBA GUARDAR
//        Paciente pac=new Paciente(35507148,"bilardo","marcelo","primero de mayo 1111", "7267777", true);
//        PacienteData pd=new PacienteData();
//        pd.guardarPaciente(pac);
//TERMINADO-----------------------------------------------------------------------------------------------

//PRUEBA ELIMINAR
//PacienteData pd=new PacienteData();
//pd.eliminarPaciente(1);
//TERMINADO-----------------------------------------------------------------------------------------------   



//PRUEBA MODIFICAR
//Paciente pac=new Paciente(2,35507148,"bilardo","marcelo","primero de mayo 1111", "7267777", true);
//PacienteData pd=new PacienteData();
//pd.ModificarPaciente(pac);
//TERMINADO--------------------------


//PRUEBA BUSCAR
//PacienteData pd=new PacienteData();
//Paciente pacienteEncontrado=pd.buscarPacientePorDni(35507148);
//        System.out.println("dni :"+pacienteEncontrado.getDni());
//        System.out.println("nombre :"+pacienteEncontrado.getNombre());
//        System.out.println("apellido :"+pacienteEncontrado.getApellido());
//TERMINADO--------------------------------
        
    }
    
}
