public class Starpattern10_2{
        public static void main(String args[]) {
            for (int i = 5; i >=1; i--) { //this 5
                for (int j = 5; j >=i; j--) {  //this 5 ,both should same
                    System.out.print("a");
                }
                for (int k = 1; k < (i * 2); k++) {
                    if (k > 1 && k < (i * 2) - 1) System.out.print("i");
                    else System.out.print("*");
                }
                System.out.println();
            }

        }
    }