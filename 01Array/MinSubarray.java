import java.util.Scanner;

public class MinSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter size of arr: ");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.print("enter arr element: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int minimum=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                sum=0;
                for(int k=i; k<=j; k++){
                    sum+=arr[k];
                }
                minimum=Math.min(sum,minimum);
            }
        }
        System.out.println("minimum sum of subarray is : "+minimum);
        sc.close();
    }
}


