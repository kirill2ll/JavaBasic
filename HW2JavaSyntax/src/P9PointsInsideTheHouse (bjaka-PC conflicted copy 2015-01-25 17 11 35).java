.jobs.Worker.run(Worker.java:54)
Worker.java:54)
import java.util.Locale;
import java.util.Scanner;

public class P9PointsInsideTheHouse {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		//getting the input
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		double pointX= scan.nextDouble();
		double pointY= scan.nextDouble();
		
		//entering point of the house
		// roof
		double topOfTheRoofX=17.5;
		double topOfTheRoofY=3.5;
		double leftOfTheRoofX=12.5;
		double leftOfTheRoofY = 8.5;
		double rightOfTheRoofX=22.5;
		double rightOfTheRoofY=8.5;
		//walls of the house
		double leftDownX=12.5;
		double leftDownY=13.5;
		double leftUpX=leftOfTheRoofX;
		double leftUpY=leftOfTheRoofY;
		double rightDownX=rightOfTheRoofX;
		double rightDownY=13.5;
		double rightUpX=rightOfTheRoofX;
		double rightUpY=rightOfTheRoofY;
		//door
		double leftDownDoorX=17.5;
		double leftDownDoorY=13.5;
		double leftUpDoorX=17.5;
		double leftUpDoorY=8.5 ; 
		double rightDownDoorX= 20;
		double rightDownDoorY= 13.5; 
		double rightUpDoorX= 20;
		double rightUpDoorY= 8.5; 
		
		//checking if the point is inside the roof using formula (Bx-Ax)*(Y-Ay) - (By-Ay)*(X-Ax)
		boolean leftSideOfRoof = ((topOfTheRoofX-leftOfTheRoofX)*(pointY-leftOfTheRoofY)-
								(topOfTheRoofY-leftOfTheRoofY)*(pointX-leftOfTheRoofX))>=0;
		boolean rightSideOfRoof = ((rightOfTheRoofX-topOfTheRoofX)*(pointY-topOfTheRoofY)-
								(rightOfTheRoofY-topOfTheRoofY)*(pointX-topOfTheRoofX))>=0;	
		boolean baseSideOfRoof = ((rightOfTheRoofX-leftOfTheRoofX)*(pointY-leftOfTheRoofY)-
								(rightOfTheRoofY-leftOfTheRoofY)*(pointX-leftOfTheRoofX))<=0;
		boolean insideTheRoof= leftSideOfRoof && rightSideOfRoof && baseSideOfRoof;
		
		//checking if the point is inside big square
		boolean insideTheLeftSquare=false;
		if ((pointX>leftDownDoorX && pointX< leftDownDoorX) && (pointY>leftUpDoorY && pointY <leftDownY) ){
			insideTheLeftSquare=true;
		}
		//checking if the point is inside small square
		boolean insideTheRightSquare=false;
		if ((pointX>rightUpDoorX && pointX< rightDownX) && (pointY>leftUpDoorY && pointY <leftDownY) ){
			insideTheRightSquare=true;
		}
		if (insideTheRoof || insideTheLeftSquare || insideTheRightSquare){
			System.out.println("Inside");
	