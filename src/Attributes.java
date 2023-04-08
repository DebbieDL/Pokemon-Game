import java.util.Random;
public class Attributes {



    Random random = new Random();

    //Pokemon

    String[] pokemons = {"Wartortle","Ivysaur","Bulbasaur"};
    String[] enemyPokemons = {"Gimmighoul","Togedemaru","Amaura","Deerling"};

    // randomizing pokemons

    String pokemon = pokemons[random.nextInt(pokemons.length)];
    String enemypokemon = enemyPokemons[random.nextInt(enemyPokemons.length)];

    //Pokemon health

    int pokemonHp = 10000;
    int enemyHp = 10000;

    int enemyHp1;

    int Hp1;

    //pokemon defence

    int defence = 1000;

    //Pokemon damage

    int pokemonDamage = 5000;



    //attacks





    String[] att = {"Fire Ball","Shark Bite","Claw Punch","Freezing Wave","Laser Eye"};







}
