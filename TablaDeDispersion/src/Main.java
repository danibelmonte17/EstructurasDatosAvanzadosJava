import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args){

        Hashtable<String, String> tabla = new Hashtable<>();

        tabla.put("Teresa","Programadora");
        tabla.put("Antonio","Tecnico de sistemas");
        tabla.put("Paula","Programadora");

        System.out.println(tabla.get("Paula"));

        Hashtable<String, Persona> personas = new Hashtable<>();

        personas.put("11111111A", new Persona("Paula",22));
        personas.put("22222222B", new Persona("Teresa",30));
        personas.put("33333333C", new Persona("Antonio",26));

        System.out.println(personas.get("11111111A"));

        Enumeration<String> keys = personas.keys();

        while(keys.hasMoreElements()){
            System.out.println(personas.get(keys.nextElement()));
        }


    }

    static class Persona{

        private String nombre;
        private int edad;

        public Persona(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }
}
