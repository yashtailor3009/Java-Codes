public class prime{
    public static boolean isprime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isprime(3));
        System.out.println(isprime(9));
    }
}