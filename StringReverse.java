import java.util.*;
class StringReverse{
    public static void main(String [] args){
        Scanner data=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String org=data.nextLine();
        String rev=new StringBuilder(org).reverse().toString();
        System.out.print("Reversed string is : "+rev);
    }
}