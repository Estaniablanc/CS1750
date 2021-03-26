package Assignment5;

import java.util.Scanner;

public class OneD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner oneD =new Scanner(System.in);
        
        int num=0;
        int equation;
        int integer = (int)Math.pow(2, 0);
        System.out.println("enter a value for 'n':");
        int n =oneD.nextInt();
         
        while (num <= n) 
        {
        	equation=(int)Math.pow(2, 0+num);
        	System.out.print(equation +" ");
        	integer ++;
        	 
        }
        System.out.println(" ");
	}

}
