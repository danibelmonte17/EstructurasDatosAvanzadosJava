public class Main {

    public static void main(String[] args){

        ListaEnlazada listaEnlazada = new ListaEnlazada();

        listaEnlazada.agregarInicio(1);
        listaEnlazada.agregarInicio(2);
        listaEnlazada.agregarInicio(3);
        listaEnlazada.agregarInicio(4);
        listaEnlazada.agregarFinal(5);
        listaEnlazada.eliminar(4);
        listaEnlazada.verLista();

        System.out.println();

        ListaOrdenada listaOrdenada = new ListaOrdenada();
        listaOrdenada.insertarOrden(4);
        listaOrdenada.insertarOrden(2);
        listaOrdenada.insertarOrden(3);
        listaOrdenada.insertarOrden(6);
        listaOrdenada.verLista();




    }

}
