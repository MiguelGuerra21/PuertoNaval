
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numeroMastiles;
    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula , Double eslora , int ano ,Persona propietario , int numeroMastiles)
    {
        super(matricula , eslora , ano , propietario);
        this.numeroMastiles = numeroMastiles;
    }
    
    public int getCoeficienteDeBernau()
    {
        return numeroMastiles;
    }
    
    public String toString(){
         String cadenaVelero = "";
         return cadenaVelero;
    }
}
