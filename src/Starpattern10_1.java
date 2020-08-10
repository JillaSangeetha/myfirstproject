
public class Starpattern10_1 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("a");
            }
            for (int k = 1; k < (i * 2); k++) {
                if (k > 1 && k < (i * 2) - 1) System.out.print("i");
                else System.out.print("*");
            }
            System.out.println();
        }
    }}