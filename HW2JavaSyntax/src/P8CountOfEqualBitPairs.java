import java.util.Scanner;


public class P8CountOfEqualBitPairs {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		//getting the input
		int num= scan.nextInt();
		//calling the method
		int numOfPairs= findBitPairs(num);
		//output
		System.out.println(numOfPairs);
		
	}
	//method for counting the bit Pairs
	public static int findBitPairs(int num){
		int count=0;
		int lastOneBit=0;
		//finding the last 1 bit from left example: 0000100000001
		for (int i = 32; i >=1; i--) {
			int bitOne=findTheBit(num,i);
			if(bitOne==1){
				//position of the Last 1 Bit
				lastOneBit=i;
				break;
			}
		}
		//finding the pairs
		for (int i = 1; i < lastOneBit; i++) {
			int currentBit = findTheBit(num, i);
			int nextBit = findTheBit(num, i+1);
			if(currentBit == nextBit){
				count++;
			}
		}
		return count;
	}
	//method that returns a bit 1 or 0
	public static int findTheBit (int num, int position){
		int bit=0;
		int one= 1<<(position-1);
		bit= num & one;
		if(bit>0){
			bit=1;
		}else{
			bit=0;
		}
		return bit;
	}
}
