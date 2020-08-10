public class TestException3 {
    public static void main(String[] ar){
        int a[] =new int[5];
        System.out.println("before");
       try{

            System.out.println("output for try block");
            a[5]=100;
      }
        catch(Exception e){
           System.out.println(e);
        }
        System.out.println("after");
    }
}
