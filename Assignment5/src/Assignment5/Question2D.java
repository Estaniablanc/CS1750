package Assignment5;

import java.util.Scanner;

public class Question2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,sum_odd_digit=0,rem=0;
		Scanner d =new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number =d.nextInt();
		
        while(number>0) 
        {
        	rem=number%10;
            if(rem % 2 !=0)
        {
        		sum_odd_digit=sum_odd_digit+rem;
        }
            number=number/10;
        }
        	System.out.println("The sum of all odd digit are: "+sum_odd_digit);
	}

	}
