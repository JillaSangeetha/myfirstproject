public class Addition
{ public static void main(String args[]){
    B2 b=new B2();
    b.display();
    b.add();
}
}
class A2
{
    int i=10;
    int j=20;
    void display(){
        System.out.println("i="+i  +  "j="+j);
    }
}
class B2 extends A2
{
     int s= i+j;
    void add()
    {
        System.out.println("sum of i and j="+s);
    }
}
