package Assignment5;

import java.util.Scanner;

public class OneC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner oneC =new Scanner(System.in);
        
        int integer=0;
        System.out.println("enter a value for 'n':");
        int n =oneC.nextInt();
         
        while (integer < n) 
        {
        	if(Math.pow(2, integer)< n)
        	System.out.print((int)Math.pow(2, integer)+" ");
        	integer ++;
        	 
        }
        System.out.println(" ");
	}

}
