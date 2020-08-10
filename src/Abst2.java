public class Abst2 {
    public static void main(String ar[]){
        Shape s1,s2,s3;
        s1=new Rectangle();
        s2=new Triangle();
        s3=new Circle();
        s1.draw();
        s2.draw();
        s3.draw();
    }
}
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}