import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Calcular Total em Reais");
            System.out.println("5 - Encerrar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Escolha a moeda (1-Real, 2-Dólar, 3-Euro): ");
                    int tipo = scanner.nextInt();
                    System.out.print("Digite o valor: ");
                    double valor = scanner.nextDouble();

                    if (tipo == 1) cofrinho.adicionar(new Real(valor));
                    else if (tipo == 2) cofrinho.adicionar(new Dolar(valor));
                    else if (tipo == 3) cofrinho.adicionar(new Euro(valor));
                    else System.out.println("Opção inválida!");
                    break;

                case 2:
                    System.out.print("Escolha a moeda para remover (1-Real, 2-Dólar, 3-Euro): ");
                    int tipoRemocao = scanner.nextInt();
                    System.out.print("Digite o valor a remover: ");
                    double valorRemocao = scanner.nextDouble();

                    if (tipoRemocao == 1) cofrinho.remover(valorRemocao, Real.class);
                    else if (tipoRemocao == 2) cofrinho.remover(valorRemocao, Dolar.class);
                    else if (tipoRemocao == 3) cofrinho.remover(valorRemocao, Euro.class);
                    else System.out.println("Opção inválida!");
                    break;

                case 3:
                    cofrinho.listagemMoedas();
                    break;

                case 4:
                    System.out.println("Total em Reais: R$ " + cofrinho.totalConvertido());
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        scanner.close();
    }
}