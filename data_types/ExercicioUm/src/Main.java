import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
        //Test Data
        //Input a degree in Fahrenheit: 212
        //Expected Output:
        //212.0 degree Fahrenheit is equal to 100.0 in Celsius

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit - 32)/1.8;

        System.out.print("A temperatura em Celsius: "+celsius);
    }
}