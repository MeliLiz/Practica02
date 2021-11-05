/**
 * Clase CicloDoWhile Clase que imprime todos los números primos del 0 al 1000
 * 
 * @author Melissa Fernández
 * @version 1.0
 */

public class CicloDoWhile {
    /**
     * Método principal donde se ejecutan los métodos do while para ver si los
     * números son primos o no
     * 
     * @param args Los argumentos
     */
    public static void main(String[] args) {
        // Contador para saber cuántos números primos hay del 0 al 1000
        int contador = 0;
        // El número que queremos verificar si es primo o no
        int numero = 2;
        // Ciclo do while que hace que el número vaya hasta 999
        do {
            // esPrimo: booleano que inicia en true
            boolean esPrimo = true;
            // El divisor empieza en 2
            int divisor = 2;
            // Ciclo do while para tomar a los posibles divisores
            do {
                // Condicional para saber si el número tiene divisores
                if (numero % divisor == 0) {
                    esPrimo = false;// Si el número tiene algún divisor, esPrimo cambia a false
                }
                divisor++; // el divisor aumenta 1
            } while (divisor < numero / 2);
            // Condicional en el que si el número es 2, esPrimo se hace true
            if (numero == 2) {
                esPrimo = true;
            }
            // Condicional que verifica si esPrimo se mantiene en true
            if (esPrimo) {
                System.out.print(numero + " "); // Si esPrimo =true imprimir el número
                contador++;// El contador aumenta 1
            }
            numero++; // El número aumenta 1
        } while (numero < 1000);
        // Imprimir cuántos números primos hay de 0 a 1000
        System.out.println("\nHay " + contador + " números primos entre 0 y 1000.");
    }
}