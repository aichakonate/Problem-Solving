
import java.util.Scanner;

public class carrots
{
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int p = sc.nextInt();
	String a[] = new String[n];
	for(int i =0;i<a.length;i++)
	{
		 a[i] = sc.next();
	}
	System.out.println(p);
}
}