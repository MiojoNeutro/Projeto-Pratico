public enum NaipesCartas {
    ESPADAS(1), PAUS(2), COPAS(3), OUROS(4);

    private final int valor;

    NaipesCartas(int valorOpcao) {
        valor = valorOpcao;
    }

    public int getValor() {
        return valor;
    }

}