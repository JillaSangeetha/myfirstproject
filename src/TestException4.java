public class TestException4
{
    public static void main(String[] ar){
    try
    {
        int a[]=new int[5];
        a[5]=100/0;

}
catch(ArrayIndexOutOfBoundsException w){
    System.out.println(w);
}
catch(ArithmeticException e){
    System.out.println(e);
    //these all are exceptions methods
    System.out.println("get message method..."+ e.getMessage());//Returns a detailed message about the exception that has
    // occurred. This message is initialized in the Throwable constructor.
    System.out.println("get cause..."+ e.getCause());//Returns the cause of the exception as represented by a Throwable object.
   System.out.println("toStringmethod...."+ e.toString());//Returns the name of the class concatenated with the result of getMessage().
   // System.out.println("stack trace..."+e.printStackTrace());//Prints the result of toString() along with the stack trace to System.err, the error output stream
    System.out.println("getStackTrace() method..."+ e.getStackTrace());
    //Returns an array containing each element on the stack trace. The element at index 0 represents the top of the call
    // stack, and the last element in the array represents the method at the bottom of the call stack.
    }}
}
