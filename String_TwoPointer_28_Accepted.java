/*
https://leetcode.com/problems/implement-strstr/
28. Implement strStr()
Memory use : 2532 ms
Runtime : 37.7 MB
 */

package LeetCode;
import java.util.Scanner;


public class String_TwoPointer_28_Accepted {

    private static int strStr(String haystack, String needle)
    {
        if(needle.equals(""))
        {
            return 0;
        }

        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                int j;
                for(j=0;haystack.length()>j+i && needle.charAt(j)==haystack.charAt(i+j);j++)
                {
                    if(j==needle.length()-1)
                    {
                        return i;
                    }
                }
            }
        }

        return -1;

    }

    public static void solution()
    {
        Scanner scanner=new Scanner(System.in);
        String haystack=scanner.nextLine();
        String needle=scanner.nextLine();
        System.out.println(strStr(haystack,needle));
    }

}
