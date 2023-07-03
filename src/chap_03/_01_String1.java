package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s="I Like java and coding and study";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.toUpperCase());//대문자로
        System.out.println(s.toLowerCase());//소문자로

        System.out.println(s.contains("java"));//포함 관계
        System.out.println(s.indexOf("java"));//문자열의 위치 정보
        System.out.println(s.indexOf("and"));//처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and"));//마지막으로 일치하는 위치 정보
        System.out.println(s.startsWith("I Like"));//이 문자열로 시작하면 true
        System.out.println(s.endsWith("."));//이 문자열로 끝나면 true
    }
}
