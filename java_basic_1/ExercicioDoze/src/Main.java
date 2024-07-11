import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program that takes
        // three numbers as input to calculate and print the average of the numbers.
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o numero A: ");
        double a = sc.nextInt();

        System.out.print("Digite o numero B: ");
        double b = sc.nextInt();
        System.out.print("Digite o numero C: ");
        double c = sc.nextInt();


        double resultado = (a + b + c) / 3;
        System.out.printf("A média dos valores é: %.2f", resultado);


    }
}