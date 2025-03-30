class Euro extends Moeda {
    private static final double COTACAO = 5.5;

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Euro: € " + valor);
    }

    @Override
    public double converter() {
        return valor * COTACAO;
    }
}
