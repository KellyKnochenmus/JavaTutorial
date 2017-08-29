public class IntQuestion1 {

    public static void main(String[] args) {
        String strInput = "this is a test string";
        String strOutput = reverse(strInput);
        System.out.println(strOutput);
    }
    private static String reverse(String strInput) {
        String strReverse = "";
        // String[] arrayStr = strInput.split(" ");
        String[] arrayStr = strInput.split("\\s+"); //This will split on each space, even if there are extra spaces around a space
        int numLength = arrayStr.length;
        //if array is empty
        if(strInput == null) {
            System.out.println("String is Empty or Null");
        }
        //if there is only one word in the string, the output is equal to the input
        if (numLength <= 1) {
            strReverse = strInput;
        } else {
            for (String item : arrayStr) {
                strReverse = item + " " + strReverse; // first time gets 'this' + ""; next loop gets "is" + 'this'; next loop gets "a" + 'is this";
                System.out.println("Current strReverse value is '" + strReverse + "'");
            }
        }
        strReverse = strReverse.trim();
        System.out.println("Final strReverse value is '" + strReverse + "'");
        return strReverse.trim();
    }
}

