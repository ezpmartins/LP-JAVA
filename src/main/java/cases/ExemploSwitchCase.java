package cases;

import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana:");
        Integer diaSemana = leitor.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Aula de LP !!!");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta !");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sextouu!!");
                break;
            default:
                System.out.println("Número inválido !");
        }
        System.out.println("Digite uma fruta:");
        String fruta = leitor.nextLine();

        switch (fruta) {
            case "Maça":
                System.out.println("Temos maças no estoque");
                break;
            case "Melancia":
                System.out.println("Temos Melancias no estoque");
                break;
            case "Kiwi":
                System.out.println("Não é epoca de Kiwi, não temos");
                break;
            default:
                System.out.println("Não idenfiquei a fruta digitada.");
        }
    }


}
