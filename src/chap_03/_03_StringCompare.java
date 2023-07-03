package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Python";

        System.out.println(s1.equals("Java"));//문자열 같으면 true 다르면 false
        System.out.println(s2.equals("python"));
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분x 문자열 같은지 체크
        //s1,s2 가 1234 메모리 영역 참조
        s1="1234"; //벽에 붙은 메모지 비밀번호
        s2="1234";

        System.out.println(s1.equals(s2));//문자열 비교 심화
        System.out.println(s1==s2);
        //메모리 동적으로 생성하여 참조값 다름
        s1= new String("1234");
        s2= new String("1234");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1==s2); //false
    }
}
