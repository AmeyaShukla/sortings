/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameya
 */
public class Bubblesort{
    public static void main(String[] args) {
        int[] arr = {5,9,2,6,8,7,1,19,14};
        //calling the bubblesort method with array arr as argument..
        bubblesort(arr);
        //printing the sorted array..
    for(int i:arr)
            System.out.print(i+" ");
    }
    //method for performing bubble sort....
    static void bubblesort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++){
            //swaping in each pass when element at j is smaller than element at j+1
                if(arr[j]>arr[j+1])
                {
                   
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                
                }
            

        }
    }
    
}
