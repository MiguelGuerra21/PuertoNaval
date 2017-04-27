
/**
 * Write a description of class Barco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Barco
{
    //variables y metodos
    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;

    /**
     * Constructor for objects of class Barco
     */
    public Barco(String matricula , Double eslora , int ano ,Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = ano;
        this.propietario = propietario;
    }

    public abstract int getCoeficienteDeBernau();
    
    public String toString(){
        String cadenaCompleta = "Matricula : " + matricula +"\n" + " Eslora : " +eslora +"\n" + " Año fabricacion :" + anoFabricacion +"\n" + " Propietario : " + propietario;;
        return cadenaCompleta;
    }
    
    public double getEslora(){
        return eslora;
    }
}
