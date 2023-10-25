
package nutricionista49;

import java.sql.Connection;
import java.time.LocalDate;
import nutricionista49.AccesoDatos.ComidaData;
import nutricionista49.AccesoDatos.Conexion;
import nutricionista49.AccesoDatos.DietaComidaData;
import nutricionista49.AccesoDatos.DietaData;
import nutricionista49.AccesoDatos.PacienteData;
import nutricionista49.entidades.Comida;
import nutricionista49.entidades.Dieta;
import nutricionista49.entidades.DietaComida;
import nutricionista49.entidades.Paciente;


public class Nutricionista49 {

   
    public static void main(String[] args) {
        
        Connection con = Conexion.getConexion();
        
//PRUEBA GUARDAR
//        Paciente pac=new Paciente(30507148,"pilardo","parcelo","primero de mayo 1111", "7267776", true);
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



//AGREGAR DIETA

//PacienteData pd=new PacienteData();
//Paciente pac1=new Paciente(4, 44433311, "hola", "chau", "nosvemos", "9996661", true);
//
//DietaData dd=new DietaData();
//Dieta diet=new Dieta(pac1, "dieta lechuga", LocalDate.of(2000, 1,1), LocalDate.of(2001, 2,2), 75, 50, true);
//
//dd.guardarDieta(diet);
//
//System.out.println(diet.getNombre());

//TERMINADO--------------------------------


//BUSCAR DIETA ID 

//DietaData dd=new DietaData();
//Dieta dietaEncontrada=dd.buscarDietaID(5);
//
//        System.out.println("nombre: "+dietaEncontrada.getNombre());
//        System.out.println("paciente: "+dietaEncontrada.getPaciente().getIdPaciente());
//        System.out.println("fecha inicio"+dietaEncontrada.getFechaInicial());

////////////////TERMINADO


//MODIFICAR DIETA 
//Paciente pac=new Paciente(2,35507148,"bilardo","marcelo","primero de mayo 1111", "7267777", true);

//Dieta diet=new Dieta(18, "dieta rokola", LocalDate.of(2023, 10,07),LocalDate.of(2023, 10,15), 60, 55, true);
//DietaData dd=new DietaData();
//dd.ModificarDieta(diet);

///Terminado

///////GUARDAR DIETA COMIDA

//Paciente pac=new Paciente(30507148,"bilardo","marcelo","primero de mayo 1111", "7267776", true);
//PacienteData pd=new PacienteData();
//
//Dieta diet=new Dieta(18,pac, "dieta rokola", LocalDate.of(2023, 10,07),LocalDate.of(2023, 10,15), 60, 55, true);
//DietaData dd=new DietaData();
//
//Comida com=new Comida(10, "Pizza", "Chatarra", 500, true);
//ComidaData cd=new ComidaData();
//
//
//DietaComida dc=new DietaComida(com, diet, true);
//DietaComidaData dcd=new DietaComidaData();
//dcd.guardarDietaComida(dc);

 //////TERMINADO


//////Buscar comida dietacomidadata

//DietaComidaData dcd=new DietaComidaData();
//dcd.buscarComida(2, 5);
//        System.out.println(dcd.buscarComida(99, 5));

//////TERMINADO

    }
    
}
