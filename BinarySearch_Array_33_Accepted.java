/*

https://leetcode.com/problems/search-in-rotated-sorted-array/
33. Search in Rotated Sorted Array
Runtime: 0 ms
Memory Usage: 38 MB

 */


package LeetCode;

import java.util.Scanner;

public class BinarySearch_Array_33_Accepted {

    public static int search(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        int mid;
        while (start<=end)
        {
            mid=(start+end)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]>=nums[start])
            {
                if(target<nums[mid] && target>=nums[start])
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            if(nums[mid]<=nums[end])
            {
                if(target<=nums[end] && target>nums[mid])
                {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
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
        int target=scanner.nextInt();
        System.out.println(search(arr,target));
    }

}
