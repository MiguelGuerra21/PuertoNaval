/**
 * Clase que almacena los barcos tipo yate.
 * 
 * @author: Borja Del Valle Lopez.
 * @version 27/04/2017.
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private  int numCamarotes;
    /**
     * Constructor que inicializa los atributos de Yate.
     * @param numCamarotes numero de camarotes que tiene el yate.
     */
    public Yate(String matricula , Double eslora , int ano ,Persona propietario , int potencia, int numCamarotes)
    {
        super( matricula ,eslora ,ano ,propietario , potencia );
        this.numCamarotes = numCamarotes;
    }

    /**
     * Muestra toda la informaci0n de yate.
     * @return cadena con la informacion de yate.
     */
    public String toString()
    {
        String cadenaYate = super.toString();
        cadenaYate += "\n" + "Numero de Camarotes : " + numCamarotes;
        return cadenaYate;
    }

    /**
     * Metodo que calcula el coeficiente de bernua
     * del yate.
     * @return un entero que es el coeficiente de bernua de yae
     */
    public int getCoeficienteDeBernau(){
        return numCamarotes+super.getCoeficienteDeBernau();
    }
}
