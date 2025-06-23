public class overloading{
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a ,int b , int c){
        return a+b+c;
    }

    //func to cal float sum
    public static float sum(float a , float b){
        return a+b;
    }
    public static void main(String [] args){
        System.out.println(sum(30,20));
        System.out.println(sum(20,10,30));
        System.out.println(sum(3.2f,5.8f));
    }
}