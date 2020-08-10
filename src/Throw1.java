public class Throw1 {
    static void arithExcep(int a,int b)
    {
        int c;
        if(b==0)
        throw new ArithmeticException();
        else
            c=a+b;
    }
    public static void main(String ar[])
    {
        arithExcep(5,0);
    }
}
