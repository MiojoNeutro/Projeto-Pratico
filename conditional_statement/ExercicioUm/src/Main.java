import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program to get a number from the user and print whether it is positive or negative.
        //
        //Test Data
        //Input number: 35
        //Expected Output :
        //Number is positive
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero < 0)
            System.out.print("Numero é negativo.");
        else
            System.out.print("Numero é positivo.");

    }
}