import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in=new Scanner(System.in);
      double average;
      int pos=0;
      int sum=0;
      int count=0;
      
      System.out.println("Please enter an integer ending with q");
      
      while(in.hasNextInt()) 
      {
    	  int input=in.nextInt();
    	  if(input>0) 
    	  {
    		  
    		  pos++;
    		  sum=input+sum;
    		  count++;
    	  }
      }
      average=sum/count;
      System.out.println("The average of positive integers: "+average);
      
	}

}
