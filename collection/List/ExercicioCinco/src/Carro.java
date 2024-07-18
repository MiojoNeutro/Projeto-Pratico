public class Carro {
    private String nome;
    private String marca;
    private int ano;

    public Carro(String nome, String marca, int ano){
        this.ano = ano;
        this.nome = nome;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                '}';
    }
}
