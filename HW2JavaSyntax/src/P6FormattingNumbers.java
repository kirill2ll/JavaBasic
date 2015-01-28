import java.util.Scanner;


public class P6FormattingNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//getting the input
		int intNum=scan.nextInt();
		double firstDouble= scan.nextDouble();
		double secondDouble= scan.nextDouble();
		//converting the number intNum
		String hex= Integer.toHexString(intNum);
		String binStr= Integer.toBinaryString(intNum);
		int binInt=Integer.parseInt(binStr);
		//formating the string
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hex, binInt, firstDouble, secondDouble );
		
	}
}
