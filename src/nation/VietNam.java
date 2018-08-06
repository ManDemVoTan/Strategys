package nation;
import java.util.ArrayList;
import java.util.Random;

import city.Country;
import city.city;

public class VietNam implements Country {
	ArrayList<city> citiesArrayList;

	public VietNam() {
		citiesArrayList = new ArrayList<>();
		int min = 10, max = 40;
		Random rd = new Random();
		citiesArrayList.add(new city(min + rd.nextInt(max - min + 1), "Hà Nội"));
		citiesArrayList.add(new city(min + rd.nextInt(max - min + 1), "Đà Nẵng"));
		citiesArrayList.add(new city(min + rd.nextInt(max - min + 1), "Sài Gòn"));
		citiesArrayList.add(new city(min + rd.nextInt(max - min + 1), "Hải Phòng"));

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
		return "Bạn Nhập sai rồi ! \n xin mời nhập đúng theo yêu cầu : ";
	}

	@Override
	public String getDiem() {
		return "xin cảm ơn !";
	}

	@Override
	public String citys() {
		// TODO Auto-generated method stub
		return "Bạn Đang Đến Thành Phố  ";
	}

	@Override
	public String commet() {
		// TODO Auto-generated method stub
		return "Xin mời bạn cho số điểm của thành phố bạn đang sống ! thang điểm từ 1 đên 100 :";
	}

	@Override
	public String temperature() {
		return "Nhiệt Độ Ở Đây bây giờ là  ";
	}

	@Override
	public String good() {
		// TODO Auto-generated method stub
		return "xin chào và hẹn gặp lại";
	}

	@Override
	public String fine() {
		// TODO Auto-generated method stub
		return "Chúng tôi sẽ cố gắng hơn nữa";
	}

	@Override
	public String unpleased() {
		// TODO Auto-generated method stub
		return "Xin lỗi vì đã làm bạn không hài lòng";
	}

	@Override
	public String Special() {
		// TODO Auto-generated method stub
		return "Đạt chuẩn quốc tế";
	}

	@Override
	public String Evaluate() {
		// TODO Auto-generated method stub
		return "Bạn có thể xếp hạng thành phố của bạn từ 1 đến 100 điểm : ";
	}
	public String Bye() {
		// TODO Auto-generated method stub
		return "Xin chào ! hẹn gặp lại....";
	}

}
