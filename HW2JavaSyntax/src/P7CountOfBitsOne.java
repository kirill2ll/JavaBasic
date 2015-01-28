import java.util.Scanner;


public class P7CountOfBitsOne {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//getting the number
		int num = scan.nextInt();
		//calling the method countOneBit
		int numberOfOneBits= countOneBit(num);
		System.out.println(numberOfOneBits);
	}
	//method for counting a number of bit 1
	 static int countOneBit (int num){
		int count = 0;
		for (int i = 0; i < 16; i++) {
			int foundedOne= num & 1;
			num=num>>1;
			if (foundedOne >0){
				count++;
			}
		}
		return count;
	}
}
