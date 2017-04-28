/**
 * clase que almacena barcos tipo embarcacionesAMotor.
 * 
 * @author Borja Del Valle Lopez.
 * @version 27/04/2017.
 */
public class EmbarcacionAMotor extends Barco
{
    private int potencia;
    /**
     * Constructor que inicializa los parametros de embarcacionAMotros.
     * @param potencia potencia que tiene la embarcacionAMotor.
     */
    public EmbarcacionAMotor(String matricula , Double eslora , int ano ,Persona propietario , int potencia)
    {
        super(matricula ,eslora ,ano , propietario);
        this.potencia = potencia;
    }

    /**
     * Muestra que calcual el coeficiente de bernua de embarcacioAMotro.
     * @return un entero que es la potencia.
     */
    public int getCoeficienteDeBernau()
    {
        return potencia;
    }

    /**
     * Muestra toda la informaci0n de embarcacionAMotor.
     * @return cadena con la informacion de embarcacionAMotor.
     */
    public String toString(){
        String cadenaAMotor = super.toString();
        cadenaAMotor += "\n" + " Potencia : " + potencia;
        return cadenaAMotor;
    }
}
