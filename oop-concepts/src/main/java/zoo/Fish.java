//Comments
//My comments

//Package
package zoo;

//Java Imports
import java.util.ArrayList;

//Custom Imports
import interfaces.ICommunication;

//Class Declaration
public class Fish extends Animal {
    private int sizeInFeet;
    private boolean canEat;

    //Constructor
    public Fish() {
    }

    public Fish(int sizeInFeet, boolean canEat) {
        this.sizeInFeet = sizeInFeet;
        this.canEat = canEat;
    }

    public Fish(int age, String gender, String name, int sizeInFeet, boolean canEat) {
        super(age, gender, name);
        this.sizeInFeet = sizeInFeet;
        this.canEat = canEat;
    }

    //Getters and Setters

    //Methods

    //To String


    @Override
    public String toString() {
        return "Fish{" +
                "sizeInFeet=" + sizeInFeet +
                ", canEat=" + canEat +
                '}';
    }
}






