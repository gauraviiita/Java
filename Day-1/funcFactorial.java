import java.util.*;


public class funcFactorial {
    public static int factorialNum(int num){
        int fact =1;
        if(num>=0){
            
            for(int i=num; i>=1; i--){
                fact = i * fact;
            }
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = factorialNum(num);
        System.out.println("Factorial of a number is : "+ fact);
    }
}
