package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //다차원 배열(2차원 배열)
        String[] SeatA={"A1","A2","A3","A4","A5"};
        String[] SeatB={"B1","B2","B3","B4","B5"};
        String[] SeatC={"C1","C2","C3","C4","C5"};
        String[][] seats=new String[][]{
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };
        System.out.println(seats[2][3]);
    }
}
