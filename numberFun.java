import java.util.*;
public class numberFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner input = new Scanner(System.in);
          int N = input.nextInt();
        
          for(int i = 1;i<=N;i++) {
        	      int a = input.nextInt();
              int b = input.nextInt();
              int c = input.nextInt();
             
              if((a+b)==c | Math.abs(a-b)==c |((a/b)==c && a%b==0)| (a*b==c)|((b/a)==c && b%a==0)) { //((a/b)==c && a%b==0)
              System.out.println("Possible");
              }else { System.out.println("Impossible");}
          }
          input.close();
	}
}