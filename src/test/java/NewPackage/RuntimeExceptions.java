package NewPackage;

public class RuntimeExceptions {

    public static void main(String[] args) {

       int a = 10;
        int b = 0;
        int c;
        try {
            c = a / b;
            System.out.println("The result is = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        int[] numbers = {1, 2, 3};

        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(numbers[i]);
            }
        } catch (Exception e) {
            System.out.println("Index # does not exist");
        }
    }
}
