/*If a method does not handle a checked exception, the method must declare it using the throws keyword.
        The throws keyword appears at the end of a method's signature.

        You can throw an exception, either a newly instantiated one or an exception that you just caught, by
        using the throw keyword.

        Try to understand the difference between throws and throw keywords,
         throws is used to postpone the handling of a checked exception
        and throw is used to invoke an exception explicitly. */




/*User-defined Exceptions:
        You can create your own exceptions in Java. Keep the following points in mind when writing your own exception classes −

        All exceptions must be a child of Throwable.

        If you want to write a checked exception that is automatically enforced by the Handle or Declare Rule, you need
        to extend the Exception class.

        If you want to write a runtime exception, you need to extend the RuntimeException class.*/


public class TestException {
    public static void main(String[] ar){
        System.out.println("welcome");


            int a=100/0;

        System.out.println("hello");
    }
}
