
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private  int numCamarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula , Double eslora , int ano ,Persona propietario , int potencia, int numCamarotes)
    {
        super( matricula ,eslora ,ano ,propietario , potencia );
        this.numCamarotes = numCamarotes;
    }

    public String toString()
    {
        String cadenaYate = super.toString();
        cadenaYate += "\n" + "Numero de Camarotes : " + numCamarotes;
        return cadenaYate;
    }
    
    
        public int getCoeficienteDeBernau(){
        return numCamarotes+super.getCoeficienteDeBernau();
    }
}
