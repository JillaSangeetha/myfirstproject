public class SuperSubCatch {
    public static void main(String args[]){
        try{
            int a=0;
            int b=42/a;
        }
        catch(ArithmeticException e){
            System.out.println("generic exception catch...");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("this is never reached");
        }
    }
}
