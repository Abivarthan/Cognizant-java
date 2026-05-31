import java.util.*;
public class NumberGuessing{
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int rand=(int)(Math.random()*(100-1)+1);
        int num=1;
        while(num!=0){
            num=data.nextInt();
            if(rand==num){
                System.out.println("You got the number "+rand);
                num=0;
            }
            else if(num<rand){
                System.out.println("Your number is Low");
            }
            else{
                System.out.println("Your number is High");
            }
            
        }
    }
}