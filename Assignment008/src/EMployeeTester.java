public class EMployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       EMployee Harry = new EMployee ("Harry Hacker",50000);
       Harry.raiseSalary(10);
       System.out.println("Mr.Hacker's salary is now: $"+Harry.getSalary());
	}

}
