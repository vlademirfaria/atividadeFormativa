package modelo;
import java.math.BigDecimal;
import java.math.RoundingMode;
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
        return this.valorImovel;
    }

    public int getPrazoFinanciamento(){
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual(){
        return this.taxaJurosAnual;
    }

    public BigDecimal calcularPagamentoMensal() {
        BigDecimal taxaJurosMensal = BigDecimal.valueOf(this.taxaJurosAnual).divide(BigDecimal.valueOf(12 * 100), 10, RoundingMode.HALF_UP);
        int numeroParcelas = this.prazoFinanciamento * 12;

        BigDecimal fator = taxaJurosMensal.add(BigDecimal.ONE).pow(numeroParcelas);
        BigDecimal pagamentoMensal = BigDecimal.valueOf(this.valorImovel)
                .multiply(taxaJurosMensal)
                .multiply(fator)
                .divide(fator.subtract(BigDecimal.ONE), 2, RoundingMode.HALF_UP);

        return pagamentoMensal;
    }


    public BigDecimal calcularTotalPagamento() {
        BigDecimal numeroParcelas = BigDecimal.valueOf(this.prazoFinanciamento * 12);
        return calcularPagamentoMensal().multiply(numeroParcelas);
    }

    public void dadosFinanciamento(){
        System.out.printf("O valor do imovel é de: R$%.2f\n", getValorImovel());
        System.out.printf("O prazo do financiamento é de: %d anos.\n", getPrazoFinanciamento());
        System.out.printf("A taxa de juros anual é de: %.2f\n", getTaxaJurosAnual());
        System.out.printf("A taxa de juros mensal é de: %.2f\n", getTaxaJurosAnual() / 12);
        System.out.printf("O pagamento mensal será de: R$%.2f\n", calcularPagamentoMensal());
        System.out.printf("O pagamento total será de: R$%.2f\n", calcularTotalPagamento());
    }
}