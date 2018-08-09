package city;
import java.util.ArrayList;

public interface Country {
    void printHello();
    String getName();
    int getMinTemperature();
    int getMaxTemperature();
    ArrayList<City> getArr();
    String getError();
    String getPoint();
    String welcomeToCity();
    public String comment();
	String sayWell();
	String sayFine();
	String unplease();
	String isSpecial();
	String getTemperature();
	String evaluate();
	String bye();
	
    
}
