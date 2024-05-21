import java.util.*;
public class Hcf_Lcm {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the4 two numbers : ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("the lcm of "+a +"and"+b+"is:");
    int greater,smaller;
    if (a>b)
    {
        greater=a;
        smaller=b;
      
    }
    else{
        greater=b;
        smaller=a;

    }
    int lcm;
    while(true)
    {
        if((greater%a==0)&(greater%b==0))
        {
            lcm=greater;
            break;
        }
        greater+=1;

    }
    System.out.println(greater);
    System.out.println("the hcf of "+a +"and "+b+"is ");
    int i,hc=1;
    for(i=1;i<(smaller+1);i++)
    {
        if((a%i==0)&(b%i==0))
        {
            hc=i;
        }

    }
    System.out.println(hc);

}
    
}
