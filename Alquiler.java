/**
 * Clase que representa cada uno de los alquileres realizados en el Puerto.
 * @author Miguel RG
 * @version 27/04/2017.
 */
public class Alquiler
{
    //Constantes
    public int VALOR_MULTIPLICADOR_ESLORA=10;
    public int VALOR_MULTIPLICADOR_BERNUA=300;
    //Atributos
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
    /**
     * Constructor de la clase Alquiler.
     * @param numDias numero de dias para los que se alguila un Barco.
     * @param barco Barco que se alguila.
     * @param posicionAmarre posicion dentro de los amarres disponibles que se pretende alquilar.
     */
    public Alquiler(int numDias, Barco barco, int posicionAmarre)
    {
        diasOcupacion=numDias;
        this.barco=barco;
        this.posicionAmarre=posicionAmarre;
    }

    /**
     * Devuelve una cadena de String con todos 
     * los datos de los atributos de la clase Alquiler.
     * @return String muestra todos los datos del Alquiler realizado.
     */
    public String toString(){
        String cadena="";
        cadena= diasOcupacion +" días de Alquiler"+"\n";
        cadena+=barco.toString();
        cadena+="En el Amarre numero "+posicionAmarre+"\n";
        return cadena;
    }

    /**
     * Calcula y devuelve el precio que costaria
     * un determinado alquiler de una amarre del 
     * puerto.
     * @return float precio del alquiler.
     */
    public float getPrecioAlquiler(){
        float precio=-1;
        precio=diasOcupacion*(VALOR_MULTIPLICADOR_ESLORA*(float)barco.getEslora());
        precio=precio+(VALOR_MULTIPLICADOR_BERNUA*(float)barco.getCoeficienteDeBernau());;
        return precio;
    }
}
