import java.util.Scanner;

public class PowerSquareApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(PowerSq.squareNumber(num));
		scan.close();

	}

}
