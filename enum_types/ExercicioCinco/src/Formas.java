
public enum Formas {
    QUADRADO, CIRCULO;
//Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.

    public static void main(String[] args) {
        Formas formaUm = Formas.QUADRADO;
        Formas formaDois = Formas.CIRCULO;

        System.out.println("A forma um é: "+formaUm);
        System.out.println("A forma um é: "+formaDois);
    }
}
