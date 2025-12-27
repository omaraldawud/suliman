
public class Rectangle
{
    // instance variables - replace the example below with your own
    private double w;
    private double h;

    public Rectangle()
    {
        // initialise instance variables
        w = 1; 
        h = 1;
    }
    
    public Rectangle (double x, double y) {
         w = x;
         h = y;
    }
    
    public Rectangle (double nw) {
         w = nw;
         h = 55;
    }
    
    public double getWidth( )
    {
        // put your code here
        return w;
    }    
    
    public double getHeight( )
    {
        // put your code here
        return h;
    }
    
    public double getArea() {
        return w * h;
    }
    
    public void printArea() {
        System.out.println("Area = " + w * h);
    }
}