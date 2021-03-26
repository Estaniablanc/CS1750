package Assignment5;

import java.util.Scanner;

public class OneB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner oneB =new Scanner(System.in);
        
        int integer=1;
        System.out.println("enter a value for 'n':");
        int n =oneB.nextInt();
         
        while (integer < n) 
        {
        	if(integer%10==0)
        	System.out.print(integer+" ");
        	if(integer>n);
        	integer ++;
        	 
        }
        System.out.println(" ");
	}

}
