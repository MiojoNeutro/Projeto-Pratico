public enum Direcoes {
    //Write a Java program to implement an enum called "Direction" with constants representing the cardinal directions (North, South, East, West).

    NORTE, SUL,LESTE, OESTE;

    public static void main(String[] args) {
        Direcoes direcaoUm = Direcoes.SUL;
        Direcoes direcaoDois = Direcoes.NORTE;

        System.out.println("A direção é: "+direcaoUm);
        System.out.println("A direção é: "+direcaoDois);
    }
}
