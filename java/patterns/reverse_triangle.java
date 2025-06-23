public class reverse_triangle{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1;i <=n;i++){
            for (int k = 2;k<=i;k++){
                System.out.print(" ");
            }
            for(int j = 0; j<= n-i;j++){
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}