import java.util.Scanner;

public class TesteCartas {
    //Este algoritimo tem como finalidade utilizar
    //enum para crias cartas e exibir as informações das mesmas.

    public static void escolherOpcao(NaipesCartas opcao) {
        if (opcao == NaipesCartas.ESPADAS)
            System.out.print("Espadas...");
        else if (opcao == NaipesCartas.PAUS)
            System.out.print("PAUS...");
        else if (opcao == NaipesCartas.COPAS)
            System.out.print("COPAS...");
        else
            System.out.print("Ouros...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a opçao: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                escolherOpcao(NaipesCartas.ESPADAS);
                break;
            case 2:
                escolherOpcao(NaipesCartas.PAUS);
                break;
            case 3:
                escolherOpcao(NaipesCartas.COPAS);
                break;
            case 4:
                escolherOpcao(NaipesCartas.OUROS);
                break;
            default:
                System.out.print("Opçao invalida...");
        }
     sc.close();
    }
}
