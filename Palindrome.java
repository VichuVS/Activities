import java.util.*;
public class Palindrome{
public static void main(String[]ar){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number-");
	int n=sc.nextInt(),sum=0,rem,temp=n;
	while(n>0){
	    rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if(temp==sum){
		System.out.print("Palindrome");
	}
	else {
		System.out.print("Not palindrome");
}}}
	
		