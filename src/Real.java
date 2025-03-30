class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Real: R$ " + valor);
    }

    @Override
    public double converter() {
        return valor; // Real já está em reais
    }

    @Override
    public String getTipo() {
        return "Real";
    }
}