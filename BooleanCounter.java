import java.util.Scanner;

/**
 * This simple algorithm counts the amount of true values in a given array.
 *
 * @author tuna-akin
 * @version 10/1/2024
 */
public class BooleanCounter
{
    public static void main(String[] args){
        boolean[] booleanArray1 = {true, false, true, true, true};  // 4
        boolean[] booleanArray2 = {false, false, false, false};     // 0
        boolean[] booleanArray3 = {};                               // 0

        System.out.println(countTrue(booleanArray1));
        System.out.println(countTrue(booleanArray2));
        System.out.println(countTrue(booleanArray3));

    }
    
    public static int countTrue(boolean[] booleanArray){
        int trueCounter = 0;
        
        for (boolean value : booleanArray){
            if (value){
                trueCounter++;
            }
        }
        
        
        return trueCounter;
    }
}
