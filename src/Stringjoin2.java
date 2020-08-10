public class Stringjoin2 {
    public static void main(String args[]) {
        String date = String.join("/", "22", "01", "2020");
        System.out.println(date);
        String time = String.join(":", "10", "10", "10");
        System.out.println(time);
    }
}
