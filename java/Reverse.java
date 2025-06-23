// import java.util.Scanner;

// public class Reverse{
//     public static void main(String[] args){
//          Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();{
            
//                 while(n>0){
//                 int lastDigit = n%10;
//                 System.out.print(lastDigit); 
//                 n = n/10;
//             }
//         // System.out.println();
//     }
//     }
// }


public class Reverse{
    public static void main(String[] args) {
        int n = 1234;
        int rev = 0;
        while(n>0){
            int lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n = n/10;
        }
        System.out.println(rev);
    }
}