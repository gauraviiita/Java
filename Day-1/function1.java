import java.util.*;
public class function1 {
    public static float average(int a, int b, int c){
        float avg = (a + b + c) /3;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        float avg = average(num1, num2, num3);
        System.out.println("Average of three numbers is " + avg);
    }
}
