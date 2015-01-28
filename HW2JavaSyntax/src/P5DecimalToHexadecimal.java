import java.util.Scanner;


public class P5DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int num= scan.nextInt();
		// converting decimal to hexadecimal
		String hex= Integer.toHexString(num);
		System.out.println(hex);
	}
}
