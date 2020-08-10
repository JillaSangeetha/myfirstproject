public class Nestedtry {
    public static void main(String ar[]){
        try
        {
            System.out.println("outer");

        try
        {
            System.out.println("inner");
            int a=200/0;
        }
        catch(ArrayIndexOutOfBoundsException d)
        {
            System.out.println(d);
        }
        catch(ArithmeticException d)
        {
            System.out.println(d);
        }

    }
    catch(Exception d)
    {
        System.out.println("parent Exception");
    }
    System.out.println("rest of the code");
}
}