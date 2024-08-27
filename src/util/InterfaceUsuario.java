package util;
import java.util.Scanner;

public class InterfaceUsuario {
    public double pedirValorImovel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do imóvel: ");
        double valorDesejadoImovel = scanner.nextDouble();
        return valorDesejadoImovel;
    }
    public int pedirPrazoFinanciamento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o prazo do financiamento em anos: ");
        int prazoFinanciamentoAnos = scanner.nextInt();
        return prazoFinanciamentoAnos;
    }
    public double pedirTaxaJuros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a taxa de juros: ");
        double taxaJurosAnual = scanner.nextDouble();
        return taxaJurosAnual;
    }
}