import java.util.Scanner;
public class break_stmt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // do{
        //     System.out.print("Enter a number: ");
        //     int n = sc.nextInt();
        //     if (n%10==0){
        //         break;
        //     }
        //     System.out.println(n);
        //     }while(true);


        System.out.print("Enter a number: ");
        int i = sc.nextInt();
        for (i=i;i<=5;i++){
            if(i==3){
                continue; 
            }
            System.out.println(i);
        }
    }
}