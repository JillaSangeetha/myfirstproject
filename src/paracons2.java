 class Paracons2 {
int a,b;
Paracons2(int x,int y)
  {
      a=x;
      b=y;
  }
  void add()
  {
      int sum=a+b;
      System.out.println("sum="+sum);}
      void subs()
     {
         int sub=a-b;
         System.out.println("sub="+sub);
     }
     public static void main(String args[]) {
    Paracons2 p1=new Paracons2(20,10);
    Paracons2 p2=new Paracons2(100,200);
    p2.subs();
    p1.subs();
    p1.add();
    p2.add();
     }}