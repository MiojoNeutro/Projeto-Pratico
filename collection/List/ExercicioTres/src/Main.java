import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Cores = new ArrayList<>();

        Cores.add("Cinza");
        Cores.add("Preto");
        Cores.add("Branco");
        Cores.add("Amarelo");


        String elementoMover = Cores.getFirst();
        Cores.remove(2);
        Cores.add(2, elementoMover);

        int n = Cores.size();
        for(int i = 0; i < n; i++){
            System.out.printf("\nCor numero %d: %s",i,Cores.get(i));
        }
    }
}