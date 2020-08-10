public class Abst3 {
    public static void main(String ar[]){
        Bank3 b1,b2,b3;
        b1=new SBI3();
        b2=new ICICI3();
        b3=new HDFC3();
        System.out.println("sbi roi="+b1.getroii() + "%");
        System.out.println("sbi roi="+b2.getroii() + "%");
        System.out.println("sbi roi="+b3.getroii() + "%");
    }
}
abstract class Bank3{
    abstract double getroii();
}
class SBI3 extends Bank3{
   double getroii()
    {return 8.4;}
}
class ICICI3 extends Bank3{
      double getroii()
    {return  7.3;}
}
class HDFC3 extends Bank3{
      double getroii()
    {
        return  9.7;}
}