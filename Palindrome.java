import java.util.*;
class Palindrome{
    public static void main(String [] args){
        Scanner data=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String org=data.nextLine();
        String rev=new StringBuilder(org).reverse().toString();
        if(org.equalsIgnoreCase(rev))
                System.out.print("It is palindrome");
        else
                System.out.print("It is Not palindrome");
    }
}