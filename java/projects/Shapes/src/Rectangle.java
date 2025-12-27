

// a class has attributes(data) and behavior (methods/functions)
// access specifiers: public, private, protected etc.
public class Rectangle {

    //attributes - data
    private double width;        // init value 0
    private double height;

//    System.out.println(" width = ");

    // default constructor -  no-args constructor - init the object's data
    //
    public  Rectangle () {
        width = 1;
        height = 1;
    }

    // overloaded constructor -  take params -  a  pram is passed by the the client of the class when the object is created
    public Rectangle (double w, double h) {
        width = w;
        height = h;
    }

    // one more overloaded constructor - write a constructor that takes only width and inits height to 1
    public Rectangle (double w) {
        width = w;
        height = 1;
    }

    // yet another overloaded constructor with one param.
    public Rectangle (int w) {
        width = w;                  // implicit type casting 5 ==? width = 5.0 this is okay since double is 8 bytes and int is 4 bytes

    }

    // Getters and Setters
    //Getters getBLaBla() ....

    public double getHeight() {
        return height;
    }


    // accessSpecifier returnType functionName(args) { code ... }

    public double getWidth() {
        return width;
    }



    public void setWidth(double newWidth) {
        width = newWidth;
    }

    //complete the toString() method to print the boxs dims.

    public String toString() {
        return "hi";
    }

    // function that prints the data
    public void printArea() {
        System.out.println("Area = " + width * height);
    }

    // get area
    public double getArea() {
        return width * height;
    }



}

// Take Home Exercise
/*
    1. complete the Rectangle Class by adding a setHeight(.....) method
    2. print both width and height for all objects (box1,2,3, 4, 5)
    3. change box1 width to 7 and height to 9
    4. print box1 showing the new values
    5. add a method to calculate the area of the Rectangle (area = width * height)
 */

