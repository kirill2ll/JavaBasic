import java.util.Locale;
import java.util.Scanner;


public class P3PointsInsideFigure {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		//getting the input
		Scanner scan = new Scanner (System.in);
		double pointX= scan.nextDouble();
		double pointY= scan.nextDouble();
		
		boolean insideBigSquare = false;
		boolean insideSmallSquareOfBig= false;
		//checking if the point is inside the big square
		if( (pointX>=12.5 && pointX<=22.5) && (pointY>=6 && pointY <=13.5) ){
			insideBigSquare=true;
			//checking if the point is inside the small square
			if ((pointX> 17.5 && pointX<20)&& (pointY>8.5 && pointY<13.5)){
				insideSmallSquareOfBig=true;
			}
		}
		// output
		if (insideBigSquare && !insideSmallSquareOfBig){
			System.out.println("Inside");
		}else{
			System.out.println("Outside");
		}
	}
}
