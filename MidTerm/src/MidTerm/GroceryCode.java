package MidTerm;

import java.util.Scanner;

public class GroceryCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner grocery = new Scanner(System.in);
       
       System.out.println("Please enter the cost of your grocecies: ");
       double amount = grocery.nextDouble();
       double percent = 0;
        
       if (amount >= 10) {
    	   percent = 8;
       } else if(amount >= 50) {
    	   percent = 10;
       }else if(amount >= 150 ) {	   
           percent = 12;
       }else if(amount >= 210) {
    	   percent = 14;
       }
       double discount = percent * amount/100;
       System.out.println("you win a dicount coupon of $"+discount+". "+"("+percent+ "% of your purchase)");
	}

}
