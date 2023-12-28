import java.util.Scanner;

public class FinanceCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float principal = scan.nextFloat();
		float rate = scan.nextFloat();
		float time = scan.nextFloat();
		FinanceCalculator calculator = new FinanceCalculator();
		System.out.printf("%.2f",calculator.calculateSimpleInterest(principal,rate,time));
		scan.close();

}

}
