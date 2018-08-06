public class Pila {
    private NodoPila ultimo;
    int tamanyo;


    public Pila() {
        ultimo = null;
        tamanyo = 0;
    }

    //si esta vacio
    public boolean isEmpty() {
        return ultimo == null;
    }

    //inserta un elemento en la pila
    public void push(int dato) {
        NodoPila nuevo = new NodoPila(dato);
        nuevo.siguiente = ultimo;
        ultimo = nuevo;
        tamanyo++;
    }

    //saca un elemento de la pila
    public int pop() {
        int tmp = ultimo.dato;
        ultimo = ultimo.siguiente;
        tamanyo--;
        return tmp;
    }

    //revisa el ultimo de la pila
    public int peek(){
        return ultimo.dato;
    }

    //limpia la pila
    public void clear(){
        while(!isEmpty()){
            pop();
        }
    }

    //obtiene el tamaño
    public int size(){
        return this.tamanyo;
    }
}