import java.util.Scanner;

public class BasicoSeis {
    public static void main(String[] args) {
        //Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        //Test Data:
        //Input first number: 125
        //Input second number: 24
        //Expected Output :
        //125 + 24 = 149
        //125 - 24 = 101
        //125 x 24 = 3000
        //125 / 24 = 5
        //125 mod 24 = 5

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nuemero A: ");
        int a = sc.nextInt();

        System.out.print("Digite o nuemro B: ");
        int b = sc.nextInt();

        System.out.println("===== Escolha o operador =====");
        System.out.println("1 = + 'Adição'");
        System.out.println("2 = - 'Subtração'");
        System.out.println("3 = x 'Multiplicação'");
        System.out.println("4 = / 'Divisão'");
        System.out.println("5 = % 'Resto'");
        System.out.println("==============================");
        int condicao = sc.nextInt();

        int resultado = 0;


        switch (condicao) {
            case 1:
                resultado = a + b;
                break;
            case 2:
                resultado = a - b;
                break;
            case 3:
                resultado = a * b;
                break;
            case 4:
                resultado = a / b;
                break;
            case 5:
                resultado = a % b;
                break;
            default:
        }

        System.out.println("resultado: " + resultado);

        sc.close();
    }
}