
import java.util.*;
public class strpalindrome {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.next();
    int left=0;
    int right=s.length()-1;
    boolean ispalindrome=true;
    while(left<right)
    {
        if(s.charAt(left)!=s.charAt(right))
    {
        ispalindrome=false;
        break;
        
        
    }
    right--;
    left++;
    }

    if(ispalindrome)
    System.out.println(s+ "is a palindrome");
    else
    System.out.println(s+" is not an palindrome");
}    
}
