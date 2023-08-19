public class Student extends User {

    void verify() {
        System.out.println("verifying using email...");
        set_verified(true);
    }
}
