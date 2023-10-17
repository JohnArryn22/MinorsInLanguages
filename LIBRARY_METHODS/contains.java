import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String x, y;
        System.out.println("Enter String");
        x = sr.nextLine();
        System.out.println("Enter test String");
        y = sr.nextLine();
        boolean flag = false;
        int k = 0, i = 0, j = 0;
        for (i = 0; i < x.length(); i++) {
            k = 0;
            if (x.charAt(i) == y.charAt(k)) {
                for (j = i, k = 0; k < y.length() && j < x.length(); k++, j++) {
                    if (x.charAt(j) == y.charAt(k)) {
                        flag = true;

                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag == false) {
                    continue;
                } else {
                    System.out.println("Found");

                }

            }
        }
        if (flag == false) {
            System.out.println("not found");
        }
    }

}
// Completed