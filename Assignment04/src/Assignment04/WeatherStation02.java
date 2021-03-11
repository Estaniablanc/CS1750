package Assignment04;

import java.util.Scanner;

public class WeatherStation02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stationName;
		Scanner in = new Scanner(System.in);
		String answer;
        System.out.println("What is the weather station name? ");
        stationName = in.nextLine();
        
        
        System.out.println("Do you want to input a weather reading (Y/N)? ");
        String reading = in.nextLine();
        Scanner an = new Scanner(System.in);
        answer = an.nextLine();
       
        if (answer.equals("N")) 
        System.out.println("Goodbye");
        else 	
             System.out.println("Which is the temperature? ");
             String temp = in.nextLine();
            
        System.out.println("Which is the wind speed? ");
        String speed = in.nextLine();
            
        System.out.println("Which is the wind direction? ");
        String direction = in.nextLine();   
            
            
        System.out.println("The monmouth University Weather Station");
        System.out.println("Temperature:  " + temp);
        System.out.println("Wind:  " + speed+" mph "+ direction);

	}

}
