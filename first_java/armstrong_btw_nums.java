import java.util.*;
public class armstrong_btw_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp,j,i=0,n;
        for(n=(a+1);n<b;n++)
        {
            temp=n;
            i=0;
            while(temp!=0)
            {
                j=temp%10;
                i=i+(j*j*j);
                temp=temp/10;
            }
            if(i==n)
            {
                System.out.println(n);
            }
        }
    }
}
