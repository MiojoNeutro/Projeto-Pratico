import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program to print the area and perimeter of a rectangle.
        //Test Data:
        //Width = 5.5 Height = 8.5
        //
        //Expected Output
        //Area is 5.6 * 8.5 = 47.60
        //Perimeter is 2 * (5.6 + 8.5) = 28.20

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o comprimento do retangulo: ");
        float ladoA = sc.nextFloat();

        System.out.print("Digite a largura do retangulo: ");
        float ladeB = sc.nextFloat();

        float area = ladoA * ladeB;
        float perimetro = 2 * (ladoA + ladeB);

        System.out.println("Area: " + area);
        System.out.println("Perimentro: " + perimetro);

        sc.close();
    }
}