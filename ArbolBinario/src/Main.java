import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] ar){
        ArbolBinario arbolBinario = new ArbolBinario();

        arbolBinario.insertar(50);
        arbolBinario.insertar(20);
        arbolBinario.insertar(40);
        arbolBinario.insertar(60);
        arbolBinario.insertar(10);
        arbolBinario.insertar(30);
        arbolBinario.insertar(80);
        arbolBinario.insertar(70);

        arbolBinario.ver(arbolBinario.raiz);

        System.out.println("------------------------------------------------------");

        //Clase arbol de java

        TreeSet<Integer> arbol = new TreeSet<>();

        arbol.add(50);
        arbol.add(20);
        arbol.add(40);
        arbol.add(60);
        arbol.add(10);
        arbol.add(30);
        arbol.add(80);
        arbol.add(70);

        Iterator<Integer> i = arbol.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }



    }

}
