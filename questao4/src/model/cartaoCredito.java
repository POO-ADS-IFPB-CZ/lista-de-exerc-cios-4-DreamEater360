package model;

public class cartaoCredito extends pagamento{

    private double taxa;

    public cartaoCredito(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double processar(double valor) {
        double sum = valor *taxa;
        System.out.println("valor a ser pago é: " + sum);
        return sum;

    }
}
