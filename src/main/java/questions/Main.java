package questions;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    //Question 1    index[0,1,2,3,4]
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //Question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //Question 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //Question 4
    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }

    //Question 5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }

    //Question 6
    public static int getSum(int[] ints) {
        //I am gonna make an int variable called sum then i am gonna make a for loop and loop it throught the length of
        //of my array and added it to my sum
        //
        int sum = 0;

        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }

        return sum;
    }

    //Question 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum / ints.length;
    }

    //Question 8
    public static String extractAllOddNumbers(int[] numbers) {
        String extract = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                extract += numbers[i];
            }
        }

        return extract;
    }

    //Question 9
    public static String extractAllEvenNumbers(int[] numbers) {
        String extract = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                extract += numbers[i];
            }
        }

        return extract;
    }

    //Question 10
    public static boolean contains(String[] names, String element) { /*
    create a for loop that goes through the array and sees if(if statement) the String parameter
    and returns truth or false.
    */
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    //Question 11
    public static int getIndexByElement(String[] names, String element) {
        /*I am gonna make a for loop that runs through the array seening if one the element of the elements of the array
        is equal to String element if it does then ill return the index

         */
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    //Question 12
    public static void printOddNumbersInRange(int start, int end) {
        /* make a for loop that skips through odd numbers and make i the equals start and the compere it to the
        ending parameter then do a system print out of the odd numbers in range
         */
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }

    //Question 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        /*I am going to do a for loop and make i compare itself to the int thats called int n
o
*/
        String stringBuild = " ";
        for (int i = 0; i < n; i++) {
            stringBuild += str + " , ";
        }
        return stringBuild;
    }

    // Question 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String subString = "";
        for (int i = 0; i < n; i++) {
            subString += str.substring(0, 3) + " , ";
        }
        return subString;
    }

    //Question 15
    // Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str) {
        String regex = " ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter + 1;
    }

    // Question 16
    // A, E, I, O, U, and sometimes Y


    public static int VowelsCounter(String str) {
        Pattern pattern = Pattern.compile("[AEIOUYaeiouy]");
        Matcher matcher = pattern.matcher(str);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }

        return counter;


    }


    //Question 17

    //store the first element and the last element to a variable
    //  Swap the first element in an array with the last element in an array and returm
    // first and last elements of the array
    // use a temp variable so that the element getting swapped is stored and not overwritten. oh we don't need a temp variable?
    //

    // {"Henry", "Andy", "Abu"} -> {"Abu", "Andy", "Henry"}
    public static String[] swap(String[] stringArray) {
        String firstElement = stringArray[0]; // we don't need a temp variable because firstElement is snapshotted. even if stringArray[0] is overwritten by line 189, we still have firstElement stored as the original stringArray[0]
        String lastElement = stringArray[stringArray.length-1];
        stringArray[0]=lastElement;
        stringArray[stringArray.length-1]=firstElement;

        return stringArray;
    }


    //  Question 18

    /**
     * Given the following legend
     * <p>
     * <p>
     * <p>
     * f >> 7
     * <p>
     * s >> $
     * <p>
     * 1 >> !
     * <p>
     * a >> @
     * <p>
     * <p>
     * <p>
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * <p>
     * Input = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * <p>
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     * <p>
     * <p>
     * <p>
     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
     */


    public static String replaceCharacters(String str) { //use regex to change all 7s

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'f' || charArray[i] == 'F') {
                charArray[i] = '7';
            } else if (charArray[i] == 'S' || charArray[i] == 's') {
                charArray[i] = '$';
            } else if (charArray[i] == 'S' || charArray[i] == 's') {
                charArray[i] = '$';
            } else if (charArray[i] == '1') {
                charArray[i] = '!';
            } else if (charArray[i] == 'A' || charArray[i] == 'a') {
                charArray[i] = '@';
            }
        }

        String result = new String(charArray);
        return result;
    }


    // Question 19

    //         " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "


    public static String replaceWuTangTwoThreeDivisible(String stringInput) {


        String[] words = stringInput.split(" ");

        for (int i = 1; i <= words.length; i++ ){
            if(i % 3 == 0 && i != 0) {
                words[i-1] = "tang";
            }
            else if (i % 2 == 0 && i != 0) {
                words[i-1] = "wu";
            }
        }
        String newString = Arrays.toString(words);
        return newString;
    }

    // Question 20

    public static String createStringOfFibonacciUpToMax(int maxNumber) {
        String builder = "";
        int previousNum = 1;
        int nextNum = 1;

        for (int i = 1; i <= maxNumber; i++) {
            builder += previousNum + " ";
            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
        }
        return builder;
    }


    public static void main(String[] args) {
        String[] names = {"bob", "jeff", "andrew", "bobby"};
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(getLastIndex(names));
        System.out.println(getSecondToLastIndex(names));
        System.out.println(getFirstElement(names));
        System.out.println(getLastElement(names));
        System.out.println(getSecondToLastElement(names));
        System.out.println(getSum(nums));
        System.out.println(extractAllOddNumbers(nums));
        System.out.println(extractAllEvenNumbers(nums));
        System.out.println(contains(names, "jeff"));
        System.out.println(getIndexByElement(names, "jeff"));
        printOddNumbersInRange(20, 40);
        System.out.println(printGivenStringTimesNumberGiven("jeff", 5));
        System.out.println(repeatFirstThreeLetters("apple", 3));
        System.out.println(WordsInAStringCounter("There is a cat and a dog"));
        System.out.println(Arrays.toString(swap(names)));
        System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
        System.out.println(createStringOfFibonacciUpToMax(5));


    }
}

