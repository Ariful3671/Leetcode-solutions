/*

https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
34. Find First and Last Position of Element in Sorted Array
Runtime: 0 ms
Memory Usage: 43.8 MB

 */


package LeetCode;
import java.util.Scanner;

public class BinarySearch_Array_34_Accepted {


    private static int[] searchRange(int[] nums,int target)
    {
        int start=0;
        int end=nums.length-1;
        int[] range=new int[]{-1,-1};
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                range[0]=mid;
                range[1]=mid;
                for(int i=mid-1;i>=0 && nums[i]==target;i--)
                {
                    range[0]--;
                }
                for(int i=mid+1;i<=nums.length-1 && nums[i]==target;i++)
                {
                    range[1]++;
                }
                return range;
            }
            else if(nums[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return range;
    }

    public static void solution()
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        int target=scanner.nextInt();
        int[] range=searchRange(nums,target);
    }

}
