import java.io.*;
import java.util.*;

/**
 * A cat.
 */
public class Cat
{
    private String name;
    private String color;
    private boolean fed;
    private int age;
    
 
    public Cat()
    {
        name = "SSF";
        color = "Yellow";
        fed  = false;
        age = 2;
    }

    public Cat(String newName, String newColor) {
        this.name = newName;
        this.color = newColor;
        this.fed = true;
        this.age = 1;
    }
    
    public int getAge() { return age; }
    
    public void setAge(int newAge) {
        if (newAge < 1 || newAge > 19 ) 
            System.out.println("Please enter a valid age between 1 and 19");
        else  
            age = newAge;
    }
    
    
    
    public String getName() {
        return this.name;
    }
    
    /**
     * Gets a brief description of the cat.
     */
    public String getDescription() {
        return "A " + color + " cat named " + name;
    }

    /**
     * Sets a new color for the cat.
     */
    public void setColor(String color)
    {
        this.color = color;
    }
    

    /**
     * Prints a message on the terminal relating to the cat's current state.
     */
    public void listen()
    {
        if (fed)
        {
            System.out.println(name + " purrs.");
        }
        else
        {
            System.out.println(name + " meows at you.");
        }
    }

    /**
     * Plays with the cat
     */
    public void play() throws IOException
    {
        System.out.println("What will you get " + name + " to chase?");
        String item = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(name + " chases the " + item);
    }
}
