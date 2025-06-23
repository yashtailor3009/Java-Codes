import java.util.Scanner;

public class function_multipy{
    public static int multiply(int a , int b){
        int product = a*b;
        return product;
        }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.println("a * b = "+prod);
    }
}