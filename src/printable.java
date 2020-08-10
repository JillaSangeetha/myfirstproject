public interface printable {
    void print();
}
class A123 implements printable{
    public void print(){
        System.out.println("vaag");

}
public static void main(String ar[]){
    A123 a=new A123();
    a.print();
} }
