import java.util.ArrayList;
import java.util.List;

public class OOP {
    // static means we don't have to create an instance of his class
    public static void main(String[] args) {
        // argument
        /* An argument is a value passed to a function when the function is called. Whenever any function is called during the execution of the program there are some values passed with the function. These values are called arguments. An argument when passed with a function replaces with those variables which were used during the function definition and the function is then executed with these values. */
        // parameter
        /* A parameter is a variable used to define a particular value during a function definition. Whenever we define a function we introduce our compiler with some variables that are being used in the running of that function. These variables are often termed as Parameters. The parameters and arguments mostly have the same value but theoretically, are different from each other. */
        // reference: https://www.geeksforgeeks.org/argument-vs-parameter-in-java/

        System.out.println("hello OOP");
        // instance of class = object
        User u = new User();
        Student s = new Student();
        Teacher t = new Teacher();
        User user = new User("Akash", "Platinum");
        User user1 = new User("Akash", "Platinum");
        user1.setMembership("Diamond");
        // we are invoking the default constructor for this user class. we have created a user.
        u.setName("Bikash");
        u.setMembership(User.Membership.Gold);
        s.setName("student");
        t.setName("teacher");
        // if we are not assigning any value to an object, by default it's null
        // for primitive types, it's usually zero

        System.out.println(user.getName()); // Akash
        System.out.println(user.getMembership()); // Platinum
        // method overloading example
        System.out.println(u.getName()); // Bikash
        System.out.println(u.getMembership()); // Gold
        System.out.println(7); // guess what
        System.out.println(u);
        System.out.println(user);
        System.out.println(user == user1);
        System.out.println(user.equals(user1));

        // ArrayList extends AbstractList class and implements List interface
        // List is an interface. ArrayList is a class
        // List cannot be instantiated.	ArrayList can be instantiated.
        List<User> users = new ArrayList<>();
        // or
        User.admins = new ArrayList<>();

        User.admins.add(s);
        User.admins.add(t);

        System.out.println("using for loop");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getName());
        }
        // generics
        System.out.println("generics: for-each loop, also called enhanced for loop");
        for (User us : users) {
            System.out.println(us.getName());
        }
        System.out.println("static data members");
        for (User us : User.admins) {
            System.out.println(us.getName());
        }
        // or
        System.out.println("using static method");
        User.print_admin_names();

        System.out.println("Inheritance");
        System.out.println(s.is_verified()); // default value
        s.setMembership("Gold");
        System.out.println(s.getMembership());
        for (User us : User.admins) {
            us.verify();
        }
    }
}
