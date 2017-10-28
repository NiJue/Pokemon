package a21;

import java.util.ArrayList;

import a21.Pokemon;
import a21.Type;

public class Trainer {
	
	private String firstname;
	
	private String lastname;
	
	//private Pokemon pokemon;	
	
	private ArrayList<Pokemon> pokeTeam;

	/**
	 * @param firstname
	 * @param lastname
	 * @param pokemon
	 */
	public Trainer(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		//this.pokemon = pokemon;
		this.pokeTeam = new ArrayList<Pokemon>();
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the pokemon
	 */
//	public Pokemon getPokemon() {
//		return pokemon;
//	}

	/**
	 * @param pokemon the pokemon to set
	 */
//	public void setPokemon(Pokemon pokemon) {
//		this.pokemon = pokemon;
//	}
	
	/**
	 * Teilaufgabe: "Neue Pokemon zu einem Trainer hinzuf¨¹gen"
	 * @param pokemon
	 */	
	public void addToTeam(Pokemon pokemon) {
		if (pokemon.getOwner() == null) {
			this.pokeTeam.add(pokemon);
			pokemon.setOwner(this);
		} else {
			System.out.println(pokemon.getName() + " already belongs to another trainer!");
		}	
		
	}
	
	public boolean removeFromTeam(Pokemon pokemon) {
		pokemon.setOwner(null);
		return pokeTeam.remove(pokemon);
	}
	
	/**
	 * Teilaufgabe: "Abfrage von einzelnen Pokemons ¨¹ber den Trainer" 
	 * @param index
	 * @return
	 */
	public Pokemon getPoke(int index) {
		return pokeTeam.get(index);
	}
	
	public ArrayList<Pokemon> getTeam() {
		return pokeTeam;
	}
	
	/**
	 * Teilaufgabe: "Abfrage aller Pokemons von Type Poison"
	 * @param type
	 * @return
	 */
	public ArrayList<Pokemon> getByType(Type type) {
		ArrayList<Pokemon> filteredPokes = new ArrayList<Pokemon>();
		for (Pokemon p: pokeTeam) {
			if (p.getType() == type) {
				filteredPokes.add(p);
			}
		}
		return filteredPokes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trainer [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	public static void main(String[] args) {
		Pokemon pikachu;
		Trainer frank;
		Trainer peter;

		pikachu = new Pokemon("pika", Type.POISON);
		Pokemon squirtle = new Pokemon("waterboiiii", Type.WATER);
		Pokemon ratatat = new Pokemon("ratte", Type.POISON);
		frank = new Trainer("Frank", "Kowalski");
		peter = new Trainer("Peter", "Mueller");
			
		frank.addToTeam(pikachu);
		frank.addToTeam(squirtle);
		frank.addToTeam(ratatat);
		System.out.println(frank.getByType(Type.POISON).toString());
		peter.addToTeam(pikachu);
		
		
	}

}
