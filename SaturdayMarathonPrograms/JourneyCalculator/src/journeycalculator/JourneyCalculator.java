package journeycalculator;

public class JourneyCalculator {
public static void main(String[] args) {
	JourneyCalculator JourneyCalculator = new JourneyCalculator();
	System.out.println(JourneyCalculator.calculateDistance(60.0,1.5));
		}
	public double calculateDistance(double speed, double time) {
		return speed*time;

	}
	

}
