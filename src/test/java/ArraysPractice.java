import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysPractice {

    public static void main(String[] args) {

        //First way to create an integer array:
        Integer[] myIntArray1 = new Integer[10];

        myIntArray1[0] = 100;
        myIntArray1[1] = 200;
        myIntArray1[2] = 300;
        myIntArray1[3] = 400;
        myIntArray1[4] = 500;
        myIntArray1[5] = 600;
        myIntArray1[6] = 700;
        myIntArray1[7] = 800;
        myIntArray1[8] = 900;
        myIntArray1[9] = 1000;

        System.out.println("0 index: = "+ myIntArray1[0]);

        //Second way to create an integer array:
        //MOST EFFICIENT WAY
        int[] myIntArray2 = {1,2,3};

          System.out.println("0 index: = "+ myIntArray2[0]);


        //To find the length of an array:
        int len1 = myIntArray1.length;
        System.out.println("Length of Array 1 = "+ len1);


        //To loop through the elements in an array, use a for loop
        for (int i=0; i<len1; i++)
        {
              System.out.println("Array # " + i + " value = "+myIntArray1[i]);
        }

        //To sort an array in descending order, first sort in ascending, then reverse
        Arrays.sort(myIntArray1);
        List myList = Arrays.asList(myIntArray1);
        Collections.reverse(myList);
        myList.toArray(myIntArray1);

        for (int i=0; i<len1; i++)
        {
            System.out.println("Array # " + i + " value = "+myIntArray1[i]);
        }


    }


}


