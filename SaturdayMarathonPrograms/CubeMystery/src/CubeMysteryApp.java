import java.util.Scanner;

public class CubeMysteryApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number");
		int num = scan.nextInt();
		System.out.println(CubeMystery.cubeNumber(num));
		scan.close();
		}

}
