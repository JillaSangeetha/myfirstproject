public class Exc2 {
    public static void main(String ar[]){
        int d,a;
        try{
            d=0;
            a=42/d;
            System.out.println("this ll not be printed");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("after catch stmnt");
    }
}
