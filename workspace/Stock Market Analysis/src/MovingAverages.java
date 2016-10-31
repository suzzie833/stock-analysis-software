/**
 * Created by m.ding on 2016-10-30.
 */

public class MovingAverages {
    public static double[] simpleMovingAverage(double[] closingPrices, int periodInDays) {
        int dataPoints = closingPrices.length;
        int resultLength = dataPoints - periodInDays;
        double[] result = new double[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = sliceAverage(closingPrices, i, i + periodInDays - 1);
        }
        return result;
    }

    // public static double[] linearWeightedAverage() {} // not required in Interation #1

    // public static double[] exponentialMovingAverage () {} // not required in Iteration #1

    public static double sliceAverage(double[] entireArray, int startIndex, int endIndex) {
        double tempSum = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            tempSum += entireArray[i];
        }
        return (tempSum / (endIndex - startIndex + 1));
    }

}

