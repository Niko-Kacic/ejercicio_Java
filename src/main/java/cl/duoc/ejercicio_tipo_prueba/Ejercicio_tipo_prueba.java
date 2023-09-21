

package cl.duoc.ejercicio_tipo_prueba;

import cl.duoc.ejercicio_tipo_prueba.models.Persona_registro;
import java.util.Scanner;


public class Ejercicio_tipo_prueba {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        String option;
        
        Persona_registro[] arrPersona_registro = new Persona_registro[15];
        
        int contador = 0;
        
       
        
        do{
            System.out.println("---Bien venido al sistema de registro---");
            System.out.println("1. Para iniciar registro persona ");
            System.out.println("2. Editar datos de registro");
            System.out.println("3. Eliminar registro");
            System.out.println("4. Listar los registros");
            System.out.println("X. Salir del sistema");
            System.out.println("Ingrese una opción entre (1 - 4 o X para salir): ");
            
            option = sc.nextLine();//Capturamos la opción
            option = option.toLowerCase().trim();//Si se ingresa X se transforma a minuscula y se quitan los espacios en blanco
            
            
            
            switch(option){
                case "1":
                    System.out.println("Selecciono la opción "+ option);
                    System.out.println("Ingrese nombre persona ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese apellido");
                    String apellido = sc.nextLine();
                    System.out.println("Ingrese su rut sin puntos ni dig verificador");
                    String rut = sc.nextLine();
                    System.out.println("Ingrese digito verificador");
                    char dver = sc.nextLine().charAt(0);
                    System.out.println("Ingrese fecha nacimiento dd/mm/aaaa");
                    String fechaNac = sc.nextLine();
                    
                    int numrut = Integer.parseInt(rut);
                    String[] fecha = fechaNac.split("/");
                    int dia = Integer.parseInt(fecha[0]);
                    int mes = Integer.parseInt(fecha[1]);
                    int annio = Integer.parseInt(fecha[2]);
                    
                    Persona_registro obj = new Persona_registro();
                    obj.setNombre(nombre);
                    obj.setApellido(apellido);
                    obj.setRut(rut);
                    obj.setdVerificador(dver);
                    obj.setFechaNacimiento(dia, mes, annio);
                    
                    arrPersona_registro[contador] = obj;
                    contador++;
                    
                    break;
                case "2":
                    System.out.println("Selecciono la opción " + option);
                    System.out.println("Ingrese la posición a editar (de 0 a " + (contador - 1) + "): ");
                    int posicion = sc.nextInt();

                    if (posicion >= 0 && posicion < contador) {
                        // Mostrar información actual del registro seleccionado
                        System.out.println("Registro actual en la posición " + posicion + ":");
                        System.out.println(arrPersona_registro[posicion]);

                        // Solicitar los nuevos valores
                        sc.nextLine(); // Consumir la línea en blanco
                        System.out.println("Ingrese nombre persona: ");
                        String nuevoNombre = sc.nextLine();
                        System.out.println("Ingrese apellido: ");
                        String nuevoApellido = sc.nextLine();
                        System.out.println("Ingrese su rut sin puntos ni dígito verificador: ");
                        String nuevoRut = sc.nextLine();
                        System.out.println("Ingrese dígito verificador: ");
                        char nuevoDver = sc.nextLine().charAt(0);

                        // Actualizar el registro seleccionado
                        arrPersona_registro[posicion].setNombre(nuevoNombre);
                        arrPersona_registro[posicion].setApellido(nuevoApellido);
                        arrPersona_registro[posicion].setRut(nuevoRut);
                        arrPersona_registro[posicion].setdVerificador(nuevoDver);

                        System.out.println("Registro actualizado correctamente.");
                    } else {
                        System.out.println("La posición especificada no es válida.");
                    }
                    
                    break;
                case "3":     
                    System.out.println("Selecciono la opción " + option);
                    System.out.println("Ingrese la posición a eliminar (de 0 a " + (contador - 1) + "): ");
                    int posicionEliminar = sc.nextInt();

                    if (posicionEliminar >= 0 && posicionEliminar < contador) {
                        // Mostrar información del registro a eliminar
                        System.out.println("Registro a eliminar en la posición " + posicionEliminar + ":");
                        System.out.println(arrPersona_registro[posicionEliminar]);

                        // Mover los registros siguientes una posición hacia atrás
                        for (int i = posicionEliminar; i < contador - 1; i++) {
                            arrPersona_registro[i] = arrPersona_registro[i + 1];
                        }

                        // Reducir el contador
                        contador--;

                        System.out.println("Registro eliminado correctamente.");
                    } else {
                        System.out.println("La posición especificada no es válida.");
                    }
                    
                    break;
                case "4":
                    System.out.println("Selecciono la opción "+ option);
                    for(int i = 0; i < contador; i++ ){
                        System.out.println(arrPersona_registro[i]);
                    }
                    
                    break;
                case "x":
                    System.out.println("Selecciono la opción "+ option);
                    break;
                case "":
                    System.out.println("Ingrese algún valor");
                    break;
                default:
                    System.out.println("Ingrese opción valida");
            }
            
            
        }while(!"x".equals(option));//indicamos que mientras option no sea igual a x, no se sale del bucle
        
      
        
    }
}
