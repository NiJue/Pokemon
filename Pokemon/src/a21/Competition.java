package a21;

import java.util.Date;

public class Competition extends Swap{
     private Trainer trainerA;
     private Trainer trainerB;
     private Pokemon pokemonA;
     private Pokemon pokemonB;
     private Date date; 	
 	 private String ID;
 	 private static int nextNumber = 0;

 	public Competition(){
		this.date = new Date();
		
		this.ID = Integer.toString(nextNumber);
		nextNumber++;
	}
	 

	public void execute(Pokemon pokeA, Pokemon pokeB) {
		         
				  if (pokeA.getPoint() < pokeB.getPoint()) {
			       System.out.println(pokeB.getOwner()+"wins.");
			       this.pokemonA = pokeA;
				   this.pokemonB = pokeB;
			       trainerA = pokeA.getOwner();
			       trainerB = pokeB.getOwner();
			     
			       pokeA.addComp(this);
			       pokeB.addComp(this);			 
			       trainerA.removeFromTeam(pokeA);
			       trainerB.addToTeam(pokeA);
		            }
				  if (pokeA.getPoint() > pokeB.getPoint()){
		    	   System.out.println(pokeA.getOwner()+"wins.");
		    	   this.pokemonA = pokeA;
		    	   this.pokemonB = pokeB;
		    	   trainerA = pokeA.getOwner();
			       trainerB = pokeB.getOwner();
			     
			       pokeA.addComp(this);
			       pokeB.addComp(this);
			       
				   trainerB.removeFromTeam(pokeB);
				   trainerA.addToTeam(pokeB);
		           }
				  if (pokeA.getPoint() == pokeB.getPoint()){
					System.out.println("same points, no change");
			}
		     
			
	    
		}

	@Override
	public String toString() {
		return "Competition [trainerA=" + trainerA + ", trainerB=" + trainerB + ", pokemonA=" + pokemonA + ", pokemonB="
				+ pokemonB + ", date=" + date + ", ID=" + ID + "]";
	}
	}

		  
	



