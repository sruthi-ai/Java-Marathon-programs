package journeycalculator;

import java.util.Scanner;

public class JourneyCal {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter speed,time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator JourneyCalculator=new JourneyCalculator();
		System.out.println(JourneyCalculator.calculateDistance(speed,time));
		scan.close();
}
	public double calculateDistance(double speed, double time) {
	       return speed*time;

}
	
}
