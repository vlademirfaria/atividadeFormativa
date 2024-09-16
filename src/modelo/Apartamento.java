package modelo;

public class Apartamento extends Financiamento{
    public Apartamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        super(valorDesejadoImovel, prazoFinanciamentoAnos, taxaJurosAnual);
    }

    @Override
    public double calcularPagamentoMensal() {
        // calcular a taxa mensal
        double taxaJurosMensal = this.taxaJurosAnual / 12 / 100;
        int numeroTotalMeses = this.prazoFinanciamento * 12;

        // calcular o financiamento em meses (fórmula PRICE)
        return (this.valorImovel * Math.pow(1 + taxaJurosMensal, numeroTotalMeses) * taxaJurosMensal) /
                (Math.pow(1 + taxaJurosMensal, numeroTotalMeses) - 1);
    }
}
