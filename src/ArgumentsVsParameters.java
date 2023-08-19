// a simple example
public class ArgumentsVsParameters {
    // the variables a and b are parameters
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;

        // the variables x and y are arguments
        int product = multiply(x, y);

        System.out.println("PRODUCT IS: " + product);
    }
}
