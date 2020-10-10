import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String args[]) {
        int[] exampleIntArr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        System.out.println(printSumReturnGreater(exampleIntArr, 10));
        ArrayList<String> exampleStringArr = new ArrayList<String>();
        exampleStringArr.add("Nancy");
        exampleStringArr.add("Jinichi");
        exampleStringArr.add("Fujibayashi");
        exampleStringArr.add("Momochi");
        exampleStringArr.add("Ishikawa");
        System.out.println(shuffelArrayString(exampleStringArr));
        alphabetFun();
        int[] tenRandList = tenRandomNums();
        for(int i=0; i<tenRandList.length;i++){
        System.out.println(tenRandList[i]);
        }
        randSortedMaxMin();
        randStringXCharsLong(5);
        nRandomStringsMCharsLong(10, 5);
    }
    public static ArrayList<Integer> printSumReturnGreater(int[] myArr, int y) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > y) {
                result.add(myArr[i]);
            }
            sum += myArr[i];
        }
        System.out.println(sum);
        return result;
    }
    public static ArrayList<String> shuffelArrayString(ArrayList<String> arrStringList) {
        ArrayList<String> result = new ArrayList<String>();
        System.out.println("The Array list before the shuffel" + arrStringList);
        Collections.shuffle(arrStringList);
        System.out.println("The Array after the shuffel" + arrStringList);
        for (int i = 0; i < arrStringList.size(); i++) {
            if (arrStringList.get(i).length() > 5) {
                result.add(arrStringList.get(i));
            }
        }
        return result;
    }
    public static void alphabetFun() {
        char start = 'a', end = 'z';
        char[] alpha = new char[26];
        for (int i = start, ind = 0; i <= end; i++, ind++) {
            alpha[ind] = (char) i;
        }
        System.out.println(alpha);
        ArrayList<String> alphaArryList = new ArrayList<String>();
        for (int i = 0; i < alpha.length; i++) {
            alphaArryList.add(String.valueOf(alpha[i]));
        }
        System.out.println("Before the shuffel "+ alphaArryList);
        Collections.shuffle(alphaArryList);
        System.out.println("After the Shuffel "+ alphaArryList);
        System.out.println("The first letter of the newly shuffeled String alphbet thing is " + alphaArryList.get(0));
        System.out.println("The last letter of the newly shuffeled String alphbet thing is " + alphaArryList.get(alphaArryList.size()-1));
        if (alphaArryList.get(0).compareTo("a") == 0 || alphaArryList.get(0).compareTo("e") == 0
                || alphaArryList.get(0).compareTo("i") == 0 || alphaArryList.get(0).compareTo("o") == 0
                || alphaArryList.get(0).compareTo("u") == 0 || alphaArryList.get(0).compareTo("y") == 0) {
            System.out.println(
                    "The first letter of the newly shuffeled alphabet list is the vowel: " + alphaArryList.get(0));
        } else {
            System.out.println("The first letter of the newly shuffeled alphabet list is NOT a vowel");
        }
    }
    public static int[] tenRandomNums() {
        int[] result = new int[10];
        Random r = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = r.nextInt(45) + 55;
        }
        return result;
    }
    public static void randSortedMaxMin() {
        int[] intArr = tenRandomNums();
        ArrayList<Integer> intArrList = new ArrayList<Integer>();
        for (int i = 0; i < intArr.length; i++) {
            intArrList.add((Integer) intArr[i]);
        }
        System.out.println("Before the sort" + intArrList);
        Collections.sort(intArrList);
        System.out.println("After the sort" + intArrList);
        System.out.println("Min will the the first of the list: " + intArrList.get(0));
        System.out.println("Max will at the end of the list: " + intArrList.get(intArrList.size() - 1));
    }
    public static void randStringXCharsLong(int charLong) {
        String result = "";
        char start = 'a';
        int intStart = start;
        Random r = new Random();
        for (int i = 0; i < charLong; i++) {
            int rando = r.nextInt(26) + intStart;
            result += String.valueOf((char) rando);
        }
        System.out.println(result);
    }
    public static void nRandomStringsMCharsLong(int n, int m){
        for (int i = 0; i < n; i++){
            randStringXCharsLong(m);
        }
    }
}