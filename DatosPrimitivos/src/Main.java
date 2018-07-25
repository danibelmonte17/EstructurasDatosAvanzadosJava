public class Main {

    public static void main(String[] args){

        //numericos
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;
        double d = 0.0d;
        float f = 0.0f;

        //logico
        boolean bool = true;

        //caracteres
        char c = 'a';

        //cadenas no primitivo
        String cadena = "esto es una cadena!!";

        System.out.println(cadena);
        System.out.println(cadena.charAt(6));
        System.out.println(cadena.charAt(cadena.length()-1));
        System.out.println();

        for(int index = 0 ; index<cadena.length(); index++){
            System.out.println(cadena.charAt(index));
        }

        System.out.println();

        int indezCadena = cadena.indexOf("u");
        System.out.println(indezCadena);

        cadena = new String("Hola Mundo!!");

        System.out.println();
        System.out.println(cadena);

        //mutabilidad de las cadenas

        String s1 = "Hola";
        String s2 = s1;

        System.out.println();

        System.out.println(s1);
        System.out.println(s2);

        s1 = "Hello";

        System.out.println(s1);
        System.out.println(s2);
    }

}
