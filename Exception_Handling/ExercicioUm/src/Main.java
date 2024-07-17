import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
try {
    System.out.println("Digite um numero: ");
    int a = sc.nextInt();

    System.out.println(a);
}catch (InputMismatchException e){
    System.out.println("Por favor, digite um valor numerico inteiro.");
}
finally {

    System.out.print("Limpando tabela..."+0);
}
        sc.close();

    }
}