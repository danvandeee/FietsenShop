package oefeningenLeraar;
import java.util.Scanner;
public class Fietsenshop {

	public static void main(String[] args) {
		Fietsenshop shoppie = new Fietsenshop();
		System.out.println("Welkom bij de D&D fietsenshop! Voer het nummer van de optie in en wij regelen de rest!");
		Fiets gekozen = shoppie.fietsKeuze();
		System.out.println("De "+ gekozen.soort +" in de staat " + gekozen.staat + " kost " + gekozen.getPrice() + ".");

	}
	public Fiets fietsKeuze() {
		Fiets fiets = new Fiets();
		Scanner input = new Scanner(System.in);
		System.out.println("Wat komt u doen?");
		System.out.println("1. Fiets kopen");
		System.out.println("2. Fiets Repareren");
		int sc_input = input.nextInt();
		if(sc_input == 1) {
			System.out.println("Wat voor fiets zoekt u?");
			System.out.println("1. Nieuw");
			System.out.println("2. Tweedehands");
			int sc_input2 = input.nextInt();
			if(sc_input2 == 1) {
				fiets.staat = "Nieuw";
			}
			else if(sc_input2 == 2) {
				fiets.staat = "Tweedehands";
			}
			System.out.println("Wat voor soort fiets zoekt u?");
			System.out.println("1. Herenfiets");
			System.out.println("2. Damesfiets");
			System.out.println("3. Mountainbike");
			int sc_input3 = input.nextInt();
			if(sc_input3 == 1) {
				fiets.soort = "Herenfiets";
			}
			else if(sc_input3 == 2) {
				fiets.soort = "Damesfiets";
			}
			else if(sc_input3 == 3) {
				fiets.soort = "Mountainbike";
			}
		

	}
		else if(sc_input == 2) {
			System.out.println("Deze service is helaas niet beschikbaar op dit moment. Kom later alstublieft.");
		}
		return fiets;
		}
	

}
