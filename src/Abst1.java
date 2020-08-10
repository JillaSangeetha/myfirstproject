public class Abst1{
    public static void main(String ar[]){
        Bike2 b;
        b=new Honda2();
        b.run2();
    }
}
 abstract class Bike2{
    abstract void run2();
}
class Honda2 extends Bike2{
    void run2(){
        System.out.println("running honda bike safely with 60kmph");
    }
}
