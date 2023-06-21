import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una letra: ");
        char letra = sc.nextLine().charAt(0);
        System.out.print("Ingresa el texto: ");
        String texto = sc.nextLine();

       
        char[] caracteres = texto.toCharArray();  // Convertir el texto en un arreglo de caracteres

        // Variables para almacenar la primera y última ocurrencia de la letra
        int primeraOcurrencia = -1;
        int ultimaOcurrencia = -1;

        // Mostrar la posición de cada letra en el texto
        System.out.println("Posicion de cada letra:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Pos [" + (i + 1) + "]: " + caracteres[i]);

            // Verificar si el caracter es igual a la letra buscada
            if (caracteres[i] == letra) {
                if (primeraOcurrencia == -1) {
                    primeraOcurrencia = i + 1;
                }
                ultimaOcurrencia = i + 1;
            }
        }

        if (primeraOcurrencia != -1) {
            System.out.println("\nLa primera ocurrencia de la letra '" + letra + "' está en la posición: " + primeraOcurrencia);
            System.out.println("La última ocurrencia de la letra '" + letra + "' está en la posición: " + ultimaOcurrencia +"\n");
        } else {
            System.out.println("\nLa letra '" + letra + "' no se encuentra en el texto ingresado.");
        }

        sc.close();
    }
}




