import java.util.Scanner;

public class calculator {
    public static void main (String []args)
    {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter A: ");
        // int A = sc.nextInt();
        // System.out.println("Enter B: ");
        // int B = sc.nextInt();
        // System.out.println("Select the operator: ");
        // char operator = sc.next().charAt(0);

        // switch (operator) {
        //     case '+':System.out.println(A+B);
        //         break;
            
        //     case '-':System.out.println(A-B);
        //         break;

        //     case '*':System.out.println(A*B);
        //         break;

        //     case '/':System.out.println(A/B);
        //         break;
        
        //     case '%':System.out.println(A%B);
        //         break;

        //     default:System.out.println("Wrong Operator");
        // }


// number is positive or not? 
        // System.out.println("Enter your Number: ");
        // int a = sc.nextInt();
        // String user = a>=0?"Positive":"Negative";
        // System.out.println(user);


        System.out.println("Enter your temperature: ");
        double temp = sc.nextDouble();
        String user = temp > 100? "You have fever":"You don't have fever";
        System.out.println(user);
    }
}
