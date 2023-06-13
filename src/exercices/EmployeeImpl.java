package exercices;

public class EmployeeImpl implements IEmployee {
	

	public String getCin() {
		return cin;
	}


	public void setCin(String cin) {
		this.cin = cin;
	}


	public Float getSalaireBrutMensuel() {
		return salaireBrutMensuel;
	}


	public void setSalaireBrutMensuel(Float salaireBrutMensuel) {
		this.salaireBrutMensuel = salaireBrutMensuel;
	}


	private String cin;
	private Float salaireBrutMensuel;
	
	

	@Override
	public Float calculerIgr() {
		
		float salaireBrulAnnuel = salaireBrutMensuel * 12;
		float taux = 0;
		
		if(salaireBrulAnnuel < 400000) {
			 taux=5f;
			System.out.println("taux : "+taux);
		}else if(salaireBrulAnnuel > 40000 && salaireBrulAnnuel < 120000) {
			 taux=20f;
			System.out.println("taux : "+taux);
		} else if(salaireBrulAnnuel > 120000) {
			 taux=42f;
			System.out.println("taux : "+taux);
		}
		
		return salaireBrulAnnuel * taux / 12;
	}
	

	@Override
	public Float getSalaireNetMensuel() {
		float igr = calculerIgr();
		float salaireNetAnnuel = salaireBrutMensuel * 12 - igr;
		return salaireNetAnnuel/12;
	}


}
