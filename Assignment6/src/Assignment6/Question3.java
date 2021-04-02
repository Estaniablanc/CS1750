package Assignment6;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stationName;
		Scanner in = new Scanner(System.in);
		String answer;
		double Temp=0;
		double Speed=0;
		String Direction=null;
        System.out.println("What is the weather station name? ");
        stationName = in.nextLine();
        
        while(true) 
        {
        System.out.println("Do you want to input a weather reading (YES/NO)? ");
        answer = in.nextLine();
        if(answer.equalsIgnoreCase("YES")) 
        {
        	System.out.println("Input a temperature: ");
        	Temp = in.nextDouble();
        	
        	
        	System.out.println("What is the windspeed: ");
        	Speed = in.nextDouble();
        	in.nextLine();
        	
        	System.out.println("What is the wind direction: ");
        	Direction = in.nextLine();
        	
        }
        else if(answer.equalsIgnoreCase("NO"))
        {
             System.out.println("You've answered NO, Goodbye!");
             break;
        }
               
            
        System.out.println("Temperature:  "+ Temp);
        System.out.println("Wind Speed:  "+ Speed);
        System.out.println("Wind Direction: "+ Direction);
	}

}}
