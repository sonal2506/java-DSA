import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size : ");
        int n=sc.nextInt();
        int []nums=new int[n];
        System.out.print("enter nums : ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
        }
        int avg=sum/n;
        System.out.println("Average : "+ avg);

        sc.close();
    }
    
}
