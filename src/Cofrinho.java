import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda novaMoeda) {
        for (Moeda moeda : listaMoedas) {
            if (moeda.getTipo().equals(novaMoeda.getTipo())) {
                moeda.adicionarValor(novaMoeda.getValor());
                return;
            }
        }
        listaMoedas.add(novaMoeda);
    }

    public void remover(double valor, String tipoMoeda) {
        for (int i = 0; i < listaMoedas.size(); i++) {
            Moeda moeda = listaMoedas.get(i);
            if (moeda.getTipo().equals(tipoMoeda)) {
                moeda.removerValor(valor);
                if (moeda.getValor() == 0) {
                    listaMoedas.remove(i);
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
