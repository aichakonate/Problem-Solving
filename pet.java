
import java.util.Scanner;

public class pet
{
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	int sum1 =0,sum2 =0,sum3 =0,sum4 =0,sum5 =0;
	
    int c1[] = new int[4];
    for(int i =0;i<4;i++)
    {
    	c1[i]= sc.nextInt();
    	sum1 += c1[i];
    }
    
    int c2[] = new int[4];
    for(int i =0;i<4;i++)
    {
    	c2[i]= sc.nextInt();
    	sum2 += c2[i];
    }
    
    int c3[] = new int[4];
    for(int i =0;i<4;i++)
    {
    	c3[i]= sc.nextInt();
    	sum3 += c3[i];
    }
    
    int c4[] = new int[4];
    for(int i =0;i<4;i++)
    {
    	c4[i]= sc.nextInt();
    	sum4 += c4[i];
    }
    
    int c5[] = new int[4];
    for(int i =0;i<4;i++)
    {
    	c5[i]= sc.nextInt();
    	sum5 += c5[i];
    }
    
    if(sum1 > sum2 && sum1>sum3 && sum1>sum4 && sum1>sum5)
    {
    	System.out.println("1 "+sum1);
    }
    else if(sum2 > sum1 && sum2>sum3 && sum2>sum4 && sum2>sum5)
    {
    	System.out.println("2 "+sum2);
    }
    else if(sum3 > sum1 && sum3>sum2 && sum3>sum4 && sum3>sum5)
    {
    	System.out.println("3 "+sum3);
    }
    else if(sum4 > sum1 && sum4>sum2 && sum4>sum3 && sum4>sum5)
    {
    	System.out.println("4 "+sum4);
    }
    else if(sum5 > sum1 && sum5>sum2 && sum5>sum3 && sum5>sum4)
    {
    	System.out.println("5 "+sum5);
    }
    else
    {}
}
}
