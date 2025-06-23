// public class prime_fun{
//     public static boolean isprime(int n ){
//         if(n==2){
//             return true;   // conner case}
//         boolean isprime = true;
//         for (int i = 2 ;i<=n-1;i++){
//             if(n%i==0){
//                 isprime = false;
//                 break;
//             }
//         }
//         return isprime;
//     }
//     public static void main(String[] args){
//         System.out.println(isprime(7));
//         System.out.println(isprime(12));
//     }
// }

public class prime_fun{
    public static boolean isprime(int n){
        for (int i = 2; i<=n-1;i++){
            if (n%i==0){
            return false; 
        }
    }
        return true;
     }

    public static void main (String[] args){
        System.out.println(isprime(5));
    }
}