 //this is also called snake number pattern
 public class Numberpattern6 {
    public static void main(String args[]){
        int count=0;
        for(int i=1;i<=5;i++){
            if(i%2!=0){
                for(int j=1;j<=3;j++){ //if we change value of 3 by 5 we get in each column 5 no.s will appear
                    count=count+1;
                    System.out.print(count +" ");
                }}
            else{
                int temp=count+1; //count value is odd row last digit (3,9,15)
                for(int z=count+3;z>=temp;z--){ //so its Starts from +3 (6,12) one more point if we change value of 3 by 5 we get in each column 5 no.s will appear
                    count=count+1;
                    System.out.print(z +" ");
                }
            }
            System.out.println();

        }
    }
}
