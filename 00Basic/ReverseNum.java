import java.util.*;
public class ReverseNum {
    public static int ReverseANum(int num){
        if(num==0) return 0;
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=(sum*10)+rem;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int num=sc.nextInt();
        System.out.println(ReverseANum(num));
        sc.close();
    }
}
