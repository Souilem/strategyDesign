package personnages;

import strategies.ComportementArcEtFleche;
import strategies.ComportementHache;

public class Reine extends Personnage {
	
	public Reine() {
		this.comportementArme = new ComportementArcEtFleche();
	}

	@Override
	public void combattre() {
		score+=4;
		System.out.println("je suis une reine...");
		this.comportementArme.utiliserArme();
		System.out.println("Score : " + score);
		if(score>15) {
			this.setComportementArme(new ComportementHache());
		}
	}

}
