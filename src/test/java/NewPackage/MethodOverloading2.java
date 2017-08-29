package NewPackage;

public class MethodOverloading2 {
    //Different data type of parameters in argument list
    public static void main(String[] args) {
        increaseSeatHeight(2);
        increaseSeatHeight("5");
    }
    public static void increaseSeatHeight(int heightToIncrease) {
        System.out.println("Increased seat height by " + heightToIncrease + " inches. Integer Method.");
    }
    public static void increaseSeatHeight(String heightToIncrease) {
        System.out.println("Increased seat height by " + heightToIncrease + " inches. String Method.");
    }
}
