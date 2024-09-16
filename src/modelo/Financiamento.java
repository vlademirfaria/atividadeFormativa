package modelo;

public class Financiamento {
    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;

    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel(){
        return this.valorImovel;
    }

    public int getPrazoFinanciamento(){
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual(){
        return this.taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        double taxaJurosMensal = this.taxaJurosAnual / 12 / 100; // Conversão para porcentagem
        int numeroTotalMeses = this.prazoFinanciamento * 12;

        return (this.valorImovel * taxaJurosMensal * Math.pow(1 + taxaJurosMensal, numeroTotalMeses)) /
                (Math.pow(1 + taxaJurosMensal, numeroTotalMeses) - 1);
    }

    // Médodo para calcular o total de pagamentos ao longo do financiamento

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    // Exibir dados do financiamento
    public void dadosFinanciamento(){
        System.out.printf("O valor do imóvel é de: R$%.2f\n", getValorImovel());
        System.out.printf("O prazo do financiamento é de: %d anos.\n", getPrazoFinanciamento());
        System.out.printf("A taxa de juros anual é de: %.2f%%\n", getTaxaJurosAnual());
        System.out.printf("A taxa de juros mensal é de: %.2f%%\n", getTaxaJurosAnual() / 12);
        System.out.printf("O pagamento mensal será de: R$%.2f\n", calcularPagamentoMensal());
        System.out.printf("O pagamento total será de: R$%.2f\n", calcularTotalPagamento());
    }
}
