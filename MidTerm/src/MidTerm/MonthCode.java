package MidTerm;

import java.util.Scanner;

public class MonthCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer between 1 and 12: ");
        int month = in.nextInt();
        String season;
       if (month <= 3 && month >= 1)
       {
       System.out.println("It is winter");
       }
       
       else if (month >= 4 && month<= 6)
	    {
    	   System.out.println("It is Spring ");
	    }
    	   
	
       	else if (month >=7&& month <= 9)
       	{
       		System.out.println("It is Summer");
       	}
       		
	   
       else if (month >= 10 && month <= 12)
       {
    	   System.out.println("It is Fall");
       }
    	     
      else 
      {  
            System.out.println("It is an invalid month.");
        
        }
        
        
	}
}

	

