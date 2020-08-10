public class MultiCatch {
    public static void main(String args[]){
         try{
             int a=args.length;
             a=1;
             System.out.println("a=" + a);
              int b=42/a;
              int c[]={1};
              c[42]=99;
         }
         catch(ArithmeticException e){
             System.out.println("divide by zero" + e);
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("array index out of bound"+ e);
         }
        System.out.println("after try,catch blocks ");
    }
}
