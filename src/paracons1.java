class Paracons1
{  int sid;
String sname;
Paracons1(int i,String s)
{
    sid =i;
    sname=s;
}
void display(){
    System.out.println(sid +" " +sname);
}
public static void main(String args[])
  {
       Paracons1 p1=new Paracons1(553,"xyz");
       Paracons1 p2 =new Paracons1(552,"abc");
       p2.display();
       p1.display();
  }
}
