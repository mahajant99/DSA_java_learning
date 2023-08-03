import java.util.*;

class Count {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int n = sc.nextInt();
		int count = 0;
		while(n>0){
			int rem = n%10;
			if(rem == 3){
				count ++;
			}
			n = n/10;
		}
		System.out.println(count);
	}
}