package chap_03;
import java.util.Arrays;

public class _02_String2 {
    public static void main(String[] args) {
        String s="I like Java and Python and C.";
        System.out.println(s.replace(" and",","));
        System.out.println(s.substring(s.indexOf("Java"))); // 시작 인덱스부터 끝까지 출력
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // 끝 위치는 문자 포함 X
        s="             I LOVE JAVA    ";
        System.out.println(s);
        System.out.println(s.trim());//공백 제거

        String s1="Java";
        String s2="Python";
        System.out.println(s1+s2);//문자열 결합
        System.out.println(s1.concat(",").concat(s2)); // s1.concat().concat() 결합



    }
}
