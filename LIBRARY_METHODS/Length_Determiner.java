// Program to determine the length of an array using exception handling
class A {
    public static void main(String[] args) {
        int[] x = { 45, 43, 53, 23, 53, 4, 23 };
        int count = 0, i, a;
        try {
            for (i = 0; i > -1; i++) {
                a = x[i];
                count++;
            }

        } catch (Exception ArrayIndexOutOfBoundsException) {
            
            System.out.print("The array is: ");
            for(int b:x){
                System.out.print(b+" ");
            }
            System.out.println("\nThe length of the array is: "+count);
        }
    }
}