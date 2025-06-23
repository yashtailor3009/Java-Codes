import java.util.*;

public class Conditional_Stmt{
    public static void main( String args[])
    {
        // System.out.println ("Enter your income: ");
        Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // if (A % 2 ==0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }
        // int tax;
        // if (income < 500000){
        //     tax = 0;
        // }
        // else if(income >= 500000 && income < 1000000){
        //     tax = (int) (income * 0.2);
        // }
        // else{
        //       tax = (int)(income *0.3);
        // }
        // System.out.println("your tax is :"+tax);

        System.out.println("Enter Value A:");
        System.out.println("Enter Value B:");
        System.out.println("Enter Value C:");
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if((A >= B)&&(A>=C)){
            System.out.print("A");
        }
        else if(B>=C){
            System.out.print("B");
        }
        else{
            System.out.print("C");
        }
    }
}
