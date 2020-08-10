public class Strequals
{
    public static void main(String args[])
    {
        String s1="Sangeetha";
        String s2="Sangeetha";
        String s3="sangeetha";
        String s4="jilla";
        String s5="Sweety";
        String s6="sweety";
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s5.equalsIgnoreCase(s6));
    }
}