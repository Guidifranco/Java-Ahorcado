import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y Asignaciones
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false ;

        // Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Bucles
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                        // Lo usamos cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + 
            " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor.");

            // Usamos el scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Bucle
            for (int i = 0; i < palabraSecreta.length(); i++) {

                // bucle condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto! Te quedan: " + (intentosMaximos - intentos) + " intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
            }

        }

        if (!palabraAdivinada) {
            System.out.println("!Te quedaste sin intentos, GAME OVER");
        }

        scanner.close();
    }
}
