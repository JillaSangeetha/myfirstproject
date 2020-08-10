public class mainclass
{ public static void main(String args[])
  {
      subclass obj =new subclass();
      obj.display();
      obj.sum();
  }
}
class superclass{
    int a=10,b=20;
    public void display(){
        System.out.println("a="+a + "b="+b);
    }
}
class subclass extends superclass{
    int sum;
    public void sum(){
        sum=a+b;
        System.out.println("sum="+sum);
    }
}