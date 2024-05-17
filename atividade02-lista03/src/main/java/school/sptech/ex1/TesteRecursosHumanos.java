package school.sptech.ex1;

public class TesteRecursosHumanos {

    public static void main(String[] args) {

        Colaborador colaborador = new Colaborador("Enzo", "Dev Back-end Jr", 3.500);
        RecursosHumanos recursosHumanos = new RecursosHumanos(10,10);

        recursosHumanos.reajustarSalario(colaborador, 10.0);
        System.out.println("Novo salário após reajuste anual: " + colaborador.getSalario());

        recursosHumanos.promover(colaborador, "Dev Back-end Pleno", 5.880);
        System.out.println("Parabéns você foi promovido para um novo cargo: " + colaborador.getCargo());
        System.out.println("Novo salário após promoção: " + colaborador.getSalario());

        System.out.println("Total de colaboradores promovidos: " + recursosHumanos.getTotalPromovidos());
        System.out.println("Total de colaboradores reajustados: " + recursosHumanos.getTotalReajustados());
    }
}
