
public class LightSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double LIGHT_SPEED = 30e4;
		final long YEAR_SEC = 365*24*60*60;
		
		double distance = 40e12;
		double sec;
		double light_year;
		
		sec = distance/LIGHT_SPEED;
		light_year = sec/YEAR_SEC;
		
		System.out.println("걸리는 시간은 "+light_year + "광년입니다.");
	}

}
