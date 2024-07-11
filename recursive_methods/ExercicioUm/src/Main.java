import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java recursive method to calculate
        //the factorial of a given positive integer.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        int fatorial = fatorial(valor);

        System.out.print("O fatorial no numero "+valor+" é "+fatorial);
    }



    public static int fatorial(int n) {
    if(n == 0){
        return 1;
}
        return n * fatorial(n - 1);
    }
}