package view;
import java.util.Scanner;

import city.Country;
import nation.England;
import nation.Germany;
import nation.VietNam;

public class Main {
	Country viet, anh, duc, country = null;
	Scanner sc;

	public void init() {
		sc = new Scanner(System.in);
		viet = (VietNam) new VietNam();
		anh = (England) new England();
		duc = (Germany) new Germany();
	}

	public int getScanInt(Country country) {
		try {
			Scanner sc = new Scanner(System.in);
			int string = sc.nextInt();
			return string;
		} catch (Exception e) {
			System.out.println(country.geterro());
			return getScanInt(country);
		}

	}

	public int getDiem(Country country) {
		try {
			Scanner sc = new Scanner(System.in);
			int score = sc.nextInt();
			return score;
		} catch (Exception e) {
			System.out.println(country.geterro());
			return getDiem(country);
		}
	}

	public void excuteDiem() {
		int i = getDiem(country);
		if (i < 50) {
			System.out.println(country.unpleased());
		} else if (50 <= i && i <= 80) {
			System.out.println(country.fine());
		} else if (i > 80 && i < 100) {
			System.out.println( country.good());
		} else {
			System.out.println(country.Special());
		}
		
	}

	public void changeLangue() {
		System.out.println("1." + viet.getName());
		System.out.println("2." + anh.getName());
		System.out.println("3." + duc.getName());
		switch (sc.nextInt()) {
		case 1:
			country = viet;
			break;
		case 2:
			country = anh;
			break;
		case 3:
			country = duc;
			break;
		}
	}

	public void changeCity() {
		country.printHello();

		for (int i = 0; i < country.getArr().size(); i++) {
			System.out.println((i + 1) + ". " + country.getArr().get(i).name);
		}
		int j = new Main().getScanInt(country);
		System.out.println(country.citys() + country.getArr().get(j - 1).name + country.temperature()
				+ country.getArr().get(j - 1).t + " *c");
		System.out.println(country.Evaluate());
	
		
	}
	public void bye(){
		System.out.println();
		System.err.println(country.Bye());
	}
	

	public static void main(String[] args) {
		Main m;
		m = new Main();
		m.init();
		m.changeLangue();
		m.changeCity();
		m.excuteDiem();
		m.bye();
		
	}

}
