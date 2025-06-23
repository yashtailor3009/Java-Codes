import java.util.Scanner;

public class continue_stmt{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    do{
        System.out.print("Enter a number:");
        int i = sc.nextInt();
        if(i%10==0){
            continue;
        }
        System.out.println("Number was: "+i);
    }
    while(true);
    }
}