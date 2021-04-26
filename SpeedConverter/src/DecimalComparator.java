public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double x, double y) {
        int a = (int)(x*1000);
        int b = (int)(y*1000);
        return a==b;
    }
}