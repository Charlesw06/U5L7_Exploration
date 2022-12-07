import java.text.DecimalFormat;

public class Temperature
{
    private double highTemp;
    private double lowTemp;
    private String tempScale;

    // Precondition: scale must be: "F" or "C"; anything else will default to "F"
    public Temperature(double high, double low, String scale)
    {
        highTemp = high;
        lowTemp = low;

        if (scale.equals("F") || scale.equals("C"))
        {
            tempScale = scale;
        }
        else
        {
            tempScale = "F";
        }
    }

    public static double convertCtoF(double temp) {
        return temp * 9 / 5 + 32;
    }

    public static double convertFtoC(double temp) {
        return (temp - 32) * 5 / 9;
    }

    public void changeToF() {
        tempScale = "F";
        highTemp = convertCtoF(highTemp);
        lowTemp = convertCtoF(lowTemp);
    }

    public void changeToC() {
        tempScale = "C";
        highTemp = convertFtoC(highTemp);
        lowTemp = convertFtoC(lowTemp);
    }

    private static double roundToNearestTenth(double num) {
        DecimalFormat df = new DecimalFormat(("0.#"));
        return Double.parseDouble(df.format(num));
    }

    public String toString()
    {
        return "High Temperature: " + roundToNearestTenth(highTemp) + " " + tempScale + "\nLow Temperature: " + roundToNearestTenth(lowTemp) + " " + tempScale;
    }
}
