import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=data.nextInt();
        int first=0;
        int second=1;
        for (int i = 1; i <= num; i++) {
            System.out.print(first+" ");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}