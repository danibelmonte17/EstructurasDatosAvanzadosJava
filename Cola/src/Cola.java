public class Cola {

    NodoCola primero;
    NodoCola ultimo;
    int tamanyo;

    public Cola(){
        primero = ultimo = null;
        tamanyo = 0;
    }

    public boolean empty(){
        return primero == null;
    }

    public void insert(int dato){
        NodoCola nuevo = new NodoCola(dato);
        if(empty()){
            primero = nuevo;
        }else{
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        tamanyo++;
    }

    public int delete(){
        int tmp = primero.dato;
        primero = primero.siguiente;
        tamanyo--;
        return tmp;
    }

    public int inicio(){
        return primero.dato;
    }

    public int size(){
        return this.tamanyo;
    }

}
