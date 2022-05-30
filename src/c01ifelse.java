public class c01ifelse {
    public static void main(String[] args) {
       int value = 4;
       if (value < 0 || value > 10) {
           System.out.println("Introduzca un valor entre 0 y 10");
       }
       if (value >= 5)
            System.out.println("Superado!"); // Con 1 sola línea se
                                      // pueden aliviar las llaves
       // Si no se pasa una expresión condicional
       // no compila
        //    if (value++) {
        //        // 
        //    }
        // if-else idem JavaScript
    }
}
