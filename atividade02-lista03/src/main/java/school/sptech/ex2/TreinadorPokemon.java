package school.sptech.ex2;

public class TreinadorPokemon {
    // Atributos

    private String nome;
    private Double nivel;

    // Construtores

    public TreinadorPokemon(String nome, Double nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    public TreinadorPokemon(){
        // Construtor vazio
    }


    // Métodos

    public void treinarPokemon(Pokemon pokemon) {
        pokemon.setForca(pokemon.getForca() * 1.1);
        pokemon.setDoces(pokemon.getDoces() + 10);
    }

    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao) {
        if (pokemon.getDoces() >= 50) {
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            nivel += 10;
        } else {
            System.out.println("Não foi possível realizar operação");
        }
    }

    // Getters & Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }
}