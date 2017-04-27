
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler[] amarres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        amarres=new Alquiler[4];
    }

    public float alquilarAmarre(int numDias, Barco barco){
        float precioAlquiler=-1;
        if (hayAmarresLibres()){
            int posicionAOcupar=posicionPrimerAmarreLibre();
            Alquiler addAlquiler= new Alquiler(numDias,barco,posicionAOcupar);
            amarres[posicionAOcupar]=addAlquiler;
            precioAlquiler= addAlquiler.getPrecioAlquiler();
        }
        return precioAlquiler;
    }

    public float liquidarAlquilerAmarre(int posicionAmarre){
        float precioAPagar=-1;
        if (posicionAmarre<amarres.length&&posicionAmarre>=0){
            if(amarres[posicionAmarre]!=null){
                precioAPagar=amarres[posicionAmarre].getPrecioAlquiler();
                amarres[posicionAmarre]=null;            
            }
        }
        return precioAPagar;
    }

    public void verEstadoAmarres(){
        for(int cont=0;cont<amarres.length;cont++){
            if(amarres[cont]==null){
                System.out.println("Amarre "+cont+" vacio.");
            }
            else{
                System.out.println(amarres[cont].toString());
            }
        }
    }

    private int posicionPrimerAmarreLibre(){
        int posicionLibre=-1;
        int posicionContada=0;
        boolean posicionEncontrada=false;
        while (posicionContada<amarres.length && posicionEncontrada==false){
            if(amarres[posicionContada]==null ){
                posicionLibre=posicionContada;
                posicionEncontrada=true;        
            }
            posicionContada++;
        }
        return posicionLibre;
    }

    private boolean hayAmarresLibres(){
        int posicion=0;
        boolean libres=false;
        while(posicion<amarres.length && libres==false){
            if(amarres[posicion]==null){
                libres=true;
            }
            posicion++;
        }
        return libres;
    }
}
