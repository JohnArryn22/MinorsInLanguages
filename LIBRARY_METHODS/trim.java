import java.util.Scanner;
class A {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String y = "";
        System.out.println("This is a program for trimming a string.");
        System.out.println("Enter the String:");
        String x = sr.nextLine();
        int fi = 0, li = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != 32) {
                fi = i;
                break;
            }
        }
        for (int i = x.length() - 1; i > 0; i--) {
            if (x.charAt(i) != 32) {
                li = i;
                break;
            }
        }
        for (int i = fi; i <= li; i++) {
            y = y + x.charAt(i);
        }
        System.out.println("The String is: <" + y + ">");
    }
}