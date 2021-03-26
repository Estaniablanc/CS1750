package Assignment5;

public class Question2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,i,square;
        for(i = 1;i<=100;i++) 
        {
            square = i*i;
        	sum=sum+square;
        }
        System.out.println("The sum of all squares between 1 and 100: "+sum);
	}

}
