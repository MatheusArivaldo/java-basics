package UnitConverter;

public class UnitUtils {
  public final static String[] UNITS = new String[] { "celsius", "fahrenheit", "kelvin" };

  public static boolean isValidUnit(String unit) {
    for (String u : UNITS) {
      if (u.equals(unit)) {
        return true;
      }
    }
    return false;
  }

  public static double ConvertUnit(double value, String fromUnit, String toUnit) {
    double result = 0.0;
    if (fromUnit.equals(toUnit)) {
      result = value;
    } else if (fromUnit.equals("celsius")) {
      if (toUnit.equals("fahrenheit")) {
        result = (value * 9 / 5) + 32;
      } else if (toUnit.equals("kelvin")) {
        result = value + 273.15;
      }
    } else if (fromUnit.equals("fahrenheit")) {
      if (toUnit.equals("celsius")) {
        result = (value - 32) * 5 / 9;
      } else if (toUnit.equals("kelvin")) {
        result = (value - 32) * 5 / 9 + 273.15;
      }
    } else if (fromUnit.equals("kelvin")) {
      if (toUnit.equals("celsius")) {
        result = value - 273.15;
      } else if (toUnit.equals("fahrenheit")) {
        result = (value - 273.15) * 9 / 5 + 32;
      }
    }
    return result;
  }
}
