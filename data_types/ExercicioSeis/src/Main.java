import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program to compute the body mass index (BMI).
        //
        //Test Data
        //Input weight in pounds: 452
        //Input height in inches: 72
        //Expected Output:
        //Body Mass Index is 61.30159143458721
        //Fiz com medidas usadas no Brasil.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em Kg: ");
        float peso = sc.nextFloat();

        System.out.print("Digite sua altura em metros: ");
        float altura = sc.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("==================");
        System.out.printf("IMC = %.2f", imc);
        System.out.println("\n=== Tabela IMC ===");
        System.out.println("MENOR QUE 18,5 - MAGREZA - 0");
        System.out.println("ENTRE 18,5 E 24,9 - NORMAL - 0");
        System.out.println("ENTRE 25,0 E 29,9 - SOBREPESO - I");
        System.out.println("ENTRE 30,0 E 39,9 - OBESIDADE - II");
        System.out.println("MAIOR QUE 40,0 - OBESIDADE GRAVe - III");
        System.out.println("==================\n");

    }
}