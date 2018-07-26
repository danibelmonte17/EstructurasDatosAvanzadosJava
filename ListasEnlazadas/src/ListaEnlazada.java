public class ListaEnlazada {

    protected Nodo primero;

    public ListaEnlazada(){
        primero = null;
    }

    public ListaEnlazada agregarInicio(int dato){
        Nodo nuevo;
        nuevo = new Nodo(dato);
        nuevo.setReferencia(primero);
        primero = nuevo;
        return this;
    }

    public void agregarFinal(int dato){
        Nodo nodoFinal;
        nodoFinal = new Nodo(dato);
        nodoFinal.setReferencia(null);

        if(primero == null){
            primero=nodoFinal;
            return;
        }

        Nodo tmp;

        for(tmp = primero; tmp.getReferencia()!=null; tmp=tmp.getReferencia());

        tmp.setReferencia(nodoFinal);

    }

    public Nodo buscar(int dato){
        Nodo buscar;
        for(buscar = primero; buscar!=null; buscar = buscar.getReferencia()){
            if(dato == buscar.getDato())
                return buscar;
        }

        return null;
    }

    public void eliminar(int dato){
        boolean encontrado;
        Nodo actual;
        Nodo anterior;
        actual = primero;
        anterior = null;

        encontrado = false;
        while(actual!=null && !encontrado){
            encontrado = (actual.getDato()==dato);
            if(!encontrado){
                anterior = actual;
                actual = actual.getReferencia();
            }
        }

        if(actual!=null){
            if(actual==primero){
                primero = actual.getReferencia();
            }else{
                anterior.setReferencia(actual.getReferencia());
            }
        }
    }

    public void verLista(){
        Nodo actual;
        actual = primero;
        while(actual!=null){
            System.out.println(actual.getDato());
            actual = actual.getReferencia();
        }
    }

}
