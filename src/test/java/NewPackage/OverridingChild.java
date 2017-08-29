package NewPackage;

public class OverridingChild extends OverridingParent {
    public static void main(String[] args) {
        OverridingChild c1 = new OverridingChild();
        c1.engineStart(2);
    }
    @Override
    public void engineStart(int cyl) {
        super.engineStart(5);
        System.out.println("I am from the child class");
    }
}


