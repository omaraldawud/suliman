public class Car {
    //attributes,  are fields or data members, they cary the object's data
    //encapsulation : attributes are private and we provide getters and setters
    private String make;
    private int year;
    private String color;
    private String model;

    // default constructor
    public Car() {
        this.setMake("Unknown");          // "this" is a mem ref  (Address) to the object
        this.setYear(0);
        this.setColor("Unknown");
        this.setModel("Unknown");
    }

    // An Overloaded constructor that takes make, model, year, and color as params.
    public Car(String make, String model, String color, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setColor(color);
        this.setYear(year);
    }

    public Car( String model, String make, String color) {
        this.setMake(make);
        this.setModel(model);
        this.setColor(color);
        this.setYear(2000);
    }

    // used to print objects of type Car
    public String toString() {
        return getMake() + " ++ " + getModel() + " - " +  +getYear() + " - " + getColor();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}



/*
Create a Car class in Car.java with:
Fields (private):
• make (String)
• model (String)
• year (int)
• color (String)


Constructor:
• default constructor and set the vlaues to unknown or 0 for numeric value
• A constructor that takes make, model, year, and color.
Getters and Setters:
• getMake(), getModel(), getYear(), getColor()
• setMake(), setModel(), setYear(), setColor()
Methods:
• boolean isNewerThan(Car otherCar)
- returns true if this.year is greater than the other car's year
• String toString()
- return a readable description of the car, e.g., "2020 Blue Toyota Camry"
 */
