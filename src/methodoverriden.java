public class methodoverriden {
    public static void main(String ar[]){
        B12 b =new B12(1,2,3);
        b.show();
    }
}
class A12{
    int i,j;
    A12(int a,int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i and j are:" +i +" " +j);
    }
}
class B12 extends A12{
    int k;
    B12(int a,int b,int c){
        super(a,b);
        k=c;
    }
    void show(){
        super.show();
        System.out.println("k :" +k);
    }
}
