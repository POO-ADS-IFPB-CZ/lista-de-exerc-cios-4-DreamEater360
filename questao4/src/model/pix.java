package model;
import java.time.LocalDate;
import java.util.Objects;

public class pix extends pagamento{

    private LocalDate dataAgendamento;
    private boolean agendado;

    public pix(LocalDate dataAgendamento, boolean agendado) {
        this.dataAgendamento = dataAgendamento;
        this.agendado = agendado;
    }

    public pix() {
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDate dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public boolean getAgendado() {
        return agendado;
    }

    public void setAgendado(boolean agendado) {
        this.agendado = agendado;
    }

    @Override
    public double processar(double valor) {
        if (agendado){
            if (Objects.equals(dataAgendamento, LocalDate.now())){
                System.out.println("valor a ser pago é: " + valor);
                return valor;
            }
        }
        System.out.println("valor a ser pago é: " + valor);
        return valor;

    }
}
