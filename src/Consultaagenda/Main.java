package Consultaagenda;
import java.util.Scanner;
public class Main{
 public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 12, 6, 2023, "João", "Dr. Silva");
        p1.exibirPropriedades();

        System.out.println();

        ConsultaAgendada p2 = new ConsultaAgendada();
        p2.exibirPropriedades();

        System.out.println();
        Scanner ler = new Scanner(System.in);
        char op;

       do  {
            System.out.print("Deseja continuar a execucao? (S/N) ");
            op = ler.next().charAt(0);

            if(op=='S' || op=='s') {
                p1 = new ConsultaAgendada();
            }
       } while (op!='N' && op!='n');

        p1.exibirPropriedades();

        System.out.println();

        System.out.println("Quantidade de consultas: " + ConsultaAgendada.getQuantidade());
    
    }}


