import java.util.Scanner;
/**
 * LinearSearch
 */
public class LinearSearch {
    public static int searching(int arr[], int key) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("enter arr : ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter key: ");
        int key=sc.nextInt();
        System.out.println("found : "+ searching(arr, key));
        sc.close();
    }
    
}