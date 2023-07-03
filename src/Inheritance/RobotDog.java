
package Inheritance;
public class RobotDog extends Robot implements Pet {

    @Override
    public void bark() {
        System.out.println("Woof Woof~~");
    }


    @Override
    void charging() {
        System.out.println(getName() + " go to charging station");
    }

    public static void main(String[] args) {
        RobotDog rd = new RobotDog();
        rd.setName("robot dog");
        rd.bark();
        rd.move();
        rd.charging();
    }
}