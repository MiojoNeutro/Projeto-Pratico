import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            mostrarIdade();
        } catch (InputMismatchException e) {
            System.out.println("Caracter invalido.");
        }


    }

    private static void mostrarIdade() throws InputMismatchException {
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println(idade);
    }
}