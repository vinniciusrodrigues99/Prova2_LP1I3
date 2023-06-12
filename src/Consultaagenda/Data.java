package Consultaagenda;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() {
        Scanner ler = new Scanner(System.in);

        do {
            System.out.print("Digite o valor do dia: ");
            dia = ler.nextInt();
        } while (dia < 1 || dia > 31);

        do {
            System.out.print("Digite o valor do mês: ");
            mes = ler.nextInt();
        } while (mes < 1 || mes > 12);

        do {
            System.out.print("Digite o valor do ano: ");
            ano = ler.nextInt();
        } while (ano < 1900 || ano > 2100);
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void entraDia() {
        Scanner ler = new Scanner(System.in);
        do {
            System.out.print("Digite o dia: ");
            dia = ler.nextInt();
        } while (dia < 1 || dia > 31);
    }

    public void entraMes() {
        Scanner ler = new Scanner(System.in);
        do {
            System.out.print("Digite o mês: ");
            mes = ler.nextInt();
        } while (mes < 1 || mes > 12);
    }

    public void entraAno() {
        Scanner ler = new Scanner(System.in);
        do {
            System.out.print("Digite o ano: ");
            ano = ler.nextInt();
        } while (ano < 1900 || ano > 2100);
    }
}