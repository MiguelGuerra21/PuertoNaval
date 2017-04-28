
/**
 * Clase que almacena objetos tipo barco.
 * 
 * @author:Borja Del Valle Lopez.
 * @version 27/04/2017.
 */
public abstract class Barco
{
    //variables y metodos
    private Persona propietario;
    private String matricula;
    private double eslora;
    private int anoFabricacion;

    /**
     * Constructor de la clase barco.
     * @param matricula, martricula del barco.
     * @param eslora, la longitud de la eslora del barco.
     * @param ano año de fabricacion del barco.
     * @param propietario Propietario del barco.
     */
    public Barco(String matricula , Double eslora , int ano ,Persona propietario)
    {
        this.matricula = matricula;
        this.eslora = eslora;
        anoFabricacion = ano;
        this.propietario = propietario;
    }

    
    /**
     * Metodo abstracto para calcular el coeficiente de Bernua en los 
     * barcos.
     */
    public abstract int getCoeficienteDeBernau();
    
    
    /**
     * Muestra la informacion del barco.
     * @return cadena con la informacion del barco.
     */
    public String toString(){
        String cadenaCompleta = "Matricula : " + matricula +"\n" + " Eslora : " +eslora +"\n" + " AÃ±o fabricacion :" + anoFabricacion +"\n" + " Propietario : " + propietario;;
        return cadenaCompleta;
    }
    
    /**
     * Muestra el tamaño de la eslora del barco.
     * @return eslora del barco.
     */
    public double getEslora(){
        return eslora;
    }
}
