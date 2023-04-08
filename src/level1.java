import java.util.Scanner;
public class level1 extends Attributes {

    Scanner sc = new Scanner(System.in);

    public void level1() {

        System.out.println("---Level 1---");
        System.out.println("Your pokemon has been choosed: " + pokemon);
        System.out.println("Your opponent is: " + enemypokemon);
        String yourPokemon = pokemon;
        String enemyPokemon = enemypokemon;

        System.out.println("Let the battle begin!");

        while (enemyHp <= 10000 && enemyHp > 0 && pokemonHp <= 10000 && pokemonHp > 0) {

            //Randomizing amount of damage per attack
            int fireball = random.nextInt(pokemonDamage);

            int sharkbite = random.nextInt(pokemonDamage);

            int clawpunch = random.nextInt(pokemonDamage);

            int freezingwave = random.nextInt(pokemonDamage);

            int lasereye = random.nextInt(pokemonDamage);


            System.out.println("Your turn!");
            System.out.println("(1) Fire Ball");
            System.out.println("(2) Shark Bite");
            System.out.println("(3) Claw Punch");
            System.out.println("(4) Freezing wave");
            System.out.println("(5) Laser Eye");

            int attack = sc.nextInt();

            switch (attack) {

                case 1:




                    System.out.println("You attacked " + enemyPokemon + " with a Fire Ball");
                    enemyHp1 = enemyHp - fireball;
                    System.out.println("You have dealt " + fireball + " damage");
                    if(enemyHp1 < 0){
                        enemyHp1 = 0;
                    }
                    System.out.println("Enemy Hp: " + enemyHp1);
                    enemyHp = enemyHp1;


                    break;

                case 2:


                    System.out.println("You attacked " + enemyPokemon + " with a Shark Bite");
                    enemyHp1 = enemyHp - sharkbite;
                    System.out.println("You attacked " + enemyPokemon + " and dealt " + sharkbite + " damage");
                    if(enemyHp1 < 0){
                        enemyHp1 = 0;
                    }
                    System.out.println("Enemy Hp: " + enemyHp1);
                    enemyHp = enemyHp1;


                    break;


                case 3:



                    System.out.println("You attacked " + enemyPokemon + " with a Claw Punch");
                    enemyHp1 = enemyHp - clawpunch;
                    System.out.println("You have dealt " + clawpunch + " damage to " + enemyPokemon);

                    if(enemyHp1 < 0){
                        enemyHp1 = 0;
                    }

                    System.out.println("Enemy Hp: " + enemyHp1);
                    enemyHp = enemyHp1;


                    break;


                case 4:



                    System.out.println("You attacked " + enemyPokemon + " with a Freezing Wave");
                    enemyHp1 = enemyHp - freezingwave;

                    if(enemyHp1 < 0){
                        enemyHp1 = 0;
                    }

                    System.out.println("You have dealt " + freezingwave + " damage to " + enemyPokemon);
                    System.out.println("Enemy Hp: " + enemyHp1);
                    enemyHp = enemyHp1;


                    break;

                case 5:



                    System.out.println("You attacked " + enemyPokemon + " with a Laser Eye");
                    enemyHp1 = enemyHp - lasereye;

                    if(enemyHp1 < 0){
                        enemyHp1 = 0;
                    }

                    System.out.println("You have dealt " + lasereye + " damage to " + enemyPokemon);
                    System.out.println("Enemy Hp: " + enemyHp1);
                    enemyHp = enemyHp1;

                    break;


            }

            //Randomizing enemy turns
            String attc = att[random.nextInt(att.length)];



            if (attc.equals(att[0])) {
                if(enemyHp<=0) {

                    break;
                }



                System.out.println("-----Enemy turn-----");


                System.out.println(enemyPokemon + " attacked " + yourPokemon + " with a " + attc);

                Hp1 = pokemonHp - fireball;

                System.out.println(enemyPokemon + " dealt to " + yourPokemon + " " + fireball + " damage");
                if(Hp1 <0){
                    Hp1 = 0;
                }
                System.out.println(yourPokemon + " Hp left: " + Hp1);
                pokemonHp = Hp1;


            }
            else if (attc.equals(att[1])) {
                if(enemyHp<=0) {

                    break;
                }


                System.out.println("-----Enemy turn-----");


                System.out.println(enemyPokemon + " attacked " + yourPokemon + " with a " + attc);

                Hp1 = pokemonHp - sharkbite;

                System.out.println(enemyPokemon + " dealt to " + yourPokemon + " " + sharkbite + " damage");
                if(Hp1 <0){
                    Hp1 = 0;
                }
                System.out.println(yourPokemon + " Hp left: " + Hp1);
                pokemonHp = Hp1;



            }
            else if (attc.equals(att[2])) {
                if(enemyHp<=0) {

                    break;
                }


                System.out.println("-----Enemy turn-----");


                System.out.println(enemyPokemon + " attacked " + yourPokemon + " with a " + attc);

                Hp1 = pokemonHp - clawpunch;

                System.out.println(enemyPokemon + " dealt to " + yourPokemon + " " + clawpunch + " damage");
                if(Hp1 <0){
                    Hp1 = 0;
                }
                System.out.println(yourPokemon + " Hp left: " + Hp1);
                pokemonHp = Hp1;




            }
            else if (attc.equals(att[3])) {
                if(enemyHp<=0) {

                    break;
                }



                System.out.println("-----Enemy turn-----");


                System.out.println(enemyPokemon + " attacked " + yourPokemon + " with a " + attc);

                Hp1 = pokemonHp - freezingwave;

                System.out.println(enemyPokemon + " dealt to " + yourPokemon + " " + freezingwave + " damage");
                if(Hp1 <0){
                    Hp1 = 0;
                }
                System.out.println(yourPokemon + " Hp left: " + Hp1);
                pokemonHp = Hp1;




            }
            else if (attc.equals(att[4])) {
                if(enemyHp<=0) {

                    break;
                }


                System.out.println("-----Enemy turn-----");


                System.out.println(enemyPokemon + " attacked " + yourPokemon + " with a " + attc);

                Hp1 = pokemonHp - lasereye;

                System.out.println(enemyPokemon + " dealt to " + yourPokemon + " " + lasereye + " damage");
                if(Hp1 <0){
                    Hp1 = 0;
                }
                System.out.println(yourPokemon + " Hp left: " + Hp1);
                pokemonHp = Hp1;



            }

        }

        //Displaying the winner
        if(enemyHp>pokemonHp && enemyHp>0 && pokemonHp<=0){
            System.out.println(enemyPokemon+" wins against "+yourPokemon);
        }
        else{
            System.out.println(yourPokemon+" wins against "+enemyPokemon);
        }


    }

    }








