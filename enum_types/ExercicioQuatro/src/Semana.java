import com.sun.tools.javac.Main;

public enum Semana {
    //Write a Java program to create an enum called
    // "Weekend" with constants representing the days of the weekend.

        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

    public static void main(String[] args) {
        Semana diaUm = Semana.SEGUNDA;
        Semana diaDOis = Semana.TERCA;

        System.out.println("O dia da semana é: "+diaUm);
        System.out.println("O dia da semana é: "+diaDOis);
    }



}



