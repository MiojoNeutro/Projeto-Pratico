import java.util.ArrayList;
import java.util.Collections;

public class CadastroPessoa {
    public static void main(String[] args) {


        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("ricardo", 18, 1.80));
        pessoas.add(new Pessoa("Lorax", 90, 0.60));
        pessoas.add(new Pessoa("Joana", 22, 1.61));


        Collections.sort(pessoas);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.frasePessoa());
        }

    }


}