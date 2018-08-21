package oefeningenLeraar;

public class Fiets {

	String staat = "nieuw";
	float prijs = 10.0f;
	String soort = "stadsFiets";
	
	public Fiets (String staat, float prijs, String soort) {
		
		this.staat = staat;
		this.prijs = prijs;
		this.soort = soort;
		
	}
	public Fiets() {
		
	}
	public float getPrice() {
		if(soort.equals("Herenfiets")) {
			if(staat.equals("Nieuw")) {
				this.prijs = 500.0f;
			}
			else if(staat.equals("Tweedehands")) {
				this.prijs = 100.0f;
			}
		}
		else if(soort.equals("Damesfiets")) {
			if(staat.equals("Nieuw")) {
				this.prijs = 400.0f;
			}
			else if(staat.equals("Tweedehands")) {
				this.prijs = 80.0f;
			}
		}
		else if(soort.equals("Mountainbike")) {
			if(staat.equals("Nieuw")) {
				this.prijs = 1000.0f;
			}
			else if(staat.equals("Tweedehands")) {
				this.prijs = 400.0f;
			}
		}
		return prijs;
	}
}
