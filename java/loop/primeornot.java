import java.util.Scanner;
 public class primeornot{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();

//     }

    public static void main (String[]args){
    //     for(int i=0;i<=5;i++){
    //         System.out.println("Hello");
    //         i+=2;
    //     }

    int sum =0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();
    for (int i=1; i<n;i++){
        sum +=i;
    }
    System.out.print("Sum is: ");
    System.out.println(sum);
    if(n %2==0){
        System.out.println("Number is Even");
    }
    else{
        System.out.println("Number is odd");
    }
    }

}

