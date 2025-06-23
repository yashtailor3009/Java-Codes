import java.util.Scanner;

public class ternary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        String reportCard = marks >= 33? "PASS":"FAIL";
        System.out.println(reportCard);
    }
}