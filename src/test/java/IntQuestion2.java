import java.util.Scanner;

public class IntQuestion2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String strOriginal = scan.nextLine();

        while (strOriginal == null)
        {
            System.out.println("Please enter a valid string: ");
            strOriginal = scan.nextLine();
        }
        scan.close();
     //   String strInput = "It is a test string";
        IntQuestion2 output = new IntQuestion2();
        String strReverse =output.reverseChars(strOriginal);
        System.out.println("Final Output = '"+strReverse+"'");
    }

    public static String reverseChars(String strInput) {
        String strOutput = "";
        //start with last character in the string
        for (int i = strInput.length() - 1; i >=0; i--) {
           strOutput = strOutput + strInput.charAt(i);
       }
        return strOutput;
    }
}
