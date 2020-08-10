public class Mystarpattern1 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==2 && j>=i || i==4 && j<=i ) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* *****
   *
   *****
       *
   ***** */



