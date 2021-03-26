package Assignment5;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0,i;
        for(i = 2;i<=100;i++) 
        {
        	if(i%2==0)
        {
        	
        	sum=sum+i;
        }
        System.out.println("The sum of all even numbers between 2 and 100: "+sum);
	}

}
}