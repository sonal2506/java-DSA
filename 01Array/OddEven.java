import java.util.*;
public class OddEven {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size : ");
        int n=sc.nextInt();
        int []nums=new int[n];
        System.out.print("enter nums : ");
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        int odd=0;
        int even=0;
        for(int i=0; i<n; i++){
            if(nums[i]%2==0) even++;
            else odd++;
        }
        System.out.println("even: "+even);
        System.out.println("odd: "+odd);

        sc.close();
    }

}
