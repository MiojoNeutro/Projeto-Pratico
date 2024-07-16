import java.util.Scanner;

public class TestadoraEnum {
public static void escolheOpcao(MenuOpcao opcao){
    if(opcao == MenuOpcao.PLAY){
        System.out.print("Inciando...");
    }
    else if(opcao == MenuOpcao.QUIT){
        System.out.print("Desligando...");
    }
    else
        System.out.print("Congratulation...");
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========");
        System.out.println("1 = Play");
        System.out.println("2 = Credits");
        System.out.println("3 = Quit");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                escolheOpcao(MenuOpcao.PLAY);
                break;
            case 2:
                escolheOpcao(MenuOpcao.CREDITS);
                break;
            case 3:
                escolheOpcao(MenuOpcao.QUIT);
                break;
                default:
                System.out.print("Valor invalido.");

        }

        }
    }

