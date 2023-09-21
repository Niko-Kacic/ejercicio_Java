
package cl.duoc.ejercicio_tipo_prueba.models;



public class EditarRegistro {
    
    private String nombre, apellido;
    private String rut;
    private char dVerificador;
 

    public EditarRegistro() {
    
    }

    public EditarRegistro(String nombre, String apellido, String rut, char dVerificador, int numRegistro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.dVerificador = dVerificador;
  
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


    
    @Override
    public String toString(){
        String mensaje = "El registro a sido modificado, quedando en "+ this.nombre+ " " +this.apellido;
        mensaje += rut+"-"+dVerificador;
        return mensaje;
    }
        
    
}
