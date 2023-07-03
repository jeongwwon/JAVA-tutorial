package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][]seats3=new String[10][15];
        String [] eng={"A","B","C","D","E","F","G","H","I","j"};
        for (int i = 0; i <seats3.length ; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j]=eng[i]+Integer.toString(j);
            }
        }
        for (int i = 0; i < seats3.length ; i++) {
            for (int j = 0; j < seats3[i].length ; j++) {
                System.out.print(seats3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
