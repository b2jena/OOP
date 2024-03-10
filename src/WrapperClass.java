public class WrapperClass {
    public static void main(String[] args) {
        // boxing process using Constructors
        Integer obj1 = new Integer(121);
        Integer obj2 = new Integer("122");

        // boxing process using valueOf() method
        Integer obj3 = Integer.valueOf(123);
        Integer obj4 = Integer.valueOf("124");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);

        // unboxing
        int a = obj1.intValue();
        int b = obj2.intValue();
        int c = obj3.intValue();
        int d = obj4.intValue();
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
