import java.util.Scanner;

public class BasicoSete {
    public static void main(String[] args) {
        //Write a Java program that takes a number as input and prints its multiplication table up to 10.
        //Test Data:
        //Input a number: 8
        //Expected Output :
        //8 x 1 = 8
        //8 x 2 = 16
        //8 x 3 = 24
        //...
        //8 x 10 = 80
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero desejado: ");
        int a = sc.nextInt();
        for (int x = 0; x < 11; x++) {
            int resultado = a * x;
            System.out.println(a + " x " + x + " = " + resultado);
        }
    }
}