public class RaceUtility {
    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double kmToMiles(double km) {
        return km * 0.62137;
    }

    public static String makeProper(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if ((i == 0) || (str.charAt(i-1) == ' ')) {
                str = str.substring(0, i) + (str.substring(i, i+1)).toUpperCase() + str.substring(i+1);
            }
        }
        return str;
    }
}
