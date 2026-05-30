import java.util.*;
class Grade{
    public static void main(String [] args){
        Scanner data=new Scanner(System.in);
System.out.print("Enter your mark : ");
        int mark=data.nextInt();
        if(100>=mark && 90<=mark)
          System.out.print("Your grade is A");
        else if(89>=mark && 80<=mark)
          System.out.print("Your grade is B");
        else if(79>=mark && 70<=mark)
          System.out.print("Your grade is C");
        else if(69>=mark && 60<=mark)
          System.out.print("Your grade is D");
        else if(60>mark)
          System.out.print("Your grade is E");
        
    }
}