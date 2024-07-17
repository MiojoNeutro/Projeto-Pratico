import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NaoTemCinco {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
try {
    if (idade != 5)
        throw new NaoTemCinco();
    else
        System.out.println(idade);
}catch (NaoTemCinco e){
    System.out.println("Nao tem cinco");
}
    }
}