import zoo.Animal;

public class Main {
    public static void main(String[] args) {
        //Object 1
        Person adam = new Person();
        System.out.println("Object 1");
        System.out.println(adam);
        //set some state
        adam.setFirstName("Adam");
        adam.setLastName("Ingram");
        adam.setAge(41);
        System.out.println("First Name: " + adam.getFirstName() + ";" +
                            " Last Name: " + adam.getLastName() + ";" +
                            " Age: " + adam.getAge());

        //Object 2
        Person lindsay = new Person("Lindsay", "Ingram", 25);
        System.out.println("\nObject 2");
        System.out.println(lindsay);
        System.out.println(lindsay.getFirstName() + " is my wofe");

        //Object 3
        Person ellie = new Person("Ellie", "Ingram", 4);
        System.out.println("\nObject 3");
        System.out.println(ellie);
        System.out.println(ellie.getFirstName() + " is my daughter");

////////////////////
        GoCart gocart1 = new GoCart("gc1", true, 9);
        GoCart gocart2 = new GoCart();
        System.out.println("\n" + gocart1);
        gocart2.setName("gc2");
        gocart2.setNeedGas(false);
        gocart2.setLaps(5);
        System.out.println("\n" + gocart2);

        //Animal Lion

        //Overloading Methods
        Animal bear = new Animal();
        bear.setName("Bear");
        bear.setAge(5);

        System.out.println(bear.getAge());
        System.out.println(bear.getAge(bear.getName()));


    }
}
