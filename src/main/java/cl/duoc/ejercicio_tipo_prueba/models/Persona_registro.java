
package cl.duoc.ejercicio_tipo_prueba.models;
import java.time.LocalDate;
import java.time.Month;

public class Persona_registro {
    
    private static int numRegistro_interno;
    
    private String nombre, apellido;
    private String rut;
    private char dVerificador;
    private LocalDate fechaNacimiento;
    private int numRegistro;

    public Persona_registro(String nombre, String apellido, String rut, char dVerificador, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.dVerificador = dVerificador;
        this.fechaNacimiento = fechaNacimiento;
        setCurrentNumregistro();
    }

    public Persona_registro() {
        this.nombre = "Sin nombre";
        this.apellido = "Sin apellido";
        this.rut = "0";
        this.dVerificador ='x';
        this.fechaNacimiento = LocalDate.now();
        setCurrentNumregistro();
        
    }
    
     private void setCurrentNumregistro(){
        this.numRegistro =  numRegistro_interno;
        this.numRegistro = numRegistro_interno +0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public char getdVerificador() {
        return dVerificador;
    }

    public void setdVerificador(char dVerificador) {
        this.dVerificador = dVerificador;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumRegistro() {
        return numRegistro;
    }
    
    
    public void setFechaNacimiento(int dia, int mes, int anio){
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
    }
    
    @Override
    public String toString(){
        String mensaje = "Hola mi nombre es "+ this.nombre+ " " +this.apellido +" Nacie el "+ this.fechaNacimiento.toString();
        mensaje += " Mi rut es "+rut+"-"+dVerificador;
        mensaje += " Y mi Id de registro es "+this.numRegistro;
        return mensaje;
    }
    
}
    
    
    
    

