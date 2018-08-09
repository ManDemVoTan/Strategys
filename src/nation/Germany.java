package nation;
import java.util.ArrayList;
import java.util.Random;

import city.Country;
import city.City;

public class Germany implements Country {
	int min = 5, max = 25;
	ArrayList<City> citiesArrayList;

	public Germany() {
		citiesArrayList = new ArrayList<>();
		Random rd = new Random();
		citiesArrayList.add(new City(min + rd.nextInt(max - min + 1), "Hamburg"));
		citiesArrayList.add(new City(min + rd.nextInt(max - min + 1), "Berlin"));
		citiesArrayList.add(new City(min + rd.nextInt(max - min + 1), "Frankfurt"));
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
	public int getMinTemperature() {
		return 0;
	}

	@Override
	public int getMaxTemperature() {
		return 0;
	}

	@Override
	public ArrayList<City> getArr() {
		return citiesArrayList;
	}

	@Override
	public String getError() {
		return "Du hast falsch eingegeben! \n Bitte geben Sie folgende Voraussetzungen ein:";
	}

	@Override
	public String getPoint() {
		return "Danke";

	}

	@Override
	public String getTemperature() {
		return "Die Temperatur ist jetzt ";
	}

	@Override
	public String welcomeToCity() {
		// TODO Auto-generated method stub
		return "Sie sind in der Stadt ";
	}

	@Override
	public String comment() {
		// TODO Auto-generated method stub

		return "Bitte geben Sie uns Ihre Punktzahl für die Stadt in der Sie leben! Punkte reichen von 1 bis 100: ";
	}

	@Override
	public String sayWell() {
		// TODO Auto-generated method stub
		return "Willkommen beim nächsten Mal";
	}

	@Override
	public String sayFine() {
		// TODO Auto-generated method stub
		return "Wir werden es härter versuchen";
	}

	@Override
	public String unplease() {
		// TODO Auto-generated method stub
		return "Es tut mir leid, dich unglücklich zu machen";
	}

	@Override
	public String isSpecial() {
		// TODO Auto-generated method stub
		return "Internationale Standards";
	}

	@Override
	public String evaluate() {
		// TODO Auto-generated method stub
		return "Bitte ordnen Sie Ihrer Stadt 1 bis 100 Punkte zu :";
	}
	public String bye() {
		// TODO Auto-generated method stub
		return "Auf Wiedersehen und bis bald";
	}

}
