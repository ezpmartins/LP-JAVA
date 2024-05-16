public class Teste {
    public static void main(String[] args) {

        Cofrinho cofrinho01 = new Cofrinho();

        cofrinho01.dono = "Enzo Martins";
        cofrinho01.metaCofre = "Adquirir um Playstation 5";
        cofrinho01.quantia = 0.0;
        cofrinho01.quebrado = false;

        cofrinho01.depositar(100.0);
        cofrinho01.agitar();
        cofrinho01.quebrar();

        System.out.println("-----------------------------------");

        Cofrinho cofrinho02 = new Cofrinho();

        cofrinho02.dono = "Mario";
        cofrinho02.metaCofre = "Conquistar a princesa Peach";
        cofrinho02.quantia = 0.0;
        cofrinho02.quebrado = true;

        cofrinho02.depositar(43.2);
        cofrinho02.agitar();
        cofrinho02.quebrar();

        System.out.println("-----------------------------------");

        Cofrinho cofrinho03 = new Cofrinho();

        cofrinho03.dono = "Luigi";
        cofrinho03.metaCofre = "Derrotar o Brownser";
        cofrinho03.quantia = 0.0;
        cofrinho03.quebrado = false;

        cofrinho03.depositar(15.70);
        cofrinho03.agitar();
        cofrinho03.quebrar();
    }
}
