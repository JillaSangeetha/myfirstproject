

import java.io.*;
        import java.util.*;
public class String_tokenizer_splitmethod_Hackerrank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(!scan.hasNext())
        {
            System.out.print("0");
            return;
        }

        String s = scan.nextLine();
        String[] items = s.trim().split("[ !,?.\\_'@]+");

        //split("[ !,?.\\_'@]+");

   /*     if(s == ""){
   System.out.println("0");

}
else if(s.length() > 400000){
    return;
}
else{ System.out.println(items.length);} */
        System.out.println(items.length);
        for(String item: items){
            System.out.println(item);
        }
        scan.close();
    }
}

//input:He is a very very good boy, isn't he?