import java.util.Vector;

public class Main {
    public static void main(String[] args){

        //array de tipo primitivo unidimensional
        int[] array = new int[10];

        array[4] = 2;

        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("\n"+array.length+"\n");

        //array de tipo primitivo bidimensional
        int[][] matriz = new int[5][5];

        int[][] matriz2 = {{1,2,3}, {4,5,6}};

        for(int i=0; i<matriz2.length; i++){
            for(int j=0; j<matriz2[0].length; j++){
                System.out.println(matriz2[i][j]);
            }
        }

        //array de mas de 2 dimensiones
        int[][][] tridimensional = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};

        System.out.println();

        for(int i=0; i<tridimensional.length; i++){
            for(int j=0; j<tridimensional[0].length; j++){
                for(int k=0; k<tridimensional[0][0].length; k++){
                    System.out.println(tridimensional[i][j][k]);
                }
            }
        }

        //array como parametro
        //los arrays son pasados a los metodos por referencia en cambio los valores primitivos pasan como valor

        int[] num = {1,2,3,4};
        modificar(num);

        System.out.println();

        for (int i : num){
            System.out.println(i);
        }

        //Clases tratadas como listas -> Vector.class
        Vector vector = new Vector(20);
        vector.add("h");
        vector.add("hola");
        vector.insertElementAt("que tal?",1);

        System.out.println();

        System.out.println(vector);
        vector.remove("h");

        System.out.println(vector);

        System.out.println(vector.get(0));
        System.out.println(vector.elementAt(0));


    }

    public static void modificar(int[] array){
        array[2] = 1111;
    }
}
