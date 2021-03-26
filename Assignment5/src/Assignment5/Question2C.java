package Assignment5;

import java.util.Scanner;

public class Question2C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum_odd=0,i;
		Scanner in =new Scanner(System.in);
		System.out.println("Please enter a number for a and b: ");
		a=in.nextInt();
		b=in.nextInt();
        for(i = a;i<=b;i++) 
        {
        	if(i % 2 !=0)
        {
        		sum_odd=sum_odd+i;
        }}
        	System.out.println("The sum of all odd numbers between a and b: "+sum_odd);
        }
        
	}


