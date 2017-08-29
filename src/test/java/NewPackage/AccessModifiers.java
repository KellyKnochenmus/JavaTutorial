package NewPackage;

public class AccessModifiers {


    static int speed1 = 0;

    public static void main(String[] args) {
        InheritanceParent c1 = new InheritanceParent(speed1);
        c1.increaseSpeed();
        c1.speed = 10;
        c1.publicSpeed = 20;
    }
}
