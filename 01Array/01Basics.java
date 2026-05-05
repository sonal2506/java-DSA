import java.util.*;
class Basics{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);   //Scanner class for user input

        //array is a container which can store multiple values of same data type in a singlr variable
        
        //initialization and declaration
        // int arr[]=new int[5];
        // int[] arr=new int[5];
        
        //int[] arr={1,2,3,4,5}

        //taking element of arr input from user
        int arr[]=new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        // printing array elements
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}