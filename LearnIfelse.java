package learnautomation1;
import java.util.Scanner;
public class LearnIfelse {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in); 
		
		System.out.println("enter the number");
		 
		int a=sc.nextInt();
		
		
		if (a%2==0) {
			System.out.println("even");
		}
		else if(a==0) {
			System.out.println("zero");
		}
		else {
			System.out.println("odd");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
