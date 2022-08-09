//A constructor is a method that has the same name of the class and it's used to intialize instant variables
public class Constructor {
    public static String firstname; //the following instant variables are created
    public static String lastname;
    public static int age;

    public Constructor (String firstname, String lastname, int age) {
        this.firstname = firstname; //first instant variable is assigned a value. The value comes from the parameter variable
        this.lastname = lastname;
        this.age = age;
    }
    public static void main(String[] args) {
        Constructor person = new Constructor("Jason", "Doe", 34); //this creates an object person of the Constructor class. It call the constructor
        // getName();
        System.out.println(person.firstname + " " + person.lastname + " " + person.age);
    }
}