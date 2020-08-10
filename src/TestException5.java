public class TestException5 {
    public static void main(String ar[]){
        int a[]= new int[5];
        System.out.println("before exception");
        try
        {
            a[5]=100;
        }
        catch (Exception w)
        {
            System.out.println(w);
        }
        System.out.println("after exception");

    }
}
