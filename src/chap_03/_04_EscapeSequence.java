package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //  \n : 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        //해물파전  9000원
        //김치전   8000원
        //감자전   8000원
        // \t : 탭
        System.out.println("해물파전 \t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");
        // \\ : 역슬래쉬
        System.out.println("C:\\Program_Files\\Java");

        // \" : 큰따옴표
        // \' : 작은따옴표
        System.out.println("단비가 \"냐옹\" 이라고 했어요");

        char c='A';
        c='\'';
        System.out.println(c); //char형 작은 따옴표 사이 작은 따옴표 출력
    }
}
