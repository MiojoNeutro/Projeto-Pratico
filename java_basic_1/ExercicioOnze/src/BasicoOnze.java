import java.util.Scanner;

public class BasicoOnze {
    public static void main(String[] args) {
        //Write a Java program to print the area and perimeter of a circle.
        //Test Data:
        //Radius = 7.5
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586

        Scanner sc = new Scanner(System.in);
        final double pi = 3.1415;
        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double perimetro = 2 * pi * raio;
        double area = pi * (raio * raio);

        System.out.println("Perimentro: " + perimetro);
        System.out.println("Area: " + area);

        sc.close();
    }
}