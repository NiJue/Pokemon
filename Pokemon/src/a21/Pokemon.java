package a21;

import java.util.ArrayList;

import a21.Type;

/**
 * 
 * @author Rasmus Hansen <r.hansen@stud.uni-heidelberg.de>
 * 
 *
 */

public class Pokemon {
	
	private String name;
	
	private Type type;
	
	private static int nextNumber = 0;
	
	private int number;
		
	private Trainer owner;
	
	private boolean swapAllow;
	
	private ArrayList<Swap> swaps;
	
	/**
	 * @return the owner
	 */
	public Trainer getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Trainer owner) {
		this.owner = owner;
	}

	public Pokemon(String name, Type type) {
		
		this.name = name;
		this.type = type;
		number = nextNumber;
		nextNumber = nextNumber + 1;
		swaps = new ArrayList<Swap>();
		swapAllow = true;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
		
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the swapAllow
	 */
	public boolean isSwapAllow() {
		return swapAllow;
	}

	/**
	 * @param swapAllow the swapAllow to set
	 */
	public void setSwapAllow(boolean swapAllow) {
		this.swapAllow = swapAllow;
	}
	
	public void addSwap(Swap swap) {
		swaps.add(swap);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", type=" + type + ", number=" + number + "]";
	}

	public static void main(String[] args) {
		Pokemon squirtle;
		Pokemon charmander;
		squirtle = new Pokemon("squirtle", Type.WATER);
		charmander = new Pokemon("charmander", Type.FIRE);
		System.out.println(squirtle.toString());
		System.out.println(charmander.toString());

	}

}
