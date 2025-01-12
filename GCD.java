import java.util.Scanner;

class DSA{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a= sc.nextInt();
      int b = sc.nextInt();
      int n = a<b? a:b;
      int gcd=0;
        for (int i = 1; i <=n ; i++) {
            if(a%i==0&&b%i==0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
