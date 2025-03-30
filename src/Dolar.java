class Dolar extends Moeda {
    private static final double COTACAO = 5.0;

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dólar: US$ " + valor);
    }

    @Override
    public double converter() {
        return valor * COTACAO;
    }
}
