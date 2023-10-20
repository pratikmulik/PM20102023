package Q5_1;
import java.lang.Math;

public class Point2D {

	private double x,y;
	
	public double getX() 
	{
		return x;
	}

	public void setX(double x) 
	{
		this.x = x;
	}

	public double getY() 
	{
		return y;
	}

	public void setY(double y) 
	{
		this.y = y;
	}

	public Point2D()
	{
		System.out.println("-----------Deafult ctor-------");
	x=0.0;
	y=0.0;
	}
	
	public Point2D(double x,double y)
	{System.out.println("-----------Para ctor-------");
	this.x=x;
	this.y=y;	
	}
	
	public String toString()
	{
		return "Value of X="+x+"\n Value of Y="+y;
	}
	
	public boolean isEqual(double x,double y)
	{
		if (this.x==x && this.y==y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double calDistance(double x, double y)
	{
		double distance=0;
		double xdist=Math.pow((this.x-x),2);
		double ydist=Math.pow((this.y-y),2);
		distance=Math.sqrt(xdist+ydist);
		return distance;
	}
	
	
	
	

}
