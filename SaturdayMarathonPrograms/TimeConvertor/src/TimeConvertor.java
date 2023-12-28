import java.util.Scanner;

public class TimeConvertor {

	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				int minutes = scan.nextInt();
				System.out.printf("%.1f",convertToHours(minutes));
				scan.close();
				}
	public static double convertToHours(int minutes) {
					return minutes/60.0;
				}
}
