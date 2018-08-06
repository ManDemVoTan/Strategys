package nation;
import java.util.ArrayList;
import java.util.Random;

import city.Country;
import city.city;

public class Germany implements Country {
	int min = 5, max = 25;
	ArrayList<city> citiesArrayList;

	public Germany() {
		citiesArrayList = new ArrayList<>();
		Random rd = new Random();
		citiesArrayList.add(new city(min + rd.nextInt(max - min + 1), "Hamburg"));
		citiesArrayList.add(new city(min + rd.nextInt(max - min + 1), "Berlin"));
		citiesArrayList.add(new city(min + rd.nextInt(max - min + 1), "Frankfurt"));
	}

	@Override
	public void printHello() {
		System.err.println(" Willkommen in der Bundesrepublik Deutschland: ");
		System.out.println("Die Stadt, die Sie besuchen möchten, ist");
	}

	@Override
	public String getName() {
		return "Germany";
	}

	@Override
	public int getTMin() {
		return 0;
	}

	@Override
	public int getTMax() {
		return 0;
	}

	@Override
	public ArrayList<city> getArr() {
		return citiesArrayList;
	}

	@Override
	public String geterro() {
		return "Du hast falsch eingegeben! \n Bitte geben Sie folgende Voraussetzungen ein:";
	}

	@Override
	public String getDiem() {
		return "Danke";

	}

	@Override
	public String temperature() {
		return "Die Temperatur ist jetzt ";
	}

	@Override
	public String citys() {
		// TODO Auto-generated method stub
		return "Sie sind in der Stadt ";
	}

	@Override
	public String commet() {
		// TODO Auto-generated method stub

		return "Bitte geben Sie uns Ihre Punktzahl für die Stadt in der Sie leben! Punkte reichen von 1 bis 100: ";
	}

	@Override
	public String good() {
		// TODO Auto-generated method stub
		return "Willkommen beim nächsten Mal";
	}

	@Override
	public String fine() {
		// TODO Auto-generated method stub
		return "Wir werden es härter versuchen";
	}

	@Override
	public String unpleased() {
		// TODO Auto-generated method stub
		return "Es tut mir leid, dich unglücklich zu machen";
	}

	@Override
	public String Special() {
		// TODO Auto-generated method stub
		return "Internationale Standards";
	}

	@Override
	public String Evaluate() {
		// TODO Auto-generated method stub
		return "Bitte ordnen Sie Ihrer Stadt 1 bis 100 Punkte zu :";
	}
	public String Bye() {
		// TODO Auto-generated method stub
		return "Auf Wiedersehen und bis bald";
	}

}
