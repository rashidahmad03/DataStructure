package com.sorting;
/*
* Worst Case Time Complexity [ Big-O ]: O(n2)
Best Case Time Complexity [Big-omega]: O(n)
Average Time Complexity [Big-theta]: O(n2)
Space Complexity: O(1)
*
* */
import com.utilitydata.Dataset;

public class BubbleInt {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        System.out.println(version);

        int a[]=new Dataset().int_array();

        bubbleSort(a,a.length);
    }
  static  void bubbleSort(int arr[], int n)
    {
        boolean flag=false ;
        int i, j, temp;
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n-i-1; j++)
            {
                // introducing a flag to monitor swapping
               flag = false;
                if( arr[j] > arr[j+1])
                {
                    // swap the elements
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // if swapping happens update flag to 1
                    flag = true;
                }
            }
            // if value of flag is zero after all the iterations of inner loop
            // then break out
            if(!flag)
            {
                break;
            }
        }

        // print the sorted array
     System.out.printf("Sorted Array: ");
        for(i = 0; i < n; i++)
        {
            System.out.printf("%d  ", arr[i]);
        }
    }
}
