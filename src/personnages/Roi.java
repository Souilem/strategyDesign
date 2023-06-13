package personnages;


import strategies.ComportementHache;

public class Roi extends Personnage{
	
	public Roi() {
		this.comportementArme = new ComportementHache();
	}
	
	@Override
	public void combattre() {
		score+=2;
		System.out.println("je suis le roi...");
		this.comportementArme.utiliserArme();
		System.out.println("Score : " + score);
	}

}
