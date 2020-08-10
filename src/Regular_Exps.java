import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Exps {

    public static void main(String[] args){
        // String to be scanned to find the pattern.
        String line = "This is my first regular expression programme";
        String pattern1 = "MY|regular";
       String pattern2="^This.*e$";
        String pattern3="[xzp]";
        String pattern4="m{2,}";//m present 2times one after other at 42th position
       // String pattern4="m{1,2}";//it means m  Matches at least 1 and at most 2 occurrences.

        // Create a Pattern object
        Pattern r1 = Pattern.compile(pattern1);
        Pattern r2 = Pattern.compile(pattern2);
        Pattern r3 = Pattern.compile(pattern3);
        Pattern r4 = Pattern.compile(pattern4);

        // Now create matcher object.
        Matcher m1 = r1.matcher(line);
        Matcher m2 = r2.matcher(line);
        Matcher m3 = r3.matcher(line);
        Matcher m4 = r4.matcher(line);
        if (m1.find( ))
            System.out.print("founded at:");
            System.out.println(m1.start());//regular is starting with "r" letter so, 17th position
        if (m2.find( )) System.out.println("\"starting with This(T is 0th position) , ending with m\":" +m2.start());//T is at 0 position
        if(m3.find())  System.out.println("\" x and z are not there in out input,p is there in input at \":"+m3.start());
        if(m4.find()) System.out.println("m present 2times one after other at:" +m4.start());


        String line2="sangiiiiiiiiiii";
        String pattern5="sangi";//regular expression
        Pattern r5=Pattern.compile(pattern5);
        Matcher m5 = r5.matcher(line2);
        System.out.println("lookingAt method:" +m5.lookingAt() );//Attempts to match the input sequence, starting at the beginning of the region, against the pattern.
         System.out.println("matches method:" +m5.matches()); //Attempts to match the entire region against the pattern.

    }
}
