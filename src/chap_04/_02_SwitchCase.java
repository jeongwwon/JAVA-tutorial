package chap_04;

public class _02_SwitchCase {
    public static void main(String[] args) {
        int ranking=1;
        switch (ranking){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("1/4 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료");
    }
}
