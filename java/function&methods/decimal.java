public class decimal{
    public static void binary(int n ){
        int myNum = n;
        int pow = 0;
        int decNum = 0;
        while(n>0){
            int rem = n % 2;
            decNum = decNum +(rem *(int)Math.pow(10,pow));

            pow++;
            n = n/2;
        }
        System.out.println("Binary form of " + myNum +" is : "+decNum);
    }
    public static void main(String[] args){
        binary(5);
    }
}