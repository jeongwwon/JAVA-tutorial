package chap_06;

public class _02_Parameter {
    public static int power(int number){
        int result=number*number;
        System.out.println(result);
         return result;
    }
    public static void main(String[] args) {
        int x=power(5);
        System.out.println(x);

    }
}
