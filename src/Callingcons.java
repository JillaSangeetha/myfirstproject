public class Callingcons {
    public static void main(String ar[]){
        C11 c=new C11();
    }}
class C11 extends B11{
    C11(){
    System.out.println("inside c's constructor");

}}
class B11 extends A11{
    B11(){
        System.out.println("inside b's constructor");

    }}
class A11{
    A11(){

        System.out.println("inside a's constructor");
    }}
