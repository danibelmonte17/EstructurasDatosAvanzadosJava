public class Main {
    public static void main(String[] args){
        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();

        listaDoblementeEnlazada.agregar(1);
        listaDoblementeEnlazada.agregar(2);
        listaDoblementeEnlazada.agregar(3);
        listaDoblementeEnlazada.agregar(4);
        listaDoblementeEnlazada.agregarInicio(5);

        listaDoblementeEnlazada.eliminar();

        listaDoblementeEnlazada.verLista();
    }
}
