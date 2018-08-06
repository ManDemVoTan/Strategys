package nation;
import java.util.ArrayList;
import java.util.Random;

import city.Country;
import city.city;

public class England implements Country  {
    int min=-10,max=25;
    ArrayList<city> citiesArrayList;
    city[] cities;
    public England(){
        citiesArrayList = new ArrayList<>();
        Random rd = new Random();
        citiesArrayList.add(new city(min + rd.nextInt(max-min+1),"Lon Don"));
        citiesArrayList.add(new city(min + rd.nextInt(max-min+1),"Manchester"));
    }
    @Override
    public void printHello() {
    	System.err.println("Welcome to the UK...");
		System.out.println("The city you want to visit is : ");
    }

    @Override
    public String getName() {
        return "England";
    }

    @Override
    public int getTMin() {
        return 0;
    }
    @Override
	public String temperature() {
		return "The temperature is now ";
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
        return "You entered wrong! \n Please enter the following requirements:";
    }

    @Override
    public String getDiem() {
    	return "thank you";
        
    }
	@Override
	public String citys() {
		// TODO Auto-generated method stub
		return "You are in the City  ";
	}
	@Override
	public String commet() {
		// TODO Auto-generated method stub
		return "You can rate your city from 1 to 100 points: ";
		
	}
	@Override
	public String good() {
		// TODO Auto-generated method stub
		return "Thank you";
	}
	@Override
	public String fine() {
		// TODO Auto-generated method stub
		return "We will try harder";
	}
	@Override
	public String unpleased() {
		// TODO Auto-generated method stub
		return "Sorry for making you unhappy";
	}
	@Override
	public String Special() {
		// TODO Auto-generated method stub
		return "international standards";
	}
	@Override
	public String Evaluate() {
		return "You can rate your city from 1 to 100 points: ";
	}
	@Override
	public String Bye() {
		// TODO Auto-generated method stub
		return "good bye and see you again";
	}


}
