package Consultaagenda;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ConsultaAgendada {
    private Data data;
    private String hora;
    private String nomePaciente;
    private String nomeMedico;
    private static int quantidade = 0;

    public ConsultaAgendada(int h, int mi, int s, int d, int m, int a, String p, String medico) {
        data = new Data(d, m, a);
        hora = String.format("%02d:%02d:%02d", h, mi, s);
        nomePaciente = p;
        nomeMedico = medico;
        quantidade++;
    }

    public ConsultaAgendada() {
        Scanner ler = new Scanner(System.in);

        boolean dataValida = false;

        do {
            try {
                System.out.print("Digite a data da consulta (dia/mês/ano): ");
                String dataString = ler.nextLine();
                String[] partesData = dataString.split("/");
                int dia = Integer.parseInt(partesData[0]);
                int mes = Integer.parseInt(partesData[1]);
                int ano = Integer.parseInt(partesData[2]);
                data = new Data(dia, mes, ano);
                dataValida = true;
            } catch (Exception ex) {
                System.out.println("Digite a data no formato dia/mês/ano");
            }
        } while (!dataValida);

        System.out.print("Digite a hora da consulta (hh:mm:ss): ");
        hora = ler.nextLine();

        System.out.print("Digite o nome do paciente: ");
        nomePaciente = ler.nextLine();

        System.out.print("Digite o nome do médico: ");
        nomeMedico = ler.nextLine();

        quantidade++;
    }

    // Restante da classe...

    public static int getQuantidade() {
        return quantidade;
    }

    public String getData() {
        // Formatar a data no formato "dd/mm/aa"
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        Date date = new Date();
        date.setYear(data.getAno() - 1900);
        date.setMonth(data.getMes() - 1);
        date.setDate(data.getDia());
        return formatter.format(date);
    }

    public String getHora() {
        // Formatar a hora no formato "hh:mm:ss"
        return hora;
    }

    public void setData(String data)
    {
        
    String[] partesData = data.split("/");
    int dia = Integer.parseInt(partesData[0]);
    int mes = Integer.parseInt(partesData[1]);
    int ano = Integer.parseInt(partesData[2]);
    this.data = new Data(dia, mes, ano);
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public void exibirPropriedades() {
        System.out.println("Data: " + getData());
        System.out.println("Hora: " + getHora());
        System.out.println("Nome do Paciente: " + nomePaciente);
        System.out.println("Nome do Médico: " + nomeMedico);
    }
}
    