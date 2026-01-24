package Jan13;
import java.util.Scanner;

public class input {

    public static int Add(int x,int y)
    {
        return x+y;
    }
    public static int Subtract(int a,int b)
    {
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println("Enter 2 numbers..");
        Scanner scanner=new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        System.out.println("The addition of two numbers" +Add(num1,num2));
        System.out.println("The subtraction of two numbers " + Subtract(num1,num2));

    }
}