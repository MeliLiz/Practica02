public class CicloWhile{
    public static void main (String[] args){
        int contador=0;
        int numero =2;
        while (numero <1000){
            boolean esPrimo = true;
            int divisor = 2;       
            while (divisor <= numero/2){
                if (numero % divisor == 0){
                    esPrimo = false;
                }
                divisor++;
            }
            if (esPrimo){
                System.out.print(numero + " ");
                contador++;
            }
            numero++;
        }
        System.out.println("\nHay " + contador + " números primos entre 0 y 1000");
    }    
}