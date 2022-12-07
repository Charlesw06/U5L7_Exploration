public class Main
{
    public static void main(String[] args)
    {
        Box box = new Box(15, 12, 17);

        double len = 6.5;
        double feetInches = box.feetToInches(len);
        double meterInches = box.metersToInches(len);
        double volume = box.volume();

        System.out.println(feetInches);
        System.out.println(meterInches);
        System.out.println(volume);

        System.out.println("\n\n\n\n\n");

                double high = 78.5;
                double low = 54.6;

                // test constructors
                Temperature temp1 = new Temperature(high, low, "F");

                System.out.println(temp1);
                System.out.println("-----");

                Temperature temp2 = new Temperature(23.92, 14.95, "C");

                System.out.println(temp2);
                System.out.println("-----");

                // anything other than "C" or "F" defaults to "F"
                Temperature temp3 = new Temperature(57.53, 38.65, "K");

                System.out.println(temp3);
                System.out.println("-----");

                // --- test instance methods ---

                // change to C
                temp1.changeToC();
                System.out.println(temp1);

                // already C so do nothing:
                temp1.changeToC();
                System.out.println(temp1);
                System.out.println("-----");

                // change to F
                temp1.changeToF();
                System.out.println(temp1);

                // already F so do nothing:
                temp1.changeToF();
                System.out.println(temp1);
                System.out.println("-----");

                // --- test static methods ---
                double celciusTemp = Temperature.convertFtoC(78.5);
                System.out.println(celciusTemp);

                double fahrenheitTemp = Temperature.convertCtoF(12.6);
                System.out.println(fahrenheitTemp);

                System.out.println("\n\n\n\n\n\n\n");

        double miles1 = 13.85;
        double miles2 = 26.42;

        double km1 = 40;
        double km2 = 3.5;

        System.out.println(RaceUtility.milesToKm(miles1));
        System.out.println(RaceUtility.milesToKm(miles2));

        System.out.println(RaceUtility.kmToMiles(km1));
        System.out.println(RaceUtility.kmToMiles(km2));

        String title = "welcome to the marathon!";
        System.out.println(RaceUtility.makeProper(title));

        String title2 = "It's TIME for THE 5k!";
        System.out.println(RaceUtility.makeProper(title2));

    }
}
