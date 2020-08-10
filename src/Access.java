/*this program cannot compile*/
public class Access {
     public static void main(String args[]){
         B3 subob=new B3();
         subob.setij(10,12);
         subob.sum2();
         System.out.println("total is:" + subob.total);
     }
}
class A3{
    int i;
      int j;// if j is private//
      void setij(int x,int y){
        i=x;
        j=y;
    }
}
class B3 extends A3{
    int total;
    void sum2(){
        total=i + j;
    }
}
