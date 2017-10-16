package test002;
import java.util.Scanner;
public class Tesr002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input Number > ");
		int n = Integer.parseInt(scan.next());
		System.out.println("Number = "+n);
		
		System.out.println("Input RealNumber > ");
		double m = Double.parseDouble(scan.next());
		System.out.println("RealNumber = "+m);
		
		scan.close();
	}

}
