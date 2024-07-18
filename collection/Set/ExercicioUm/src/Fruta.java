public class Fruta {
    private final String nome;
    private final String cor;
    private final String gosto;

    public Fruta(String nome, String cor, String gosto) {
        this.nome = nome;
        this.cor = cor;
        this.gosto = gosto;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", gosto='" + gosto + '\'' +
                '}';
    }
}
