import java.util.*;
public class Leapyear
{
	public static void main(String[] args) {
		Scanner data=new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year=data.nextInt();
		if(year%4==0 ){
		    if((year%100==0)&&(year%400==0))
		      System.out.print(year+" this year is leap year");
		    else
		      System.out.print(year+" this year is not leap year");
		}
		else
		  System.out.print(year+" this year is not leap year");
	}
}