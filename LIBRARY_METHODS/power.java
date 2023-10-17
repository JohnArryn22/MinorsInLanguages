import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the value of base");
        int x = sr.nextInt();
        System.out.println("Enter the value of power");
        int n = sr.nextInt();
        if(n==0){
            System.out.println("1");
        }
        else if ((x >= 0 && x <= 8) && (n > 0 && n <= 9)) {
           

                int r = 1;
                for (int i = 1; i <= n; i++) {
                    r = r * x;
                }
                System.out.println(r);
            }
            else{
                System.out.println("Invalid Input");
            }
            sr.close();
        }
    }
