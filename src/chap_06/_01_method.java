package chap_06;

public class _01_method {
    //메도스 정의
    public static void sayHello(int x) {

        ++x;
    }
    public static void main(String[] args) {
        int x=0;
        //메소드 호출
        System.out.println("메소드 호출전");
        System.out.println(x);
        sayHello(x);
        System.out.println("메소드 호출후");
        System.out.println(x);
    }
}
