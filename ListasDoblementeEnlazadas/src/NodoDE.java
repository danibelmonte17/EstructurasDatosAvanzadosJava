public class NodoDE {

    int dato;
    NodoDE siguiente;
    NodoDE atras;

    public NodoDE(int dato){
        this.dato = dato;
        siguiente = atras = null;

    }

    public int getDato(){
        return dato;
    }
}
