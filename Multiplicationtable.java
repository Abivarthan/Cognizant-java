import java.util.*;
public class Multiplicationtable
{
	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=data.nextInt();
		for(int i=1;i<=10;i++){
		    System.out.println(num+" x "+i+" = "+(num*i));
		}
	}
}