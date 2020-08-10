//it is an hackerrank program
import java.util.*;
 import java.io.*;

    class PrintASeries{
        public static void main(String []args){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int s=0;
                s=s+a;
                for(int z=0;z<n;z++){

                    s+=(Math.pow(2,z))*b;
                    System.out.print(s+" ");
                }
                System.out.println();

            }
            in.close();
        }
    }
