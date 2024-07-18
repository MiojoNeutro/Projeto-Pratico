public class Pessoa implements Comparable<Pessoa> {


    private String nome;
    private int idade;
    private double altura;


    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public int compareTo(Pessoa outraPessoa) {
        // Ordena por altura (do maior para o menor)
        return Double.compare(outraPessoa.altura, this.altura);
    }

    public String frasePessoa() {
        return "Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura;
    }


}