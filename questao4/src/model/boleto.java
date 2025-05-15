package model;

public class boleto extends pagamento{

    private double juros;
    private boolean atrasado;

    public boleto(double juros, boolean atrasado) {
        this.juros = juros;
        this.atrasado = atrasado;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public boolean isAtrasado() {
        return atrasado;
    }

    public void setAtrasado(boolean atrasado) {
        this.atrasado = atrasado;
    }

    @Override
    public double processar(double valor) {
        if (atrasado){
            double sum = valor * juros;
            System.out.println("valor a ser pago é: " + sum);
            return sum;
        } else {
            System.out.println("valor a ser pago é: " + valor);
            return valor;
        }
    }
}
