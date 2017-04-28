
/**
 * representa el Puerto con el que se realizan los alquileres de los amarres.
 * @author Miguel RG.
 * @version 27/04/2017.
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private Alquiler[] amarres;

    /**
     * Constructor de la clase Puerto.
     */
    public Puerto()
    {
        amarres=new Alquiler[4];
    }

       /**
     * Metodo para alquiler un amarre, si no hay
     * amarres disponibles, el metodo devolvera -1.
     * En caso de quedar amarres libres, alquilara el 
     * primero que se encuentre disponible.
     * @param numDias numero de dias que se alquilara el amarre.
     * @param barco Barco que se pretende alquilar.
     * @return el precio del Alquiler realizado.
     */
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

        /**
     * Liquida y por lo tanto elimina del array 
     * de Alquiler (amarres) la posicion del alquiler 
     * que le pases al metodo como parametro.
     * @param posicionAmarre posicion del array que se pretende alquilar.
     * @return el precio del Alquiler realizado.
     */
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

    
    /**
     * Metodo que imprime por pantalla el estado 
     * de los amarres, es decir, imprimira si un 
     * amarre se encuentra libre o imprimira si 
     * un amarre se encuentra ocupado y los datos 
     * correspondientes al alquiler de ese amarre.
     */
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

        /**
     * Metodo que devuelve la posicion del
     * primer amarre que se encuentre disponible.
     * En caso de no haber un amarre libre, el 
     * metodo devuelve -1.
     * @return posicion del primer amarre libre encontrado.
     */
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

        /**
     * Metodo que devuelve true en caso
     * de quedar algun amarre libre o 
     * false en caso de no haber amarres
     * disponibles.
     * @return true en caso de que exista un amarre no alquilado.
     */
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
