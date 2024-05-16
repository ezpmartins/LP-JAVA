import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carta c1 = new Carta(Simbolo.DEZ, Naipe.COPAS);
        Carta c2 = new Carta(Simbolo.DAMA, Naipe.ESPADAS);
        Carta c3 = new Carta(Simbolo.QUATRO, Naipe.PAUS);

        System.out.println(Simbolo.REI.getValor());

        switch (c1.getNaipe()) {
            case COPAS:
                System.out.println("Copas");
                break;
            case PAUS:
                System.out.println("Paus");
                break;
            case OUROS:
                System.out.println("Ouros");
            case ESPADAS:
                System.out.println("Espadas");
                break;
        }
        Scanner leitor = new Scanner(System.in);
        String naipe = leitor.next();
        String simbolo = leitor.next();

        for (Simbolo s: Simbolo.values()){
            if (s.getFigura().equals(simbolo)){
                 String simboloDigitado = "s";
            }
        }
        Carta c4 = new Carta(Simbolo.valueOf(simbolo), Naipe.valueOf(naipe));
        System.out.println(c4);

        //Enumerados são tipo de listas de constantes, que são os valores possiveis que objeto pode receber
    }
}
