
/**
 * Write a description of class EmbarcacionAMotor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionAMotor extends Barco
{
    private int potencia;
    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula , Double eslora , int ano ,Persona propietario , int potencia)
    {
        super(matricula ,eslora ,ano , propietario);
        this.potencia = potencia;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getCoeficienteDeBernau()
    {
        return potencia;
    }
    
    public String toString(){
        String cadenaAMotor = super.toString();
        cadenaAMotor += "\n" + " Potencia : " + potencia;
        return cadenaAMotor;
    }
}
