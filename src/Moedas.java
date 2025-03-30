abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void info();

    public abstract double converter();

    public void adicionarValor(double valor) {
        this.valor += valor;
    }

    public void removerValor(double valor) {
        if (this.valor >= valor) {
            this.valor -= valor;
        } else {
            System.out.println("Valor a remover é maior do que o disponível.");
        }
    }
    public double getValor() {
        return valor;
    }

    public abstract String getTipo();
}
