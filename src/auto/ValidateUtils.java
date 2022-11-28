package auto;

public class ValidateUtils {

  public static String validateString(String value) {
    return value != null && !value.isEmpty() && !value.isBlank() ? value
        : "\"Информация не указана\"";
  }

  public static double validateEngine(double value) {
    return value <= 0 ? 1.6 : value;
  }

  public static int validateExperience(int value) {
    return Math.max(value, 0);
  }
}
