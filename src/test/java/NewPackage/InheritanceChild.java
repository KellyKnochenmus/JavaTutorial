package NewPackage;

import NewPackage.InheritanceParent;

public class InheritanceChild extends InheritanceParent {
    public InheritanceChild(int startSpeed) {
        super(startSpeed);
    }
    public void increaseSpeed() {
        speed++;
        System.out.println("Increasing Speed of Child");
    }
}
