import utility.ArrayOperations;

import java.util.ArrayList;

/**
 * Created by m.ding on 2016-10-30.
 */
public class Indicators {
    public static int[] buySignal(double[] shorterTermMovingAverages, double[] longerTermMovingAverages) {
        int subLength = longerTermMovingAverages.length;
        ArrayList resultArrayList = new ArrayList<Integer>();
        double[] subtraction = ArrayOperations.subtract2Arrays(shorterTermMovingAverages, longerTermMovingAverages);

        for (int i = 0; i < subLength - 1; i++) {
            if ((subtraction[i] * subtraction[i + 1] < 0) &&
                    (subtraction[i] < 0) &&
                    (subtraction[i + 1] > 0)) {
                resultArrayList.add(i);
            } else if ((i != 0) &&
                    (subtraction[i] == 0) &&
                    (subtraction[i + 1] > 0) &&
                    (subtraction[i - 1] < 0)) {
                resultArrayList.add(i);
            }
        }
        return ArrayOperations.convertToIntArray(resultArrayList);
    }

    public static int[] sellSignal(double[] shorterTermMovingAverages, double[] longerTermMovingAverages) {
        int subLength = longerTermMovingAverages.length;
        ArrayList resultArrayList = new ArrayList<Integer>();
        double[] subtraction = ArrayOperations.subtract2Arrays(shorterTermMovingAverages, longerTermMovingAverages);

        for (int i = 0; i < subLength - 1; i++) {
            if ((subtraction[i] * subtraction[i + 1] < 0) &&
                    (subtraction[i] > 0) &&
                    (subtraction[i + 1] < 0)) {
                resultArrayList.add(i);
            } else if ((i != 0) &&
                    (subtraction[i] == 0) &&
                    (subtraction[i + 1] < 0) &&
                    (subtraction[i - 1] > 0)) {
                resultArrayList.add(i);
            }
        }
        return ArrayOperations.convertToIntArray(resultArrayList);
    }

}
