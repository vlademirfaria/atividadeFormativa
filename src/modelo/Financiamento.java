package modelo;

public class Financiamento {
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public Financiamento(double valorDesejadoImovel, int prazoFinanciamentoAnos, double taxaJurosAnual) {
        this.valorImovel = valorDesejadoImovel;
        this.prazoFinanciamento = prazoFinanciamentoAnos;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double getValorImovel(){
        return valorImovel;
    }

    public int getPrazoFinanciamento(){
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual(){
        return taxaJurosAnual;
    }

    public double calcularPagamentoMensal(){
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 12));
    }

    public double calcularTotalPagamento(){
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void dadosFinanciamento(){
        System.out.println("O valor do imovel é de: R$" + getValorImovel());
        System.out.printf("O prazo do financiamento é de: %d anos.\n", getPrazoFinanciamento());
        System.out.printf("A taxa de juros anual é de: %.2f\n", getTaxaJurosAnual());
        System.out.printf("A taxa de juros mensal é de: %.2f\n", getTaxaJurosAnual() / 12);
        System.out.printf("O pagamento mensal será de: R$%.2f\n", calcularPagamentoMensal());
        System.out.printf("O pagamento total será de: R$%.2f\n", calcularTotalPagamento());
    }
}