package NewPackage;

public class MethodOverloading1 {
    //Different number of parameters in argument list
    public static void main(String[] args) {
        increaseSeatHeight(2);
        increaseSeatHeight(5,true);
    }

    public static void increaseSeatHeight(int heightToIncrease) {
        System.out.println("Increased seat height by " + heightToIncrease + " inches");
    }

    public static void increaseSeatHeight(int heightToIncrease, boolean rememberHeight) {
        System.out.println("Increased seat height by " + heightToIncrease + " inches");
        if(rememberHeight) {
            System.out.println("Your Selection is Saved");
        } else {
            System.out.println("Your Selection is NOT Saved");
        }
    }
}
