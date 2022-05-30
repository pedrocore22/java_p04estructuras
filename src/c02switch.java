public class c02switch {
    public static void main(String[] args) {
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            // Resto de cases
            default:
                System.out.println("Día no válido");
        }
        // Pequeña regla a cumplir: en los case solo se pueden
        // evaluar literales o constantes
        
        String equipo = "Real Betis";
        final String rb = "Real Betis";
        switch(equipo) {
            case "Real Madrid":
                System.out.println("Madrid");
            case rb:
                System.out.println("Sevilla");
            // resto de código
        }
 

    }
}
