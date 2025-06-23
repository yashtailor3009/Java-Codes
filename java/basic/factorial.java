import java.util.*;
public class factorial{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");

        int n = sc.nextInt();
        int product=1;
        for(int i=1;i<=n;i++){
            product*=i;
        }
        System.out.println("factorial of " +n+" is:"+product);
    }
}