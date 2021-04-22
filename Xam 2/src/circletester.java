
public class circletester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      circle Circle=new circle(2.5,0.0,0.0,"red");
      
      System.out.println("The circle color is "+Circle.getColor());
      System.out.println("The circle radius is "+Circle.getRadius());
      System.out.println("The circle center location is "+Circle.getX()+","+Circle.getY());
      System.out.println("The circle diameter is "+Circle.getDiameter());
      System.out.println("The circle perimeter is "+Circle.getPerimeter());
      System.out.println("The circle area is "+Circle.getArea());
      
      
      //movement
      Circle.setRadius(3.5);
      Circle.setColor("black");
      Circle.ssetX(10.0);
      Circle.setY(20.0);
      
      System.out.println("\nAfter movement");
      System.out.println("The circle color is "+Circle.getColor());
      System.out.println("The circle radius is "+Circle.getRadius());
      System.out.println("The circle center location is "+Circle.getX()+","+Circle.getY());
      System.out.println("The circle diameter is "+Circle.getDiameter());
      System.out.println("The circle perimeter is "+Circle.getPerimeter());
      System.out.println("The circle area is "+Circle.getArea());
      
      		
	}

}
