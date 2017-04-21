
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private  int potencia;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula , Double eslora , int ano ,Persona propietario , int numeroMastiles, int potencia)
    {
        super( matricula ,eslora ,ano ,propietario , numeroMastiles);
        this.potencia = potencia;
    }

    public String toString()
    {
        String cadenaYate = super.toString();
        cadenaYate += "\n" + "Potencia : " + potencia;
        return cadenaYate;
    }
}
