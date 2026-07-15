package estudos.recursosAvancados.dataTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class dataTimeNaPratica {

    public static void exercutarDataTimeNaPratica(){
        // Obtém a data e hora atuais
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        int posicaoDia = dataHoraAtual.getDayOfWeek().getValue() - 1;

        DiasDaSemana diaAtual = DiasDaSemana.values()[posicaoDia];

        //Criação do evento
        Evento evento = new Evento("Apresentação do Projeto", dataHoraAtual, diaAtual);

        evento.exibirEvento();

        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime dataComMaisCincoDias = evento.getDataHora().plusDays(5);
        System.out.println();
        System.out.println("EVENTO APÓS 5 DIAS");
        System.out.println("Nova data e hora: " + dataComMaisCincoDias.format(formatoDataHora));

        //identificação dos fusos horários
        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");

        ZoneId fusoGMT = ZoneId.of("GMT");

        /**
         * Define que a data informada pertece ao fuso horário de São Paulo.
         */
        ZonedDateTime horarioSaoPaulo = dataComMaisCincoDias.atZone(fusoSaoPaulo);

        /**
         * Converte o mesmo instante para o horário GMT.
         */
        ZonedDateTime horarioGMT = horarioSaoPaulo.withZoneSameInstant(ZoneId.of("GMT"));

        DateTimeFormatter formatoComFuso = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");

        System.out.println();
        System.out.println("CONVERSÃO DE FUSOS");

        System.out.println("Horário de São Paulo: " + horarioSaoPaulo.format(formatoComFuso));
        System.out.println("Horário GMT: " + horarioGMT.format(formatoComFuso));
    }
}
