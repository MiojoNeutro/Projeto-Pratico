import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Write a Java program to convert minutes into years and days.
        //
        //Test Data
        //Input the number of minutes: 3456789
        //Expected Output :
        //3456789 minutes is approximately 6 years and 210 days

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em minutos: ");
        int minuto = sc.nextInt();

        int ano = (((minuto / 60) / 24) / 365);

        int minutoPorAno = 60 * 24 * 365;
        int minutosRestantes = minuto % minutoPorAno;
        int diasRestantes = minutosRestantes / (60 * 24);

        System.out.print(minuto + " minutos é aproximadamente " + ano + " anos e " + diasRestantes + " dias.");


        sc.close();
    }
}