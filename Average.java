import java.util.*;
public class Average{
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        System.out.print("Enter the Array size : ");
        int num=data.nextInt();
        float sum=0;
        System.out.print("Now enter the value : ");
        int [] arr=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=data.nextInt();
            sum+=arr[i];
        }
        System.out.print("The Average is : "+sum/num);
    }
}