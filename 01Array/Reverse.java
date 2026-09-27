import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of arr: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter element of arr: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<=j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        System.out.print("reverse arr is: ");
        for(int k=0; k<n; k++){
            System.out.print(arr[k]+" ");
        }
        sc.close();

    }
}