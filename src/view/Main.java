package view;

import java.util.Scanner;

import city.Country;
import nation.England;
import nation.Germany;
import nation.Vietnam;

public class Main {
    private static Country vietnam, england, germany, country = null;
    private static Scanner sc = new Scanner(System.in);

    private static void init() {
        vietnam = new Vietnam();
        england = new England();
        germany = new Germany();
    }

    private static int getScanInt(Country country) {
        try {
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        } catch (Exception e) {
            System.out.println(country.getError());
            return getScanInt(country);
        }

    }

    private static int getCountryPoint(Country country) {
        try {
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        } catch (Exception e) {
            System.out.println(country.getError());
            return getCountryPoint(country);
        }
    }

    private static void executePoint() {
        int i = getCountryPoint(country);
        if (i < 50) {
            System.out.println(country.unplease());
        } else if (i <= 80) {
            System.out.println(country.sayFine());
        } else if (i < 100) {
            System.out.println(country.sayWell());
        } else {
            System.out.println(country.isSpecial());
        }

    }

    private static void changeLanguage() {
        System.out.println("1." + vietnam.getName());
        System.out.println("2." + england.getName());
        System.out.println("3." + germany.getName());
        switch (sc.nextInt()) {
            case 1:
                country = vietnam;
                break;
            case 2:
                country = england;
                break;
            case 3:
                country = germany;
                break;
        }
    }

    private static void changeCity() {
        country.printHello();

        for (int i = 0; i < country.getArr().size(); i++) {
            System.out.println((i + 1) + ". " + country.getArr().get(i).name);
        }
        int j = getScanInt(country);
        System.out.println(country.welcomeToCity() + country.getArr().get(j - 1).name + country.getTemperature()
                + country.getArr().get(j - 1).t + " *c");
        System.out.println(country.evaluate());


    }

    private static void bye() {
        System.out.println();
        System.err.println(country.bye());
    }


    public static void main(String[] args) {
        init();
        changeLanguage();
        changeCity();
        executePoint();
        bye();

    }

}
