package NewPackage;

public class MethodOverloading3 {
    //Different sequence of data type of parameters in argument list
    public static void main(String[] args) {
        increaseSeatHeight("one",1);
        increaseSeatHeight(2,"two");
    }
    public static void increaseSeatHeight(String variable1, int variable2) {
        System.out.println("I'm the first overload, string then int");
    }
    public static void increaseSeatHeight(int variable2, String variable1) {
        System.out.println("I'm the second overload, int then string");
    }
 }
