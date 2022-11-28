import auto.Bus;
import auto.Car;
import auto.Truck;
import auto.driver.DriverB;
import auto.driver.DriverC;
import auto.driver.DriverD;

public class Main {

  public static void main(String[] args) {
    Car lada = new Car("Лада", "Веста", 1.8);
    Car kia = new Car("Киа", "Рио", 1.6);
    Car skoda = new Car("Шкода", "Рапид", 1.4);
    Car mazda = new Car("Мазда", "3", 1.6);
    Truck kamaz = new Truck("КамАЗ", "65115", 3.0);
    Truck kamazTwo = new Truck("КамАЗ", "6580", 11.8);
    Truck kamazThree = new Truck("КамАЗ", "43118", 6.0);
    Truck kamazFour = new Truck("КамАЗ", "45143", 4.0);
    Bus bau = new Bus("BAU", "Street Line", 3.2);
    Bus paz = new Bus("ПАЗ", "3237", 4.5);
    Bus jac = new Bus("JAC", "HK6105G", 6.5);
    Bus vdl = new Bus("VDL", "Citea LLE-120", 6.0);
    DriverB<Car> fedor = new DriverB<>("Федор Лагунов Викторович", true, 12);
    DriverC<Truck> alexey = new DriverC<>("Алексей Николаевич Шумахер", true, 13);
    DriverD<Bus> max = new DriverD<>("Максим Сергеевич Копылов", true, 10);
    separator();
    alexey.toStringForStart(kamaz);
    max.toStringForStart(jac);
    fedor.toStringForStart(mazda);
    separator();
    kamaz.startMoving();
    jac.startMoving();
    mazda.startMoving();
    mazda.getBestTimeLap();
    mazda.getMaxSpeed();
    kamaz.pitStop();
    jac.pitStop();
    mazda.pitStop();
    jac.getMaxSpeed();
    mazda.endMoving();
    kamaz.endMoving();
    jac.endMoving();

  }

  public static void separator() {
    System.out.println(
        "==============================================================================================");
  }
}
