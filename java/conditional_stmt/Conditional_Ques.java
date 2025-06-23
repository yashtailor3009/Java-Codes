import java.util.Scanner;

public class Conditional_Ques{
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);

    // System.out.println("Enter week Number(1-7):");
    // int week = sc.nextInt();

    // switch(week){
    //     case 1 :
    //     System.out.println("Monday");
    //     break;
    //     case 2 :
    //     System.out.println("Tuesday");
    //     break;
    //     case 3 :
    //     System.out.println("Wednesday");
    //     break;
    //     case 4 :
    //     System.out.println("Thrusday");
    //     break;
    //     case 5 :
    //     System.out.println("Friday");
    //     break;
    //     case 6 :
    //     System.out.println("Saturday");
    //     break;
    //     case 7 :
    //     System.out.println("Sunday");
    //     break;
    //     default:
    //     System.out.println("Invalid input! please enter week number");
    // }

    int a = 63,b = 36;
    boolean x = (a < b)? true :false;
    System.out.println("Value of X: "+ x);
    int y = (a>b)?a:b;
    System.out.println("Value of Y: " + y);
    }
}