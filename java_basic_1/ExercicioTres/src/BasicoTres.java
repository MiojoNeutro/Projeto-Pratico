import java.util.Scanner;

public class BasicoTres {
    public static void main(String[] args) {
        //Write a Java program to divide two numbers and print them on the screen.
        //Test Data :
        //50/3
        //Expected Output :
        //16

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero A: ");
        int a = sc.nextInt();

        System.out.print("Digite um numero B: ");
        int b = sc.nextInt();

        int resultado = a / b;
        System.out.print("resultado: "+resultado);

        sc.close();
    }
}