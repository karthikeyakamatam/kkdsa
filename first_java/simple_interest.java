import java.util.*;
public class simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal,time and rate of interest");
        int p= sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("the interest is "+(p*t*r/100));
    }
}
