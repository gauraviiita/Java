import java.util.*;
public class funMul {
    public static int multiplication(int a, int b){
        int mul = a * b;
        return mul;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int mul = multiplication(num1, num2);
        System.out.println("Multiplication of two numbers is : " + mul);
    }
}
