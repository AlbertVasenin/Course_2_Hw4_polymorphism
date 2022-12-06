import Sponsor.Sponsor;
import auto.Auto;
import auto.BodyType;
import auto.Bus;
import auto.Capacity;
import auto.Car;
import auto.LoadType;
import auto.Truck;
import auto.driver.DriverB;
import auto.driver.DriverC;
import auto.driver.DriverD;
import data.Data;
import mechanics.Mechanics;

public class Main {

  public static void main(String[] args) {
    Car lada = new Car("Лада", "Веста", 1.8, BodyType.SEDAN);
    Car kia = new Car("Киа", "Рио", 1.6, BodyType.SEDAN);
    Car skoda = new Car("Шкода", "Рапид", 1.4, BodyType.STATION_WAGON);
    Car mazda = new Car("Мазда", "3", 1.6, BodyType.SEDAN);
    Truck kamaz = new Truck("КамАЗ", "65115", 3.0, LoadType.N1);
    Truck kamazTwo = new Truck("КамАЗ", "6580", 11.8, LoadType.N2);
    Truck kamazThree = new Truck("КамАЗ", "43118", 6.0, null);
    Truck kamazFour = new Truck("КамАЗ", "45143", 4.0, LoadType.N3);
    Bus bau = new Bus("BAU", "Street Line", 3.2, Capacity.AVERAGE);
    Bus paz = new Bus("ПАЗ", "3237", 4.5, Capacity.SMALL);
    Bus jac = new Bus("JAC", "HK6105G", 6.5, Capacity.BIG);
    Bus vdl = new Bus("VDL", "Citea LLE-120", 6.0, Capacity.AVERAGE);
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
    separator();
    System.out.println(lada);
    System.out.println(skoda);
    System.out.println(kamaz);
    System.out.println(kamazFour);
    System.out.println(kamazTwo);
    System.out.println(jac);
    System.out.println(paz);
    kia.printInfoAuto();
    kamazFour.printInfoAuto();
    bau.printInfoAuto();
    kamazThree.printInfoAuto();
    separator();
    boolean checkLogPas = Data.checkData("a23l_bert", "AbcDaf", "AbcDaf");
    if (checkLogPas) {
      System.out.println("Данные введены верно");
    } else {
      System.out.println("Данные введены неверно");
    }
    separator();
    printInfo(lada, kia, skoda, mazda, kamaz, kamazTwo, kamazThree, kamazFour, bau, jac, vdl, paz);
    separator();
    Sponsor gaz = new Sponsor("Газпром", 1_000_000);
    Sponsor vtb = new Sponsor("ВТБ", 2_000_000);
    Mechanics<Car> sergey = new Mechanics<>("Сергей", "Скоробогатько", "Балпетрол");
    Mechanics<Truck> alex = new Mechanics<>("Алексей", "Веселый", "Авто-Сервис");
    lada.addDrivers(new DriverB<Car>("Михаил", true, 12));
    kia.addDrivers(new DriverB<Car>("Петр Шмидт",true,15));
    kamaz.addDrivers(new DriverC<Truck>(" Алена Иванова", true, 14));
    lada.addSponsor(gaz);
    kia.addSponsor(gaz);
    kia.addMechanics(sergey);
    kamaz.addSponsor(vtb);
    kamaz.addMechanics(alex);
    lada.addMechanics(sergey);
    printAuto(lada,kia,kamaz);
    sergey.serviceAuto();

  }

  public static void printAuto(Auto... auto) {
    for (Auto autos : auto) {
      System.out.println(
          "Авто:" + " " + autos.getBrand() + " " + autos.getModel() + " " + autos.getDrivers() + " "
              + autos.getMechanics() + " " + autos.getSponsors());
    }
  }

  public static void printInfo(Auto... auto) {
    for (Auto autos : auto) {
      try {
        if (!autos.getDiagnosed()) {
          throw new RuntimeException(
              "Транспорт " + autos.getBrand() + " " + autos.getModel() + " не прошел диагностику");
        }
      } catch (RuntimeException e) {
        System.out.println(e.getMessage());
      }
    }
  }


  public static void separator() {
    System.out.println(
        "==============================================================================================");
  }
}
