/**
 * 
 */
package a21;

import a21.Pokemon;
import a21.Trainer;
import a21.Type;

/**
 * @author Rasmus Hansen <r.hansen@stud.uni-heidelberg.de>
 *
 */
public class PokemonManager {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to the PokeArena!\n");
		Trainer frank = new Trainer("Frank", "Mueller");
		System.out.println("In the blue corner is the current champion: " + frank.toString());
		Trainer daniela = new Trainer("Daniela", "Kilian");
		System.out.println("In the red corner is the contender: " + daniela.toString() + '\n');

		System.out.println("The following Pokemon are available: ");

		Pokemon bulbasaur = new Pokemon("Bulbasaur", Type.POISON);
		System.out.println(bulbasaur.toString());
		Pokemon ivysaur = new Pokemon("Ivysaur", Type.POISON);
		System.out.println(ivysaur.toString());
		Pokemon venusaur = new Pokemon("Venusaur", Type.POISON);
		System.out.println(venusaur.toString());
		Pokemon charmander = new Pokemon("Charmander", Type.FIRE);
		System.out.println(charmander.toString());
		Pokemon charmeleon = new Pokemon("Charmeleon", Type.FIRE);
		System.out.println(charmeleon.toString());
		Pokemon charizard = new Pokemon("Charizard", Type.FIRE);
		System.out.println(charizard.toString());
		Pokemon squirtle = new Pokemon("Squirtle", Type.WATER);
		System.out.println(squirtle.toString());
		Pokemon wartortle = new Pokemon("Wartortle", Type.WATER);
		System.out.println(wartortle.toString());
		Pokemon blastoise = new Pokemon("Blastoise", Type.WATER);
		System.out.println(blastoise.toString());
		
		System.out.println("Let the hunt begin!\n");
		frank.addToTeam(bulbasaur);
		System.out.println("Frank catches " + frank.getPoke(0).toString());
		frank.addToTeam(ivysaur);
		System.out.println("Frank catches " + frank.getPoke(1).toString());
		frank.addToTeam(charmander);
		System.out.println("Frank catches " + frank.getPoke(2).toString());
		frank.addToTeam(blastoise);
		System.out.println("Frank catches " + frank.getPoke(3).toString() + '\n');
		
		daniela.addToTeam(wartortle);
		System.out.println("Daniela catches " + daniela.getPoke(0).toString());
		daniela.addToTeam(squirtle);
		System.out.println("Daniela catches " + daniela.getPoke(1).toString());
		daniela.addToTeam(venusaur);
		System.out.println("Daniela catches " + daniela.getPoke(2).toString());
		daniela.addToTeam(charmeleon);
		System.out.println("Daniela catches " + daniela.getPoke(3).toString());
		daniela.addToTeam(charizard);
		System.out.println("Daniela catches " + daniela.getPoke(4).toString() + '\n');
		
		System.out.println("Summary of the battle:\n");
		
		System.out.println("Frank caught: " + frank.getTeam().toString());
		System.out.println("Overall #" + frank.getTeam().size() + " Pokemon.\n");
		
		System.out.println("Daniela caught: " + daniela.getTeam().toString());
		System.out.println("Overall #" + daniela.getTeam().size() + " Pokemon.");
		
		System.out.println("Does this mean, that Daniela won?\n");
		
		System.out.println("No, because Frank caught " + frank.getByType(Type.POISON).size() + " Poison-Type Pokemon");
		System.out.println("Daniela only caught " + daniela.getByType(Type.POISON).size() + " Poison-Type Pokemon");

		System.out.println("And Poison always wins!\nEnd of Battle.");
		
		
		Swap swap = new Swap();
		System.out.println(squirtle.getOwner().toString());

		System.out.println(swap.toString());
		try {			
			swap.execute(squirtle, charmander);		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(swap.toString());
		System.out.println(squirtle.getOwner().toString());


	}

}
