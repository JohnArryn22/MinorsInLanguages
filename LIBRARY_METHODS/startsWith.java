import java.util.Scanner;
class A{
    public static void main(String[] args) {
        Scanner sr=new Scanner (System.in);
        String x,y;
        int l1,l2;
        boolean flag=false;
        System.out.println("Enter string: ");
        x=sr.nextLine();
        System.out.println("Enter test String");
        y=sr.nextLine();
        l1=x.length();
        l2=y.length();
        for(int i=0;i<l2;i++){
            if(x.charAt(i)!=y.charAt(i)){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println(x +" does not start with "+y);
        }
        else{
            System.out.println(x +" start with "+y);

        }
    }
}