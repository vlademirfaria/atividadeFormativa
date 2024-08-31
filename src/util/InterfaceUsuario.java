package util;
import modelo.Financiamento;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner scanner = new Scanner(System.in);

    public Financiamento criarFinanciamento() {
        double valorImovel = pedirValorImovel();
        int prazoFinanciamento = pedirPrazoFinanciamento();
        double taxaJuros = pedirTaxaJuros();
        return new Financiamento(valorImovel, prazoFinanciamento, taxaJuros);
    }

    public double pedirValorImovel() {
        double valorDesejadoImovel;
        do {
            System.out.println("Informe o valor do imóvel: ");
            valorDesejadoImovel = scanner.nextDouble();
            if (valorDesejadoImovel < 10000) { // Valor minimo que a maioria dos bancos financiam terrenos/imóveis
                System.out.println("Valor de financiamento muito baixo. Digite um valor maior.");
            }
        } while (valorDesejadoImovel < 10000);
        return valorDesejadoImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamentoAnos;
        do {
            System.out.println("Informe o prazo do financiamento em anos: (mínimo de 10 e máximo de 35 anos) ");
            prazoFinanciamentoAnos = scanner.nextInt();
            if (prazoFinanciamentoAnos < 10 || prazoFinanciamentoAnos > 35) { // Prazo minímo e máximo que os bancos trabalham
                System.out.println("Digite um valor válido de anos.");
            }
        } while (prazoFinanciamentoAnos < 10 || prazoFinanciamentoAnos > 35);
        return prazoFinanciamentoAnos;
    }

    public double pedirTaxaJuros() {
        double taxaJurosAnual;
        do {
            System.out.println("Informe a taxa de juros: ");
            taxaJurosAnual = scanner.nextDouble();
            if (taxaJurosAnual < 8.99 || taxaJurosAnual > 12) { // Taxa de juro minima que a maioria dos bancos praticam
                System.out.println("Digite um valor válido de taxas de juros"); // em projetos como minha casa minha vida
            }
        } while (taxaJurosAnual < 8.99 || taxaJurosAnual > 12); // taxa de juros anual máxima praticada pela
        return taxaJurosAnual;                                  // maioria dos bancos
    }
}