

/**
 * Clase que almacena los propietarios de los barcos.
 * 
 * @author: Borja Del Valle Lopez. 
 * @version 27/04/2017.
 */
public class Persona
{
    private String nombre;
    private String DNI;
    /**
     * Constructor de la clase Persona.
     * @param nombre es el nombre del propietario.
     * @dni dni de la persona
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        DNI = dni;
    }

    
    /**
     * Muestra toda la informaci0n de persona.
     * @return cadena con la informacion de persona.
     */
    public String toString()
    {
        String cadenaCompleta = "";
        cadenaCompleta += "Nombre : " + nombre +"\n" + " Dni : " + DNI;
        return cadenaCompleta;
    }
}
