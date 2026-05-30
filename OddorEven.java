import java.util.*;
public class OddorEven
{
	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=data.nextInt();
		if(num%2==0)
		  System.out.print(num+" is a even");
		else
		  System.out.print(num+" is a odd");
	}
}
