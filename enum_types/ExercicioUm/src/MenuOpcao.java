public enum MenuOpcao {
    QUIT(3),PLAY(1),CREDITS(2);

    private final int valorOpcao;
    MenuOpcao(int valor){
    valorOpcao = valor;
    }

    public int getValorOpcao() {
        return valorOpcao;
    }

}