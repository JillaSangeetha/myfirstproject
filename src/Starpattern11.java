public class Starpattern11 {
    public static void main(String args[]){
        for(int i=0;i<7;i++){ //this 7
            for(int j=0;j<7;j++){ //this 7
                if(i==j || i+j==7-1 ) System.out.print("*"); //this 7 ,all the three 7's are interlinked all should same
                    else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
