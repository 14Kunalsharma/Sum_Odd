//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
class Sum{
	public static void Add(int n){
		int sum=0;
		for(int i=1; i<=n; i++){
			if(i%2!=0){
				sum = sum + i;
			}
			else{
				continue;
			}
		}
		System.out.println("Sum = " +sum);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		Add(n);
	}
}