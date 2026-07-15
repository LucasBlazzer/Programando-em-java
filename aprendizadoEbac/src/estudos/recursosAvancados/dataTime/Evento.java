package estudos.recursosAvancados.dataTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {
    private String nomeUsuario;
    private LocalDateTime dataHora;
    private DiasDaSemana diasDaSemana;

    // contrutor da classe

    public Evento(String nomeUsuario, LocalDateTime dataHora, DiasDaSemana diasDaSemana) {
        this.nomeUsuario = nomeUsuario;
        this.dataHora = dataHora;
        this.diasDaSemana = diasDaSemana;
    }

    //Exibe os dados do evento
    public void exibirEvento(){
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println("EVENTO AGENDADO");
        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Data e hora do evento: " + dataHora.format(formatoDataHora));

        System.out.println("Dias da semana: " + diasDaSemana);
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}
