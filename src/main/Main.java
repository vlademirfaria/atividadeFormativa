package main;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
        List<Financiamento> financiamentos = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            System.out.println("Financiamento " + i + ":");
            Financiamento financiamento = interfaceUsuario.criarFinanciamento();
            financiamentos.add(financiamento);
            // Exibe os detalhes do financiamento
            financiamento.dadosFinanciamento();
            System.out.println(); // Linha em branco para melhor leitura
        }

        double totalImoveis = 0;
        BigDecimal totalFinanciamentos = BigDecimal.ZERO;

        for (Financiamento f : financiamentos){
            totalImoveis += f.getValorImovel();
            totalFinanciamentos = totalFinanciamentos.add(f.calcularTotalPagamento());
        }

        System.out.printf("Total de todos os imóveis: R$%.2f\n", totalImoveis);
        System.out.printf("Total de todos os financiamentos: R$%.2f\n", totalFinanciamentos);
    }
}