package nation;

import java.util.ArrayList;
import java.util.Random;

import city.City;
import city.Country;

public class England implements Country {

    private static final int MIN_TEMPERATURE  = -10;
    private static final int MAX_TEMPERATURE  = 25;

    ArrayList<City> citiesArrayList;

    City[] cities;

    public England() {
        citiesArrayList = new ArrayList<>();
        Random rd = new Random();
        citiesArrayList.add(new City(MIN_TEMPERATURE + rd.nextInt(MAX_TEMPERATURE - MIN_TEMPERATURE + 1), "Lon Don"));
        citiesArrayList.add(new City(MIN_TEMPERATURE + rd.nextInt(MAX_TEMPERATURE - MIN_TEMPERATURE + 1), "Manchester"));
    }

    @Override
    public void printHello() {
        System.err.println("Welcome to the UK...");
        System.out.println("The City you want to visit is : ");
    }

    @Override
    public String getName() {
        return "England";
    }

    @Override
    public int getMinTemperature() {
        return 0;
    }

    @Override
    public String getTemperature() {
        return "The getTemperature is now ";
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
        return "You entered wrong! \n Please enter the following requirements:";
    }

    @Override
    public String getPoint() {
        return "thank you";

    }

    @Override
    public String welcomeToCity() {
        // TODO Auto-generated method stub
        return "You are in the City  ";
    }

    @Override
    public String comment() {
        // TODO Auto-generated method stub
        return "You can rate your City from 1 to 100 points: ";

    }

    @Override
    public String sayWell() {
        // TODO Auto-generated method stub
        return "Thank you";
    }

    @Override
    public String sayFine() {
        // TODO Auto-generated method stub
        return "We will try harder";
    }

    @Override
    public String unplease() {
        // TODO Auto-generated method stub
        return "Sorry for making you unhappy";
    }

    @Override
    public String isSpecial() {
        // TODO Auto-generated method stub
        return "international standards";
    }

    @Override
    public String evaluate() {
        return "You can rate your City from 1 to 100 points: ";
    }

    @Override
    public String bye() {
        // TODO Auto-generated method stub
        return "sayWell bye and see you again";
    }


}
