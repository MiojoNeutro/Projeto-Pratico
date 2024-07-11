import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program that reads a number in inches and converts it to meters.
        //Note: One inch is 0.0254 meter.
        //Test Data
        //Input a value for inch: 1000
        //Expected Output :
        //1000.0 inch is 25.4 meters
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em polegadas: ");
        double polegada = sc.nextDouble();

        double metro = polegada * 0.0254;
        System.out.print("Valor em metros: "+metro);
    }
}