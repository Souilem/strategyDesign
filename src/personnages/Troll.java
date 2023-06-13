package personnages;

import strategies.ComportementPoignard;

public class Troll extends Personnage {

	public Troll() {
		this.comportementArme = new ComportementPoignard();
	}
	
	@Override
	public void combattre() {
		score+=1;
		System.out.println("je suis le troll...");
		this.comportementArme.utiliserArme();
		System.out.println("Score : " + score);
	}

}
