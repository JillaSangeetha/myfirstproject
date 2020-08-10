public class Numberpattern5 {
    public static void main(String args[]){
        for(int i=1;i<=6;i++){  // 6
            int no=i;
            for(int j=1;j<=i;j++){
                System.out.print(no +" ");
                no=no+6-j; //6 interlinked
            }
            System.out.println();
        }
    }
}
