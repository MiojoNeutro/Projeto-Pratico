import java.util.*;

public class CestaDeFrutas {

    public static void main(String[] args) {
        Set<Fruta> cestaUm = new HashSet<>();
        CadastroFrutas cadastroFrutas = new CadastroFrutas();

        cestaUm.add(cadastroFrutas.getLaranja());
        cestaUm.add(cadastroFrutas.getLimao());
        cestaUm.add(cadastroFrutas.getMaca());
        cestaUm.add(cadastroFrutas.getMaca());
        cestaUm.remove(cadastroFrutas.getLimao());

        boolean existe = cestaUm.contains(cadastroFrutas.getLimao());
        System.out.println(existe);

        int n = cestaUm.size();
        System.out.println("Tamanho da cesta: " + n);
        for (Fruta fruta : cestaUm) {
            System.out.println(fruta);
        }

    }

}
