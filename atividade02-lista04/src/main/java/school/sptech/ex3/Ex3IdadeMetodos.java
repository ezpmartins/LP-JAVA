package school.sptech.ex3;

public class Ex3IdadeMetodos {

    // Coloque os métodos aqui
    void classificaIdade(Integer idade) {
        if (idade >= 0 && idade <= 2) {
            System.out.println("Bebê");
        } else if (idade >= 3 && idade <= 11) {
            System.out.println("Criança");
        } else if (idade >= 12 && idade <= 19) {
            System.out.println("Adolescente");
        } else if (idade >= 20 && idade <= 30) {
            System.out.println("Jovem");
        } else if (idade >= 31 && idade <= 60) {
            System.out.println("Adulto");
        } else if (idade > 60) {
            System.out.println("Idoso");
        } else {
            System.out.println("Idade Inválida");
        }
    }
}
