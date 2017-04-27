
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numMastiles;
    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula , Double eslora , int ano ,Persona propietario , int numeroMastiles)
    {
        super(matricula , eslora , ano , propietario);
        this.numMastiles = numeroMastiles;
    }
    
    public int getCoeficienteDeBernau()
    {
        return numMastiles;
    }
    
    public String toString(){
         String cadenaVelero = super.toString();
         cadenaVelero += " \n" + " Numero De Mastiles : " + numMastiles;
         return cadenaVelero;
    }
}
