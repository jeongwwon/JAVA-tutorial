package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String coffees[]=new String[]{"아메리카노","카페모카","카푸치노","라떼"};
        for (int i=0;i<coffees.length;i++){
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요");
        System.out.println("-------------------------");
        for(String i:coffees){
            System.out.println(i + " 하나");
        }
    }
}
