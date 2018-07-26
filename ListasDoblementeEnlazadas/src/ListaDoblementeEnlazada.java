public class ListaDoblementeEnlazada {

    private NodoDE primero;
    private NodoDE ultimo;
    int tamanio;

    public ListaDoblementeEnlazada(){

    }

    public void agregar(int dato){
        NodoDE nuevo = new NodoDE(dato);
        if(tamanio==0){
            this.primero = this.ultimo = nuevo;
        }else{
            nuevo.atras = ultimo;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        tamanio++;
    }

    public void agregarInicio(int dato){
        NodoDE nuevo = new NodoDE(dato);
        if(tamanio==0){
            this.primero = nuevo;
            this.ultimo = nuevo;
        }else{
            nuevo.siguiente = primero;
            primero.atras = nuevo;
            primero = nuevo;
        }
        tamanio++;
    }

    public void eliminar(){

        if(tamanio>0){
            if(tamanio==1){
                primero = ultimo = null;
            }else{
                ultimo.atras.siguiente = null;
                ultimo = ultimo.siguiente = null;
            }
            tamanio--;
        }

    }

    public void eliminarInicio(){

        if(tamanio>0){
            if(tamanio==1){
                primero = null;
                ultimo = null;
            }else{
                primero.siguiente.atras = null;
                primero = primero.siguiente;
            }
        }

    }

    public void verLista(){
        NodoDE nodoVer;
        nodoVer = primero;
        while(nodoVer!=null){
            System.out.println(nodoVer.dato);
            nodoVer = nodoVer.siguiente;
        }
    }

}
