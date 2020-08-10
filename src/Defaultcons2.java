public class Defaultcons2
{ public static void main(String args[]){
    Honda h=new Honda();
}
}
class Bike
{
    Bike()
    {
        System.out.println("running safely 80kmph");
    }
}
class Honda extends Bike
{
    void runn(){
        System.out.println("running safely 100kmph");
    }
}