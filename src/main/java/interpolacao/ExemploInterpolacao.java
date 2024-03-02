package interpolacao;

public class ExemploInterpolacao {
    public static void main(String[] args) {
        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.63;

        // Na  Interpolação utilizamos:
        // Para String %s
        // Para Inteiros %d
        //Para Double %2f (sendo 2 a quantidade de casas decimais)


        String fraseFormatatada = String.format("""
                Meu nome é:%s
                Minha idade é: %d
                Minha altura é: %2f
                """, nome, idade, altura);

        //Segunda maneira

        String fraseFormatadaSegundaAlternativa = """
                Meu nome é:%s
                Minha idade é: %d
                Minha altura é: %2f
                """.formatted(nome, idade, altura);

        Boolean petVacinado = false;
//        String frasePetVacinado = petVacinado ? "Sim" : "Não";

        System.out.println(
                """
                        Meu nome é:%s
                        O nome do meu pet é: %s
                        Minha idade é: %d
                        Minha altura é: %2f
                        Pet Vacinado: %s 
                                                
                        """.formatted(nome, "Caramelo", idade, altura, (petVacinado ? "Sim" : "Não"))
        );


        // Se a idade for menor que 15, o salário será de R$ 1000,00
        // Se for maior ou igual a 15 o salário será de R$ 1412,00
        Integer idadeParaPagamento = 15;
        Double valorSalario = idadeParaPagamento > 15 ? 1412.0 : 1000.0;
        Boolean isMaiorIdade = idadeParaPagamento > 18;

        System.out.println(valorSalario);

        //Cuidado com nome de Boolean !
        // Não faça isso !!!

        Boolean bloqueadoOuNao = false;

        if (!bloqueadoOuNao) {
            System.out.println("Ta bloqueado!!");
        }
    }
}