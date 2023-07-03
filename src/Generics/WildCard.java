package Generics;
abstract class ball{
    abstract String getName();

}
class soccerball extends ball{
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name="축구공";
}
class baseketball extends ball{
    private String name="농구공";
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class bag<T>{
    public T data;
    public T getData() {
        return data;
    }

    public void setData(T data){
        this.data=data;
    }
}
public class WildCard {
    //ball 의 자식이 올수 있다.
    static bag<? extends ball> pull(int time){
        //9시 = 축구 , 12시 = 농구
        if(time==9){
            System.out.println("가방에 축구공이 담겼어요.");
            soccerball g2=new soccerball();
            bag<soccerball> b2=new bag<>();
            b2.setData(g2);
            return b2;

        }else{
            System.out.println("가방에 농구공이 담겼어요.");
            baseketball g1=new baseketball();
            bag<baseketball> b1=new bag<>();
            b1.setData(g1);
            return b1;

        }

    }
    public static void main(String[] args) {
        bag<? extends ball> r1=pull(9);
        bag<? extends ball> r2=pull(12);
        System.out.println(r1.getData().getName());
        System.out.println(r2.getData().getName());


    }

}
