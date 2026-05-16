import java.util.*;
public class countDigit{

    public static int CountDigitOfNum(int num){
        if(num==0) return 0;
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number: ");
        int num=sc.nextInt();
        System.out.println(CountDigitOfNum(num));
        sc.close();
    }
}


