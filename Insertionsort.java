/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameya
 */
public class Insertionsort {
    public static void main(String[] args) {
        //The array to be sorted..
        int[] arr = {5,9,2,6,8,7,1,19,14};
        //Calling the method to perform insertion sort
        insertsort(arr);
        //Printing the sorted array....
        System.out.println("The sorted array is:");
        for(int a:arr)
            System.out.print(a+" ");
    }
    //The method to perform insertsort..!!!
    static void insertsort(int[] arr)
    {
        
       for(int i=1;i<arr.length;i++)
       {
           int item=arr[i];
           int j=i-1;
           //to place the number at the correct position...!!!
           while(j>=0 && item<arr[j])
           {
                   arr[j+1]=arr[j];
                   arr[j]=item;
                   j=j-1;
           }
           
   
       }
    }
}
