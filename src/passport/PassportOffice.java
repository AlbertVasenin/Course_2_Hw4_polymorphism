package passport;

import java.util.Objects;
import java.util.Set;

public class PassportOffice {

  private final Set<Passport> passports;

  public PassportOffice(Set<Passport> passports) {
    this.passports = passports;
  }

  public void addPassport(Passport passport) {
    Passport change = getPassport(passport.getNumber());
    if (change != null) {
      passports.remove(change);
    }
    passports.add(passport);
  }

  public Passport getPassport(String num) {
    for (Passport passport : passports) {
      if (passport.getNumber().equals(num)) {
        return passport;
      }
    }
    return null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassportOffice that = (PassportOffice) o;
    return Objects.equals(passports, that.passports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passports);
  }

  @Override
  public String toString() {
    return "В паспортном столе " +
        "документы: " + passports;
  }
}
