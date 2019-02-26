package geeks;

import java.util.Arrays;

public class SumCloseToZero {

    public void findSum(int [] arr, int n){
        Arrays.sort(arr);
        // Variables to keep track of current sum and minimum sum
        int sum, min_sum = 999999;
        
        // left and right index variables
        int l = 0, r = n-1;
        
        // variable to keep track of the left and right pair for min_sum
        int min_l = l, min_r = n-1;
        
        /* Array should have at least two elements*/
        if(n < 2)
        {
          System.out.println("Invalid Input");
          return;
        }
        
     
        while(l < r)
        {
          sum = arr[l] + arr[r] - 0;
        
          /*If abs(sum) is less then update the result items*/
          if(Math.abs(sum) < Math.abs(min_sum))
          {
            min_sum = sum;
            min_l = l;
            min_r = r;
          }
          if(sum < 0)
            l++;
          else
            r--;
        }
        
         
        System.out.println(" The two elements whose "+
                                "sum is minimum are "+
                          arr[min_l]+ " and "+arr[min_r]);
      }

    public static void main(String[] args) {
        int a [] = {1, 4, -5, 3, -2, 10, -6, 20};
         new SumCloseToZero().findSum(a, a.length);
        //System.out.println("Sum close to zero in the given array is : " + closestSum);
    }
}
