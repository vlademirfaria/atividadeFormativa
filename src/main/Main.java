package main;
import java.util.ArrayList;
import java.util.List;
import modelo.*;
import util.InterfaceUsuario;

public class Main {
    public static void main(String[] args) {
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        List<Financiamento> financiamentos = new ArrayList<>();

        financiamentos.add(new Casa(1000000.00, 15, 12));
        financiamentos.add(new Casa(1835423.42, 35, 19));
        financiamentos.add(new Apartamento(37529426.37, 32, 15));
        financiamentos.add(new Apartamento(352013654.00, 22, 10));
        financiamentos.add(new Terreno(interfaceUsuario.pedirValorImovel(), interfaceUsuario.pedirPrazoFinanciamento(), interfaceUsuario.pedirTaxaJuros()));

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento f : financiamentos) {
            totalImoveis += f.getValorImovel();
            totalFinanciamentos += f.calcularTotalPagamento();

            f.dadosFinanciamento();
            System.out.println();
        }

        System.out.printf("Total de todos os imóveis: R$%.2f\n", totalImoveis);
        System.out.printf("Total de todos os financiamentos: R$%.2f\n", totalFinanciamentos);
    }
}