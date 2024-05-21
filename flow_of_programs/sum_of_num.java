import java.util.*;
public class sum_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number \n enter x to finish");
        int sum=0;
        while(true)
        {
        String s=sc.next();
        if(s.equals("x"))
        {
            break;
        }
        
        int n=Integer.parseInt(s);
        sum+=n;
        }
        System.out.println("sum of numbers is "+sum);

    }
}
