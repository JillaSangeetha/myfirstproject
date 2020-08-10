public class Programmer extends Employ {
 int bon;
 public static void main(String args[])
 {
     Programmer p=new Programmer();
     p.sal=50000;
     p.bon=10000;
     p.salary();
     System.out.println("bonus="+p.bon);
 }}
 class Employ{
    double sal;
     void salary()
     {
         System.out.println("salary="+sal);
     }
 }
