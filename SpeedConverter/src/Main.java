public class Main {

    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        boolean barks_angry = BarkingDog.shouldWakeUp(true,3);
        System.out.println(barks_angry);

        boolean leap_year = LeapYear.isLeapYear(1924);
        System.out.println(leap_year);

        boolean decimalcomparator1 = DecimalComparator.areEqualByThreeDecimalPlaces(2.44556, 2.445);
        System.out.println(decimalcomparator1);

        boolean trecije = EqualSumChecker.hasEqualSum(6,2,4);
        System.out.println(trecije);

        boolean istina = TeenNumberChecker.hasTeen(31,28,18);
        System.out.println("Tinejdzera ima: "+istina);

        String sati = SecondsAndMinutesChallenge.getDurationString(65,45);
        System.out.println(sati);
        String sekunde = SecondsAndMinutesChallenge.getDurationString(3945L);
        System.out.println(sekunde);


        double areaRadius1 = AreaCalculator.area(5.0);
        System.out.println(areaRadius1);
        double aTriangle = AreaCalculator.area(5.0,4.0);
        System.out.println(aTriangle);
    }
}
