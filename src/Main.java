public class Main
{
    public static void main(String[] args)
    {
        Main.doubleConvert(13.85, 40);
        Main.doubleConvert(26.42,3.5);
        Main.doubleConvert(5,20.50);
        Main.doubleConvert(0,0);

        Main.printProper("welcome to the marathon!");
        Main.printProper("It's TIME for THE 5k!");
        Main.printProper("runners, take your marks...");
        Main.printProper("2 MILES TO GO!");
        Main.printProper("water break in 0.5 miles");
    }

    public static void doubleConvert(double m, double km) {
        System.out.println(RaceUtility.milesToKm(m));
        System.out.println(RaceUtility.kmToMiles(km));
    }

    public static void printProper(String str) {
        System.out.println(RaceUtility.makeProper(str));
    }
}
