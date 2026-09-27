import java.util.Scanner;

public class PairsOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of arr: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("enter arr element: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int totalPairs=0;
        System.out.println("pairs are :");
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.print("total pairs: "+totalPairs);
        sc.close();
    }
}
