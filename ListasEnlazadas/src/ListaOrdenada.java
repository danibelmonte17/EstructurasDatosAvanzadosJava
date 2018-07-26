public class ListaOrdenada extends ListaEnlazada {

    public ListaOrdenada(){
        super();
    }

    public ListaOrdenada insertarOrden(int dato){

        Nodo nuevo;
        nuevo = new Nodo(dato);

        if(primero==null){ //primero
            primero = nuevo;
        }
        else if(dato<primero.getDato()) { //nodoA = 1 nodoB = 3
            nuevo.setReferencia(primero);
            primero = nuevo;
        }else{ //nodoA = 10 nodoB = 5 nodoC = 11
            Nodo anterior, primero0;
            anterior = primero0 = primero;
            while((primero0.getReferencia()!=null) && dato>primero0.getDato()){
                anterior = primero0;
                primero0 = primero0.getReferencia();
            }
            if(dato>primero0.getDato()) {
                anterior = primero0;
            }
            nuevo.setReferencia(anterior.getReferencia());
            anterior.setReferencia(nuevo);
        }


        return this;
    }

}
