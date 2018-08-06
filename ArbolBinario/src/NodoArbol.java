public class NodoArbol {

    int dato;

    NodoArbol hijoI, hijoD;

    public NodoArbol(int d){
        dato = d;

        hijoD = hijoI = null;
    }

    public String toString(){
        return "dato: "+dato;
    }


}
