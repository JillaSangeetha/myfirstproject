
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class TableCreation {


        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int N = scanner.nextInt();
            for ( int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d%n", N, i, N*i);
            }
            scanner.close();
        }
    }


