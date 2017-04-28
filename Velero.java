
/**
 * Clase que almacena barcos tipo velero.
 * 
 * @author Borja Del Valle Lopez. 
 * @version 27/04/2017.
 */
public class Velero extends Barco
{
    private int numMastiles;

    /**
     * Constructor de la clase velero.
     * @param numMastiles es el numero de amstiles que tiene el velero.
     */
    public Velero(String matricula , Double eslora , int ano ,Persona propietario , int numeroMastiles)
    {
        super(matricula , eslora , ano , propietario);
        this.numMastiles = numeroMastiles;
    }

    /**
     * Metodo que calcula el coeficiente de bernua del velero.
     * @return un entero que coincide con el numero de mastiles
     */
    public int getCoeficienteDeBernau()
    {
        return numMastiles;
    }

    /**
     * Muestra toda la informacion del velero.
     * @return Cadena con la informacion del velero.
     */
    public String toString(){
        String cadenaVelero = super.toString();
        cadenaVelero += " \n" + " Numero De Mastiles : " + numMastiles;
        return cadenaVelero;
    }
}
