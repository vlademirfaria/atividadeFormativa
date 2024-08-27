package util;
import java.util.Scanner;

public class InterfaceUsuario {
    public double pedirValorImovel() {
        Scanner scanner = new Scanner(System.in);
        double valorDesejadoImovel;
        do {
            System.out.println("Informe o valor do imóvel: ");
            valorDesejadoImovel = scanner.nextDouble();
            if (valorDesejadoImovel < 10000) {
                System.out.println("Valor de financiamento muito baixo. Digite um valor maior.");
            }
        } while (valorDesejadoImovel < 10000);
        return valorDesejadoImovel;
    }

    public int pedirPrazoFinanciamento() {
        Scanner scanner = new Scanner(System.in);
        int prazoFinanciamentoAnos;
        do {
            System.out.println("Informe o prazo do financiamento em anos: (mínimo de 10 e máximo de 35 anos) ");
            prazoFinanciamentoAnos = scanner.nextInt();
            if (prazoFinanciamentoAnos < 10 || prazoFinanciamentoAnos > 35) {
                System.out.println("Digite um valor válido de anos.");
            }
        } while (prazoFinanciamentoAnos < 10 || prazoFinanciamentoAnos > 35);
        return prazoFinanciamentoAnos;
    }

    public double pedirTaxaJuros() {
        Scanner scanner = new Scanner(System.in);
        double taxaJurosAnual;
        do {
            System.out.println("Informe a taxa de juros: ");
            taxaJurosAnual = scanner.nextDouble();
            if (taxaJurosAnual < 8.99 || taxaJurosAnual > 12) {
                System.out.println("Digite um valor válido de taxas de juros");
            }
        } while (taxaJurosAnual < 8.99 || taxaJurosAnual > 12);
        return taxaJurosAnual;
    }
}