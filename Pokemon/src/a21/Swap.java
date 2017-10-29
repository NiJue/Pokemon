package a21;
import a21.Pokemon;
import a21.Trainer;
import java.util.Date;



public class Swap {
	private Trainer trainerA;	
	private Trainer trainerB;	
	private Pokemon pokemonA;	
	private Pokemon pokemonB;	
	private Date date;	
	private String ID;	
	private static int nextNumber = 0;
	

		// initialization happens in execute()-method
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public Swap(){
		this.date = new Date();
		
		this.ID = Integer.toString(nextNumber);
		nextNumber++;
	}
	
	@Override
	public String toString() {
		return "Swap [trainerA=" + trainerA + ", trainerB=" + trainerB + ", pokemonA=" + pokemonA + ", pokemonB="
				+ pokemonB + ", date=" + date + ", ID=" + ID + "]";
	}

	public void execute(Pokemon pokeA, Pokemon pokeB) throws UnsupportedOperationException {
		if (pokeA.getOwner() != pokeB.getOwner()) {
			if (pokeA.getType() != pokeB.getType()) {
				if (pokeA.isSwapAllow()) {
					if (pokeB.isSwapAllow()) {
						
						this.pokemonA = pokeA;
						this.pokemonB = pokeB;
						
						trainerA = pokeA.getOwner();
						trainerB = pokeB.getOwner();						
						
						pokeA.addSwap(this);
						pokeB.addSwap(this);
						
						trainerA.removeFromTeam(pokeA);
						trainerB.removeFromTeam(pokeB);
						
						trainerA.addToTeam(pokeB);
						trainerB.addToTeam(pokeA);
						
					} else {
						throw new UnsupportedOperationException("Pokemon " + pokeB.getName() + " ist nicht zum Tauschen freigegeben!");
						//System.out.println("Pokemon " + pokeB.getName() + " ist nicht zum Tauschen freigegeben!");
					}
				} else {
					throw new UnsupportedOperationException("Pokemon " + pokeA.getName() + " ist nicht zum Tauschen freigegeben!");
					//System.out.println("Pokemon " + pokeA.getName() + " ist nicht zum Tauschen freigegeben!");
				}
			} else {
				throw new UnsupportedOperationException("Pokemon " + pokeA.getName() + " kann nicht mit " + pokeB.getName() + " getauscht werden, da beide von Typ " + pokeA.getType().name() + " sind");
				//System.out.println("Pokemon " + pokeA.getName() + " kann nicht mit " + pokeB.getName() + " getauscht werden, da beide von Typ " + pokeA.getType().name() + " sind");
			}
	} else {
		throw new UnsupportedOperationException("Same Trainer");
	}
}
}