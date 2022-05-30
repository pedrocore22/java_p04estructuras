public class c04for {
    public static void main(String[] args) {
        // Ciclos for idem JavaScript
        // importante la declaración de variable
        for (int i=0; i < 5; i++) {
            System.out.println(i);
        }
        // foreach en Java
        // sintaxis for(tipo variable: colección) {
        //         Código con esa variable   
        // }

        String[] nombres = {"Juan","Pilar","Lucía"};
        for (String nombre : nombres) {
            System.out.println("El nombre es " + nombre);
        }


    }
}
