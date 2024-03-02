package desafios;

import java.util.Scanner;

public class DesafioScanner {
    public static void main(String[] args) {
//         Cadastro de Pet
//        Peça para o usuario digitar:
//         -Nome
//         -Altura
//         -Idade
//         Exiba de maneira "caprichosa"

        Scanner leitorNumerosInteiros = new Scanner(System.in);
        Scanner leitorNumerosDecimais = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        System.out.println("Digite o nome de seu pet:");
        String nomePet = leitorTexto.nextLine();

        System.out.println("Digite altura do seu pet:");
        Double alturaPet = leitorNumerosDecimais.nextDouble();

        System.out.println("Digite a idade de seu  pet:");
        Integer idadePet = leitorNumerosInteiros.nextInt();


        System.out.println(String.format("""
                                
                Pet Cadastrado com sucesso !!!
                ------------------------------------                                             
                O nome do seu pet é: %s
                A altura do seu pet é: %.2f cm
                A idade de seu pet é: %d ano(s)
                ------------------------------------             
                 
                 """, nomePet, alturaPet, idadePet));

    }
}
