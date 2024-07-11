import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program that takes three numbers from the user and prints the greatest number.
        //
        //Test Data
        //Input the 1st number: 25
        //Input the 2nd number: 78
        //Input the 3rd number: 87
        //Expected Output :
        //The greatest: 87

        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        for (int x = 1; x < 4; x++) {
            System.out.print("Informe um valor " + x + ": ");
            int valor = sc.nextInt();

            if (valor > resultado) {
                resultado = valor;
            }
        }
        System.out.println("O maior numero é: " + resultado);

    }
}