public class superinstancevar
{ public static void main(String args[])
  {
      Human d =new Human();
      d.printcolor();
  }
}
class Female
{
    String color="black";
}
class Human extends Female
 {
     String color ="white";
     void printcolor()
     {
         System.out.println(color);
         System.out.println(super.color);
     }

}