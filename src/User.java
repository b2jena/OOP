import java.util.List;

// we can make this User abstract
public class User {
    public static List<User> admins;
    private String name;
    private String membership;
    private boolean _verified = false;
    // Parameterized constructor
    public User(String name, String membership) {
        this.name = name;
        this.membership = membership;
    }

    // default constructor (no-arg constructor)
    public User() {

    }

    // constructor overloading
    public User(String name) {
        this.name = name;
    }

    public static void print_admin_names() {
        for (User u : admins) {
            System.out.println(u.getName());
        }
    }

    public boolean is_verified() {
        return _verified;
    }

    public void set_verified(boolean verified) {
        _verified = verified;
    }

    // encapsulation -> hide inner details
    /*
     * Encapsulation is a way to restrict the direct access to some components of an object,
     * so users cannot access state values for all of the variables of a particular object.
     * Encapsulation can be used to hide both data members and data functions or methods associated
     * with an instantiated class or object.
     * */
    /*
     * Getters and setters are used to protect your data, particularly when creating classes.
     * For each instance variable, a getter method returns its value while a setter method sets
     * or updates its value.
     * */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }

    void setMembership(Membership membership) {
        this.membership = membership.name();
    }

    //    @Override
    public boolean equals(User user) {
        return getName() == user.getName() && getMembership() == user.getMembership();
    }

    //    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", membership='" + membership + '\'' +
                '}';
    }

    String setMembership() {
        return this.membership;
    }

    void verify() {
        System.out.println("verifying...");
        set_verified(true);
    }

    /*
     * Enums are used to create our own data type like classes. The enum data
     * type (also known as Enumerated Data Type) is used to define an enum in Java.
     * Unlike C/C++, enum in Java is more powerful. Here, we can define an enum either
     * inside the class or outside the class.
     * */
    // The Enum in Java is a data type which contains a fixed set of constants.
    public enum Membership {
        Bronze, Silver, Gold, Platinum
    }
}
