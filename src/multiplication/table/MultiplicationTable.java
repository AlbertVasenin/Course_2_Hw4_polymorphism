package multiplication.table;

import java.util.Objects;

public class MultiplicationTable {

  int a;
  int b;

  public MultiplicationTable(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiplicationTable that = (MultiplicationTable) o;
    return a == that.a && b == that.b || a == that.b && b == that.a;
  }

  @Override
  public int hashCode() {
    return Objects.hash(a, b);
  }

  @Override
  public String toString() {
    return a + " * " + b + " =?";
  }
}
