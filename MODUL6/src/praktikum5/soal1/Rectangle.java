package praktikum5.soal1;

public class Rectangle extends Shape {
    private double length,width;
    //----------------------------------
    // Constructor: Sets up the Rectangle
    //----------------------------------
    public Rectangle (double l, double w){
        super("Rectangle");
        length = l;
        width = w ;
    }
    //----------------------------------------
    // Returns the surface area of the Rectangle
    //----------------------------------------
    public double area(){
        return length * width;
    }
    //-----------------------------------
    // Returns the Rectangle as a String
    //-----------------------------------
    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
