import java.util.Scanner;


public class P4SmallestOf3Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] arr = new double[3];
		double min = Double.MAX_VALUE;
		
		//loop to find the smallest number
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextDouble();
			if (arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
