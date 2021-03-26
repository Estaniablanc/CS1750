package Assignment5;
import java.util.Scanner;
public class OneA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner one =new Scanner(System.in);
        int x=0;
        int integer=0;
        System.out.println("enter a value for 'n':");
        int n =one.nextInt();
         
        while (x < n) 
        {
        	System.out.print(x+" ");
        	integer ++;
        	x = (int) Math.pow(integer, 2); 
        }
        System.out.println(" ");
        }
	}


