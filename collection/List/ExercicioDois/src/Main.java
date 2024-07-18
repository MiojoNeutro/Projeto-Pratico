import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       //Write a Java program to create an array list,
        // add some colors (strings) and print out the collection.

        ArrayList<String> Cores = new ArrayList<>();

        Cores.add("Rosa");
        Cores.add("Preto");
        Cores.add("Verde");
        Cores.add("Azul");
        Cores.add("vermelho");
        Cores.add("Branco");
        int i = 0;
        for(String lapis: Cores){
            System.out.printf("\nLapis: %d - %s",i+1,lapis);
            i++;
        }
    }
}