import java.util.ArrayList;
import java.util.List;

public class CadastroCarros {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<Carro>();
        List<Carro> carrosNovos = new ArrayList<Carro>();

        carros.add(new Carro("Corvet","Honda",2020));
        carros.add(new Carro("CCo","fordK",1989));
        carros.add(new Carro("Leblon","James",2030));

        carrosNovos.addAll(carros);

        for(Carro carro : carrosNovos){
            System.out.println(carro);
        }
    }
}