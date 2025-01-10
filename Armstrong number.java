import java.util.Scanner;

class DSA{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of which armstrong you want;");
        int num=sc.nextInt();
        int n =0;
        while(num!=0){
            int r= num%10;
           n=n+r*r*r;
           num=num/10;

        } System.out.println("the armstrong value in:"+n);
    }
}
