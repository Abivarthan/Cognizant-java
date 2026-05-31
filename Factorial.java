import java.util.*;
public class Factorial
{
	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		System.out.print("Enter a num : ");
		int num=data.nextInt();
        int temp=num;
		int sum=1;
        while(num!=1){
            sum=sum*num;
            num=num-1;
        }
        System.out.print("Factorial of the number is "+temp+" : "+sum);
	}
}