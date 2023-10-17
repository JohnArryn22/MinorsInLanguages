// WAP to seperate words of a String
import java.util.Scanner;
class A{
    public static void main(String[] args){
        Scanner sr=new Scanner (System.in);
        int count=0,j=0;
        String x;
        System.out.println("Enter a string: ");
        x=sr.nextLine();

        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==32)
            count++;
        }
        // System.out.println(count);

        String[] a=new String[(count+1)];
        for(int i=0;i<a.length;i++){
            a[i]="";
        }
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)!=32)
            a[j]=a[j]+x.charAt(i);
            else
            j++;
        }
        for(String l:a){
            System.out.println(l);
        }
    }
}