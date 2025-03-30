import java.util.ArrayList;

class Cofrinho {
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
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
