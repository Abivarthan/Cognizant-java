import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = data.nextInt();
        System.out.print("Enter number 2 If divied this must not be ZERO : ");
        int num2 = data.nextInt();
        System.out.print("Enter the operations +, -, *, / : ");
        char ch = data.next().charAt(0);

        switch(ch){
            case '+':
                System.out.print("Sum is : "+(num1+num2));
                break;
            case '-':
                System.out.print("Difference is : "+(num1-num2));
                break;
            case '*':
                System.out.print("Multiple is : "+(num1*num2));
                break;
            case '/':
                System.out.print("Divied is : "+(num1/num2));
                break;
            default:
                System.out.print("Invalid Operation");
        }
    }
}