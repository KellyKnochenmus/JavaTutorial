public class WhileLoops {
    public static void main(String[] args) {
        int i = 10;

        //While Loop
        while (i<10) {
              System.out.println(i);
              i ++; //same as i = i + 1;
            if(i == 17) {
                  continue;
              }
              System.out.println("While Loop");
              System.out.println("Value of i = " + i);
            }
           System.out.println("Outside loop...");

        //Do While Loop
        do {
            System.out.println("Do While Loop");
            System.out.println(i);
            i++;
        } while (i < 10);
    }
}
