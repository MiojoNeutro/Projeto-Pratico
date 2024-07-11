
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program that takes a number from the user and generates an integer
        // between 1 and 7. It displays the weekday name.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.print("Terça-Feira");
            case 3:
                System.out.print("Quarta-Feira");
                break;
            case 4:
                System.out.print("Quinta-Feira");
                break;
            case 5:
                System.out.print("Sexta-Feira");
                break;
            case 6:
                System.out.print("Sabado");
                break;
            case 7:
                System.out.print("Domingo-Feira");
                break;
            default:
                System.out.println("Valor invalido");


        }

    }
}