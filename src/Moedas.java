abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract void info();

    public abstract double converter();

    public void removerValor(double valor) {
        if (this.valor >= valor) {
            this.valor -= valor;
        } else {
            System.out.println("Valor a remover é maior do que o disponível.");
        }
    }
}
