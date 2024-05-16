import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Cofrinho {
    Scanner leitor = new Scanner(System.in);

    // Atributos do Cofre
    String dono;
    String metaCofre;
    Double quantia;
    Boolean quebrado = true;

    void depositar(Double valorDepositado) {
        if (quebrado) {
            System.out.println("Você não pode depositar uma quantia, pois seu cofrinho está quebrado 😢");
        } else {
            System.out.println("Quanto deseja depositar no cofrinho ?");
            valorDepositado = leitor.nextDouble();
            quantia += valorDepositado;
            System.out.println("""
                    A quantia de R$: %.2f  foi depositada no seu cofrinho para a sua meta do(a) %s.
                     """.formatted(valorDepositado, metaCofre));
        }
    }

    Double agitar() {
        if (quebrado) {
            System.out.println("Seu cofre está quebrado, não pode agitar ele !");
        } else {
            Double valorAleatorio = ThreadLocalRandom.current().nextDouble(0, quantia);
            System.out.println("""
                    A quantia retirada do cofrinho foi de: R$: %.2f e seu total é de  R$: %.2f
                     """.formatted(valorAleatorio, quantia));
        }
        return null;
    }

    void quebrar() {
        if (!quebrado) {
            System.out.println("Seu cofre está intacto !");
        } else {
            Double valorTotal = quantia;
            System.out.println("""
                    O seu cofrinho foi quebrado o valor que contia nele é de: %.2f
                     """.formatted(quantia));
        }

    }
}

