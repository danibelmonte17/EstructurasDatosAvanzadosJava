public class Main {

    public static void main(String[] a){
        Pila pila = new Pila();

        pila.push(4);
        pila.push(2);
        pila.push(1);
        pila.push(5);
        pila.push(3);

        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }
    }
}
