package arithmeticOperations;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int res1=subtractNumbers(20, 5);
			int res2=multiplyNumbers(4, 5);
			double res3=divideNumbers(20, 4);
			int res4=findRemainder(10, 3);
			System.out.println(res1);
			System.out.println(res2);
			System.out.println(res3);
			System.out.println(res4);
			scan.close();
			}
		public static int subtractNumbers(int num1, int num2)

		{

		return num1-num2;

		}

		public static int multiplyNumbers(int num1, int num2)

		{

		return num1*num2;

		}

		public static double divideNumbers(int num1, int num2)

		{

		return num1/num2;

		}

		public static int findRemainder(int num1, int num2)

		{

		return num1%num2;

		}
}
