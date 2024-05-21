import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=0,b=1,c;
        System.out.println("enter the no of digits needed");
        int n =sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<n-1;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }

    }
}
