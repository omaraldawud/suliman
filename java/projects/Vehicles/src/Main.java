
public class Main {

    public static void main (String [] args) {

        Car myCar = new Car();   // calls the Car function default constructor
        System.out.println(myCar);      // object name is a reference - memory address

        Car tomsToyota = new Car ("Toyota", "Camery", "Yellow", 2001 );
        System.out.println(tomsToyota);



        Car car3 = new Car("Honda", "CRV", "Black", 2020);  // init the values for car3 object
        System.out.println(car3);       // without toString this will print memory address

//        car3.setYear(2025);

        System.out.println("car3's make: " + car3.getMake());
        car3.setMake("BNZ");
        System.out.println("car3's make: " + car3.getMake());

        System.out.println(car3.getYear());
        car3.setYear(2010);
        System.out.println(car3.getYear());

        Car omarToyota = new Car ("Honda", "Accord", "Gray", 2013);
        System.out.println(omarToyota);
        System.out.println("--------------------------");
        omarToyota.setMake("Toyota");
        System.out.println(omarToyota);

        omarToyota.setYear(2000);
        System.out.println(omarToyota);

        // change the color of the object car3 to green and omarToyota to yellow.
        car3.setColor("Green");
        System.out.println(car3);

        // change omarToyota to yellow.
        omarToyota.setColor("Yellow");
        System.out.println(omarToyota);

        Car myNewCar = new Car("BNZ","3000E", "White");
        System.out.println(myNewCar.getYear());

     }
}