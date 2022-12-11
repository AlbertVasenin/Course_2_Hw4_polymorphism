import static auto.Auto.getInfoAboutDiagnosticAutos;
import static auto.Auto.toStringInfoAuto;
import static example.Example.example;
import Sponsor.Sponsor;
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
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import market.Market;
import mechanics.Mechanics;
import multiplication.table.MultiplicationTable;
import passport.Passport;
import passport.PassportOffice;
import service.station.ServiceStation;

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
    Separator.separator();
    alexey.toStringForStart(kamaz);
    max.toStringForStart(jac);
    fedor.toStringForStart(mazda);
    Separator.separator();
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
    Separator.separator();
    boolean checkLogPas = Data.checkData("a23l_bert", "AbcDaf", "AbcDaf");
    if (checkLogPas) {
      System.out.println("Данные введены верно");
    } else {
      System.out.println("Данные введены неверно");
    }
    Separator.separator();
    Sponsor gaz = new Sponsor("Газпром", 1_000_000);
    Sponsor vtb = new Sponsor("ВТБ", 2_000_000);
    Sponsor vtb1 = new Sponsor("ВТБ", 2_000_000);
    Mechanics<Car> sergey = new Mechanics<>("Сергей", "Скоробогатько", "Балпетрол");
    Mechanics<Truck> alex = new Mechanics<>("Алексей", "Веселый", "Авто-Сервис");
    lada.addDrivers(new DriverB<>("Михаил", true, 12));
    kia.addDrivers(new DriverB<>("Петр Шмидт", true, 15));
    kamaz.addDrivers(new DriverC<>(" Алена Иванова", true, 14));
    toStringInfoAuto(lada, kia, skoda, mazda, kamaz, kamazTwo, kamazThree, kamazFour, bau, paz, jac,
        vdl);
    lada.addSponsor(gaz);
    kia.addSponsor(gaz);
    lada.addDrivers(new DriverB<>("Михаил", true, 12));
    kia.addMechanics(sergey);
    kamaz.addSponsor(vtb);
    kamaz.addSponsor(vtb1);
    kamaz.addMechanics(alex);
    lada.addMechanics(sergey);
    toStringInfoAuto(lada, kamaz, kia);
    Separator.separator();
    ServiceStation serviceStation = new ServiceStation();
    serviceStation.addAutoStationCar(lada);
    serviceStation.getService();
    serviceStation.addAutoStationCar(kia);
    serviceStation.getService();
    serviceStation.addAutoStationCar(mazda);
    serviceStation.getService();
    serviceStation.addAutoStationTruck(kamaz);
    serviceStation.getService();
    getInfoAboutDiagnosticAutos(lada, kia, skoda, mazda, kamaz, kamazTwo, kamazThree, kamazFour);
    Separator.separator();
    Market market = new Market("Пятерочка");
    market.randomQueue(market.getQueue());
    market.randomQueue(market.getQueueTwo());
    market.addHuman("Джордж Буш");
    System.out.println(market);
    Separator.separator();
    market.delete();
    System.out.println(market);
    Separator.separator();
    example();
    Separator.separator();
    Set<MultiplicationTable> multiplicationTables = new HashSet<>();
    Random random = new Random();
    while (multiplicationTables.size() < 15) {
      MultiplicationTable multiplicationTable = new MultiplicationTable(random.nextInt(10),
          random.nextInt(10));
      multiplicationTables.add(multiplicationTable);
      System.out.println(multiplicationTable);
    }
    Separator.separator();
    PassportOffice passportOffice = new PassportOffice(new HashSet<>());
    Passport passport = new Passport("3223465567", "Джек", "Воробей", "Батькович",
        LocalDate.of(2000,
            Month.AUGUST, 15));
    Passport passportTwo = new Passport("3223465567", "Джек", "Ричар", "Батькович",
        LocalDate.of(1990,
            Month.JANUARY, 10));
    Passport passportThree = new Passport("4563468569", "Карабас", "Барабас", "Батькович",
        LocalDate.of(1980,
            Month.DECEMBER, 5));
    Passport passportFour = new Passport("1769568462", "Кощей", "Бессмертный", "Батькович",
        LocalDate.of(1850,
            Month.JUNE, 23));
    passportOffice.addPassport(passport);
    passportOffice.addPassport(passportTwo);
    passportOffice.addPassport(passportThree);
    passportOffice.addPassport(passportFour);
    System.out.println(passportOffice);
    passportOffice.addPassport(new Passport("3427465861", "Ричард", "Непреклонный", "Батькович",
        LocalDate.of(1989, Month.NOVEMBER, 11)));
    System.out.println(passportOffice);
  }
}

