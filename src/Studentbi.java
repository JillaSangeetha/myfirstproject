 import java.util.Scanner;
public class Studentbi {
public static void main(String ar[]){
    int sid;
    String sname;
    Scanner obj = new Scanner(System.in);
    System.out.println("enter student id");
    sid=obj.nextInt();
    System.out.println("enter student name");
    sname=obj.next();
    System.out.println(  "sid="+sid +" " + "student name="+sname);
}
}
