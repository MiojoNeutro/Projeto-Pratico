import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java recursive method to calculate the sum of all numbers from 1 to on


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero A: ");
        int numeroUm = sc.nextInt();

        System.out.print("Digite um numero B: ");
        int numeroDois = sc.nextInt();

        int resultado = soma(numeroUm,numeroDois);

        System.out.print(resultado);
    }

   public static int soma(int a, int b) {
    return a + b;

   }
}