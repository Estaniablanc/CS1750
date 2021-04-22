
public class circle {
	private double radius;
	private double x;
	private double y;
	private String color;
	
	
	public circle( ) 
	{
		radius =1.0;
		x=0.0;
		y=0.0;
		color = "black";
		
	}
	public circle(double radius,double x,double y, String color ) 
	{
		this.radius =radius;
		this.x=x;
		this.y=y;
		this.color = color;
	
	}
	public void setRadius(double radius) 
	{
		this.radius=radius;	
		
	}
	public void ssetX(double x) 
	{
		this.x=x;	
	}
	public void setY(double y) 
	{
		this.y=y;		
	}
	public void setColor(String color) 
	{
		this.color=color;		
	}
	public double getRadius() 
	{
		return radius;
	}
	
	public double getX() 
	{
		return x;
	}

    public double getY() 
    {
	return y;
    }
	public String getColor() 
	{
		return color;
	}
	public double getArea() 
	{
		return 3.14*radius*radius;
	}
	public double getPerimeter() 
	{
		return 2*3.14*radius;
	}
	public double getDiameter() 
	{
		return 2*radius;
		
	
}

}
