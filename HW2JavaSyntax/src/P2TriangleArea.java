
import java.util.Scanner;


public class P2TriangleArea {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		// getting the input
		int aX=scan.nextInt();
		int aY=scan.nextInt();
		int bX=scan.nextInt();
		int bY=scan.nextInt();
		int cX=scan.nextInt();
		int cY=scan.nextInt();
		//finding the area by formula
		int area =Math.abs((aX*(bY-cY)+ bX*(cY-aY)+cX*(aY-bY))/2);
		System.out.println(area);


	}
}
