import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java recursive method to calculate the sum of all numbers from 1 to on n.

        int resultado = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero A: ");
        int numeroUm = sc.nextInt();

        System.out.println("A soma dos numeros de 1 até "+numeroUm+" é: "+soma(numeroUm,resultado));
    }

   public static int soma(int numeroUm, int resultado) {

       for (int x = 0; x != numeroUm + 1; x++) {
          resultado = resultado + x;
       }
return resultado;
   }
}
