package NewPackage;

public abstract class AbstractClassTest {

    private int privateSpeed;
    public int publicSpeed;
    protected int protectedSpeed;
    int speedLimit = 100;

    public AbstractClassTest() {
        this(0);
    }

    public AbstractClassTest (int startSpeed) {
        this.privateSpeed = startSpeed;
    }

    public void setPrivateSpeed(int pSpeed) {
        this.privateSpeed = pSpeed;
    }

    public abstract void engineStart(String keyType, int numCyls);
}
