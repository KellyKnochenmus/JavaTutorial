package NewPackage;

public class InheritanceParent {
    //No modifier - accessible in the same package
    int speed;
    //Private modifier - accessible only in this class
    private int privateSpeed;
    //Public modifier - accessible anywhere in the Java World with importing the package and class
    public int publicSpeed;
    //Protected modifier - accessible within this package, or within any sub-class outside the package that imports this package
    protected int protectedSpeed;


    public InheritanceParent(int startSpeed) {
        speed = startSpeed;
    }
    public void increaseSpeed() {
        speed++;
        System.out.println("Increasing Speed of Parent");
    }
    public void decreaseSpeed() {
        speed--;
        System.out.println("Decreasing Speed of Parent");
    }
}
