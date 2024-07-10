import java.util.Scanner;

public class BasicoDois {
    public static void main(String[] args) {
        //Write a Java program to print the sum of two numbers.
        //Test Data:
        //74 + 36
        //Expected Output :
        //110

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um valor A: ");
        int a = scanner.nextInt();

        System.out.print("Digite um valor B: ");
        int b = scanner.nextInt();

        int resultado = a + b;
        System.out.print("Resultado: "+resultado);

        scanner.close();
    }
}