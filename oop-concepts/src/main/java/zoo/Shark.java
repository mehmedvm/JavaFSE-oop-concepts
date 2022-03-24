package zoo;

public class Shark extends Animal {
    private static final String CARNIVOURE = "yes";
    private static String type = "Great White";

    //Constructor
    public Shark() {
    }

    public Shark(int age, String gender, String name) {
        super(age, gender, name);
    }

//Overriden Methods
//    @Override
//    public String swim() {
//        return "I am swimming as a Shark";  //super.swim();
//    }

    //Methods
    public String scary() {
        return "I Am scary";
    }

    public String fly() {
        return "I cannot fly";
    }

}
