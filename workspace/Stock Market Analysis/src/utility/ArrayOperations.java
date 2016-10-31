package utility;

import java.util.ArrayList;

/**
 * Created by m.ding on 2016-10-30.
 */
public class ArrayOperations {
    public static double[] subtract2Arrays(double[] firstArray, double[] secondArray) {
        int resultLength;
        if (firstArray.length >= secondArray.length) {
            resultLength = secondArray.length;
        } else {
            resultLength = firstArray.length;
        }

        double[] subtraction = new double[resultLength];
        for (int i = 0; i < resultLength; i++) {
            subtraction[i] = firstArray[i] - secondArray[i];
        }
        return subtraction;
    }

    public static double sliceAverage(double[] entireArray, int startIndex, int endIndex) {
        double tempSum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            tempSum += entireArray[i];
        }
        return (tempSum / (endIndex - startIndex + 1));
    }

    public static int[] convertToIntArray (ArrayList<Integer> inputArrayList) {
        int[] result = new int[inputArrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = inputArrayList.get(i).intValue();
        }
        return result;
    }
}
