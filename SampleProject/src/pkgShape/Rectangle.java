package pkgShape;

public class Rectangle {

	double Length;
	double Width;
	
	// constructor below 
	
	
	public Rectangle(double Length, double Width)
	{
		this.Length = Length;
		this.Width = Width;
	}
	
	// Method below
	public void PaintRectangle(int iColor)
	{

	}
		
	public boolean isSquare() {
		return Length == Width;
	}

	public double area() {
		return this.Length * this.Width;
	}
	public double perimeter()
	{
		return 2 * (this.Length + this.Width);
	}
	
}