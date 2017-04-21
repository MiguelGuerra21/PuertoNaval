
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    private String nombre;
    private String DNI;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre, String dni)
    {
        this.nombre = nombre;
        DNI = dni;
    }

    public String toString()
    {
        String cadenaCompleta = "";
        cadenaCompleta += "Nombre : " + nombre +"\n" + " Dni : " + DNI;
        return cadenaCompleta;
    }
}
