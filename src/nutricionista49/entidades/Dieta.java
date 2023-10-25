
package nutricionista49.entidades;

import java.time.LocalDate;


public class Dieta {
    
    private int idDieta;
    private Paciente paciente;
    private String nombre;
    private LocalDate fechaInicial,fechaFinal;
    private double pesoInicial,pesoFinal;
    private boolean estado;

    public Dieta() {
    }

    public Dieta(int idDieta, String nombre, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoFinal, boolean estado) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }
    
    
    
    

    public Dieta(Paciente paciente, String nombre, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoFinal, boolean estado) {
        this.paciente = paciente;
        this.nombre = nombre;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    public Dieta(int idDieta, Paciente paciente, String nombre, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoFinal, boolean estado) {
        this.idDieta = idDieta;
        this.paciente = paciente;
        this.nombre = nombre;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
    
    
    
}
