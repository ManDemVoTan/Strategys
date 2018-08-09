package nation;
import java.util.ArrayList;
import java.util.Random;

import city.City;
import city.Country;

public class Vietnam implements Country {
	ArrayList<City> cities;

	public Vietnam() {
		cities = new ArrayList<>();
		int min = 10, max = 40;
		Random rd = new Random();
		cities.add(new City(min + rd.nextInt(max - min + 1), "Hà Nội"));
		cities.add(new City(min + rd.nextInt(max - min + 1), "Đà Nẵng"));
		cities.add(new City(min + rd.nextInt(max - min + 1), "Sài Gòn"));
		cities.add(new City(min + rd.nextInt(max - min + 1), "Hải Phòng"));

	}

	@Override
	public void printHello() {
		System.err.println("Xin Chào! bạn đến với Việt Nam ...");
		System.out.println("Thành phố mà bạn muốn đến là :  ");
	}

	@Override
	public String getName() {
		return "Viet Nam";
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
		return cities;
	}

	@Override
	public String getError() {
		return "Bạn Nhập sai rồi ! \n xin mời nhập đúng theo yêu cầu : ";
	}

	@Override
	public String getPoint() {
		return "xin cảm ơn !";
	}

	@Override
	public String welcomeToCity() {
		// TODO Auto-generated method stub
		return "Bạn Đang Đến Thành Phố  ";
	}

	@Override
	public String comment() {
		// TODO Auto-generated method stub
		return "Xin mời bạn cho số điểm của thành phố bạn đang sống ! thang điểm từ 1 đên 100 :";
	}

	@Override
	public String getTemperature() {
		return "Nhiệt Độ Ở Đây bây giờ là  ";
	}

	@Override
	public String sayWell() {
		// TODO Auto-generated method stub
		return "xin chào và hẹn gặp lại";
	}

	@Override
	public String sayFine() {
		// TODO Auto-generated method stub
		return "Chúng tôi sẽ cố gắng hơn nữa";
	}

	@Override
	public String unplease() {
		// TODO Auto-generated method stub
		return "Xin lỗi vì đã làm bạn không hài lòng";
	}

	@Override
	public String isSpecial() {
		// TODO Auto-generated method stub
		return "Đạt chuẩn quốc tế";
	}

	@Override
	public String evaluate() {
		// TODO Auto-generated method stub
		return "Bạn có thể xếp hạng thành phố của bạn từ 1 đến 100 điểm : ";
	}
	public String bye() {
		// TODO Auto-generated method stub
		return "Xin chào ! hẹn gặp lại....";
	}

}
