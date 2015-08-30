
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ameya
 */
import java.util.*;
public class Selectionsort {
    
    public static void main(String[] args) {
        int[] arr= {5,9,2,6,8,7,1,19,14};
        //Call to the selectionsort method
        select(arr);
        System.out.println("The Sorted Array is::");
            for(int i:arr)
            System.out.print(i+" ");
    }
    //method to perform selection sort.
    static void select(int[] arr){
    int min=0;
        for(int i=0;i<arr.length;i++)
        {
        //min is used to keep the smallest index in the sub array starting from i..
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            //swaping of the element at i and the smallest element.
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            
        }
        
    }
}
