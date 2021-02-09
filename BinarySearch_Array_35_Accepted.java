/*

https://leetcode.com/problems/search-insert-position/
35. Search Insert Position
Runtime: 0 ms
Memory Usage: 38.8 MB

 */

package LeetCode;

import java.util.Scanner;



public class BinarySearch_Array_35_Accepted {

    private  static int binarySearch(int[] nums,int left,int right,int target)
    {
        int mid=(left+right)/2;
        if(left<=right)
        {
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>nums[mid])
            {
                binarySearch(nums,mid+1,right,target);
            }
            else {
                binarySearch(nums,left,mid-1,target);
            }
        }
        if(target<nums[mid])
        {
            return mid;
        }
        else {
            return mid+1;
        }
    }

    public static int searchInsert(int[] nums,int target)
    {
        int left=0;
        int right=nums.length-1;
        return binarySearch(nums,left,right,target);
    }

    public static void solution()
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        int t=scanner.nextInt();
        System.out.println(searchInsert(arr,t));
    }

}
