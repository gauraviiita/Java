import java.util.*;
public class funcSum {
    //sum two number and return the sum
    public static int sumNumbers(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int add = sumNumbers(num1, num2);
        System.out.println("Sum of two numbers is : " + add);
    }
}
