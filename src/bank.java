public interface bank
{
    float getroi();
}
class Sbi implements bank{
    public float getroi(){
        return 8.4f;

    }
}
class Icici implements bank{
    public float getroi(){
        return 7.3f;

    }
}
class Hdfc implements bank{
    public float getroi(){
        return 9.7f;

    }
}
class Bankpoly{
    public static void main(String ar[]){
        bank b1,b2,b3;
        b1=new Sbi();
        b2=new Icici();
        b3=new Hdfc();
        System.out.println("sbi="+b1.getroi() + "%");
        System.out.println("icici="+b2.getroi() + "%");
                System.out.println("hdfc="+b3.getroi() + "%");
    }
}