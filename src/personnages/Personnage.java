package personnages;

import strategies.ComportementArme;

public abstract class Personnage {
	
	protected String nom;
	protected int score;
	protected ComportementArme comportementArme;
	
	public abstract void combattre();
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ComportementArme getComportementArme() {
		return comportementArme;
	}

	public void setComportementArme(ComportementArme comportementArme) {
		this.comportementArme = comportementArme;
	}

}
