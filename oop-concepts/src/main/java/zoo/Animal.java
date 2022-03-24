/* Comments
    This area for comments
 */

// Package
package zoo;

//Imports
import interfaces.ICommunication;

//Class Declaration
public class Animal implements ICommunication{

    //Fields
    private int age;
    private String gender;
    private String name;

    //Method overloading: different parameters and return type
    //Method overriding: same method signature, different body

    //Default Constructor
    public Animal() {
    }

    //Parametirized Constructor
    public Animal(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    //Getters and Setters
    public int getAge() {
        return age;
    }

//    public String getAge(String name) {
//        return ("Name is: " + name + "; Age is: " + getAge());
//    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods
    public boolean isMammal() {
        return true;
    }

    public String swim() {
        return "I am swimming";
    }

    public String run() {
        return "I am running man hear me roar!!";
    }


    //To String
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    //From ICommunication interface class
    @Override
    public String speak() {
        return null;
    }
}
