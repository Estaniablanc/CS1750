package Assignment3;

import java.util.Scanner;

public class Assignmentpart4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner six = new Scanner(System.in);
        System.out.print("please enter a positive Integer: ");
        int num = six.nextInt();
		
        System.out.print((num/10000)%10+" "+(num/1000)%10+" "+(num/100)%10+" "+(num/10)%10+" "+(num/1)%10);
        
	}

}
