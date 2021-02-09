/*

https://leetcode.com/problems/reverse-words-in-a-string/
151. Reverse Words in a String
Runtime: 8 ms
Memory Usage: 39.7 MB

 */

package LeetCode;
import java.util.Scanner;
import java.util.Stack;

public class String_151_Accepted {


    private static String reverseWords(String s)
    {
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            StringBuilder sb=new StringBuilder();
            if(s.charAt(i)!=' ')
            {
                for(int j=i;j<s.length() && s.charAt(i)!=' ';j++)
                {
                    sb.append(s.charAt(j));
                    i++;
                }
                stack.push(sb.toString());
            }
        }
        s="";
        System.out.println(s);
        while(!stack.isEmpty())
        {
            s=s.concat(stack.pop());
            System.out.println(s);
            if(stack.size()!=0)
            {
                s=s.concat(" ");
            }
        }
        return s;
    }

    public static void solution()
    {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(reverseWords(s));
    }

}
