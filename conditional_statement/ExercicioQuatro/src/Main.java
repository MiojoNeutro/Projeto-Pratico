import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
        // Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number
        // is less than 1, or "large" if it exceeds 1,000,000.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        if (valor == 0)
            System.out.print(valor);
        else if (valor < 0)
            System.out.print("Negativo");
        else
            System.out.print("Positivo");

        if (valor < 1)
            System.out.print("Pequeno");
        else if (valor > 1000000)
            System.out.print("Grande");
    }

}