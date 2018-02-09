import java.util.*;

public class trollHunt {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int b = input.nextInt()-1;
			int k = input.nextInt();
			int g = input.nextInt();
			if((b>=2&&b<=1000)&&(k>=1&&k<=100)&&(g>=1&&g<=k)) {
			//work out number of groups and divide by number of bridges
				int numGroups = k/g;
				int numDays = b/numGroups;
				if(b%numGroups==0) System.out.println(numDays);
				else System.out.println(numDays+1);

			}
	}
}
