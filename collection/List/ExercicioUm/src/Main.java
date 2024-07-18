import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> jogos = new ArrayList();

        jogos.add("Chrono Trigger");
        jogos.add("Super Mario");
        jogos.add("Sonic");
        jogos.add("Tiger Heli");

        int i;

        int n = jogos.size();
        for (i = 0; i < n; i++) {
            System.out.printf("\nposição: %d - jogo: %s", i + 1, jogos.get(i));
        }


        System.out.print("\nInforme qual jogo deseja excluir: ");
        i = sc.nextInt();
        try {
            jogos.remove(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indice inválido.");
        }
        i = 0;
        for (String valor : jogos) {
            System.out.printf("\nPosição: %d - %s", i + 1, valor);
            i++;
        }

        i = 0;


    }
}