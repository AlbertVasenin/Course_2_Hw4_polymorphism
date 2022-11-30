package data;

public class Data {

  private static final String CHAR_SYMBOLS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";

  public Data() {
  }

  public static boolean checkData(String login, String password, String confirmPassword) {
    try {
      check(login, password, confirmPassword);
    } catch (WrongLoginException | WrongPasswordException e) {
      System.out.println(e.getMessage());
      return false;
    }
    return true;
  }

  public static void check(String login, String password, String confirmPassword) throws
      WrongLoginException, WrongPasswordException {
    if (!validate(login)) {
      throw new WrongLoginException("Логин введен некорректно");
    }
    if ((!validate(password))) {
      throw new WrongPasswordException("Пароль введен некорректно");
    }
    if (!password.equals(confirmPassword)) {
      throw new WrongPasswordException("Пароли не совпадают");
    }
  }

  public static boolean validate(String str) {
    if (str.length() > 20) {
      return false;
    }
    for (int i = 0; i < str.length(); i++) {
      if (!CHAR_SYMBOLS.contains(String.valueOf(str.charAt(i)))) {
        return false;
      }
    }
    return true;
  }
}
