package JavaStream;

//a simple program to demonstrate the use of stream in java

import java.util.*;
import java.util.stream.Collectors;

/***
 * Different Operations On Streams-
 * Intermediate Operations:
 *
 * map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
 * List number = Arrays.asList(2,3,4,5);
 * List square = number.stream().map(x->x*x).collect(Collectors.toList());
 * filter: The filter method is used to select elements as per the Predicate passed as argument.
 * List names = Arrays.asList("Reflection","Collection","Stream");
 * List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
 * sorted: The sorted method is used to sort the stream.
 * List names = Arrays.asList("Reflection","Collection","Stream");
 * List result = names.stream().sorted().collect(Collectors.toList());
 * Terminal Operations:
 *
 * collect: The collect method is used to return the result of the intermediate operations performed on the stream.
 * List number = Arrays.asList(2,3,4,5,3);
 * Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
 * forEach: The forEach method is used to iterate through every element of the stream.
 * List number = Arrays.asList(2,3,4,5);
 * number.stream().map(x->x*x).forEach(y->System.out.println(y));
 * reduce: The reduce method is used to reduce the elements of a stream to a single value.
 * The reduce method takes a BinaryOperator as a parameter.
 * List number = Arrays.asList(2,3,4,5);
 * int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
 *
 * Here ans variable is assigned 0 as the initial value and i is added to it .
 */
public class Demo {
    public static void main(String[] args) {
        /*
         * credits: https://www.geeksforgeeks.org/stream-in-java/
         */
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        System.out.println(square);
        // [1, 4, 9, 16, 25]

        // create a list of String
        List<String> names =
                Arrays.asList("Bikash", "Jena", "cgi", "India", "Stream", "stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);
        // [Stream]

        // demonstration of sorted method
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
        // [Bikash, India, Jena, Stream, cgi, stream]


        // create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 1);

        // collect method returns a set
        Set<Integer> squareSet =
                numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(squareSet);
        // [16, 1, 4, 9, 25]
        // demonstration of forEach method
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

        // demonstration of reduce method
        int even =
                number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

        System.out.println(even);
        System.out.println("Given a list of integers, find out all the even numbers exist in the list using Stream functions.\n############################################################################");
        List<Integer> myList = Arrays.asList(22, 34, 14, 74, 1, 2, 3, 3, 4, 5, 10, 15, 8, 49, 69, 69, 25, 98, 32);
        // Given a list of integers, find out all the even numbers exist in the list using Stream functions.
        myList.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
//        Given a list of integers, find out all the numbers starting with 1 using Stream functions
        System.out.println("Given a list of integers, find out all the numbers starting with 1 using Stream functions\n############################################################################");
        myList.stream().map(x -> x + "")  // convert int to string
                .filter(x -> x.startsWith("1")).forEach(System.out::println);
        System.out.println("How to find duplicate elements in a given integers list in java using Stream functions?\n############################################################################");
//        How to find duplicate elements in a given integers list in java using Stream functions?
        Set<Integer> set = new HashSet<>();
        myList.stream().filter(x -> !set.add(x)).forEach(System.out::println);
//        Given the list of integers, find the first element of the list using Stream functions
        System.out.println("Given the list of integers, find the first element of the list using Stream functions\n############################################################################");
        myList.stream().findFirst().ifPresent(System.out::println);
//        Given a list of integers, find the total number of elements present in the list using Stream functions
        long count = myList.stream().count();
        System.out.println("Given a list of integers, find the total number of elements present in the list using Stream functions\n############################################################################");
        System.out.println(count);
        System.out.println("Given a list of integers, find the maximum value element present in it using Stream functions");
        int mx = myList.stream().max(Integer::compare).get();
        System.out.println(mx);
        System.out.println("Given a list of integers, sort all the values present in it using Stream functions");
        myList.stream().sorted().forEach(System.out::println);
        System.out.println("Given a list of integers, sort all the values present in it in descending order using Stream functions");
        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
/***
 * Important Points/Observations:
 *
 * A stream consists of source followed by zero or more intermediate methods combined together (pipelined) and a terminal method to process the objects obtained from the source as per the methods described.
 * Stream is used to compute elements as per the pipelined methods without altering the original value of the object.
 */