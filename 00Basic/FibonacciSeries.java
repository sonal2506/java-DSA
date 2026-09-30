import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num: ");
        int n=sc.nextInt();
        int a=0, b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while(n-->2){
            int sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
        sc.close();
    }
}
