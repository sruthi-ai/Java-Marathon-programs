import java.util.Scanner;

public class HalveIt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		System.out.printf("%.2f",halveTheNumber(num));
      scan.close();
	}
	public static double halveTheNumber(Double num){
          return  num/2;

}
}