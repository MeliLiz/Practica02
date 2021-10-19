public class CicloDoWhile{
    public static void main (String[] args){
        int contador = 0;
        int numero =2;
        do {
            boolean esPrimo=true;
            int divisor = 2;
            do{
                if (numero % divisor == 0){
                    esPrimo = false;
                }
                divisor++;     
            } while (divisor < numero/2);
            if (numero ==2){
                esPrimo = true;
            }
            if (esPrimo){
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        } while (numero < 1000);
        System.out.println("\nHay "+ contador + " números primos entre 0 y 1000.");
    }
}