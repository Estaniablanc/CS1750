package Assignment3;

import java.util.Scanner;


public class Assignment3part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner four = new Scanner(System.in);
        
        System.out.println("Enter radius");
        double radius = four.nextDouble();
        double area = Math.PI*Math.pow(radius, 2);
        double circumference =2*Math.PI*radius;
        double volume =(4.0/3)*Math.PI*Math.pow(radius, 3);
        double surfaceArea =4*Math.PI*Math.pow(radius, 2);
        
        System.out.println("The area is: "+area);
        System.out.println("The circumference is: "+circumference);
        System.out.println("The volume is: "+volume);
        System.out.println("The surface area of a sphere is: "+surfaceArea);
	}

}
