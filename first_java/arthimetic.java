import java.util.*;
public class arthimetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter the choice 1.add 2.sub 3. mul 4.div 5.moddiv");
        int c=sc.nextInt();
        if(c==1)
        System.out.println("the sum of numbers is" +(a+b));
        else if(c==2)
        System.out.println("the diff of numbers is" +(a-b));
        else if(c==3)
        System.out.println("the mul of numbers is" +(a*b));
        else if(c==4)
        System.out.println("the div of numbers is" +(a/b));
       else if(c==5)
        System.out.println("the modlo of numbers is" +(a%b));
       else
       System.out.println("invalid choice");
    }
}
