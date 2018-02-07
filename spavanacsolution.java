import java.util.*;
public class spavanacsolution 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		//subtract 45 minutes
		int diff = m-45;
		if(diff < 0){
			// Calculate minutes
			m = 60 + diff;//
			
			// Calculate hours
			int diffH = h - 1;
			if(diffH < 0){
				h = 23;
			}
			else{
				h--;
			}
		}
		else{
			m = diff;
		}
		System.out.println(h + " " + m);
	
		}
	}


