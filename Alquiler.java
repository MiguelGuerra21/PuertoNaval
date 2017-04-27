
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    public int VALOR_MULTIPLICADOR_ESLORA=10;
    public int VALOR_MULTIPLICADOR_BERNUA=300;
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int numDias, Barco barco, int posicionAmarre)
    {
        diasOcupacion=numDias;
        this.barco=barco;
        this.posicionAmarre=posicionAmarre;
    }
    
    public String toString(){
        String cadena="";
        cadena= diasOcupacion +" días de Alquiler"+"\n";
        cadena+=barco.toString();
        cadena+="En el Amarre numero "+posicionAmarre+"\n";
        return cadena;
    }
    
    public float getPrecioAlquiler(){
        float precio=-1;
        precio=diasOcupacion*(VALOR_MULTIPLICADOR_ESLORA*(float)barco.getEslora());
        precio=precio+(VALOR_MULTIPLICADOR_BERNUA*(float)barco.getCoeficienteDeBernau());;
        return precio;
    }
}
