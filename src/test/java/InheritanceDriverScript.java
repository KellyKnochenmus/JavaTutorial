import NewPackage.InheritanceChild;
import NewPackage.InheritanceParent;

public class InheritanceDriverScript {
    public static void main(String[] args) {
        int speed = 0;
        InheritanceParent c1 = new InheritanceParent(speed);
        c1.increaseSpeed();
        InheritanceChild c2 = new InheritanceChild(speed);
        c2.increaseSpeed();
    }
}
