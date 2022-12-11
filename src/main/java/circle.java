import java.lang.Math;
public class circle {
	
	public  double CalculateArea(double r)
	{
		return Math.PI * r * r;
		
	}
	
	public double CalculateDiameter(double r)
	{
		return  2 * r;
	}
	
	public double CalculateCircumference(double r)
	{
		return 2 * Math.PI * r;
	}

}
