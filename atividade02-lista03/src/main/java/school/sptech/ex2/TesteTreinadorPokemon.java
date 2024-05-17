package school.sptech.ex2;

public class TesteTreinadorPokemon {
    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon("Evee","Normal",55.0,45);
        TreinadorPokemon treinador = new TreinadorPokemon("Enzo",40.0);

        treinador.treinarPokemon(pokemon);
        System.out.println("Força do pokémon depois do treinamento: " + pokemon.getForca());
        System.out.println("Doces do pokémon depois do treinamento: " + pokemon.getDoces());

        System.out.println("_______________________________________________________");

        treinador.evoluirPokemon(pokemon,"Jolteon");
        System.out.println("Nome do pokémom depois da evolução: " + pokemon.getNome());
        System.out.println("Doces do pokémon depois da evolução: " + pokemon.getDoces());
        System.out.println("Nivel do treinador depois de evoluir o pokémon: " + treinador.getNivel());
    }
}
