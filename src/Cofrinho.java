import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    public void remover(double valor, Class<?> tipoMoeda) {
        for (Moeda moeda : listaMoedas) {
            if (moeda.getClass() == tipoMoeda) {
                moeda.removerValor(valor);
                if (moeda.valor == 0) {
                    listaMoedas.remove(moeda);
                }
                return;
            }
        }
        System.out.println("Não há moedas suficientes desse tipo para remover.");
    }

    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            for (Moeda moeda : listaMoedas) {
                moeda.info();
            }
        }
    }

    public double totalConvertido() {
        double total = 0;
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();
        }
        return total;
    }
}
