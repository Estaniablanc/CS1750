package Assignment6;

import java.util.Scanner;

public class Q1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
        String n;
        int c;
        int charac;
        
        System.out.println("Please Enter a string: ");
        n = in.nextLine();
        
        charac=n.length();
        
        for(c=charac-1;c>=0;c--)
        {
        	System.out.println(n.charAt(c));
        }
	}

}
