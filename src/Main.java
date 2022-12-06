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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import mechanics.Mechanics;
import service.station.ServiceStation;

public class Main {

  private static final List<String> FULL_NAME = List.of("Елена Анатольевна", "Иван Геннадьевич",
      "Петр Анатольевич", "Евгений Александрович", "Николай Эдуардович", "Иван Леонидович",
      "Максим Сергеевич", "Александр Витальевич", "Ольга Николаевна", "Маргарита Леонидовна");

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
    kia.addDrivers(new DriverB<Car>("Петр Шмидт", true, 15));
    kamaz.addDrivers(new DriverC<Truck>(" Алена Иванова", true, 14));
    lada.addSponsor(gaz);
    kia.addSponsor(gaz);
    kia.addMechanics(sergey);
    kamaz.addSponsor(vtb);
    kamaz.addMechanics(alex);
    lada.addMechanics(sergey);
    printAuto(lada, kia, kamaz);
    List<Auto> auto = List.of(lada, kia, skoda, mazda, kamaz, kamazTwo, kamazThree, kamazFour, bau,
        jac, vdl, paz);
    ServiceStation serviceStation = new ServiceStation();
    serviceStation.addAutoStationCar(lada);
    serviceStation.getService();
    serviceStation.addAutoStationCar(kia);
    serviceStation.getService();
    serviceStation.addAutoStationCar(mazda);
    serviceStation.getService();
    serviceStation.addAutoStationTruck(kamaz);
    serviceStation.getService();
    separator();
    Queue<String> queue = new ArrayDeque<>(5);
    Queue<String> queueTwo = new ArrayDeque<>(5);
    randomQueue(queue);
    System.out.println("Очередь первая: " + queue);
    randomQueue(queueTwo);
    System.out.println("Очередь вторая: " + queueTwo);
    separator();
    addHuman("Ангелина Владиславовна", queue, queueTwo);
    System.out.println("Очередь первая: " + queue);
    System.out.println("Очередь вторая: " + queueTwo);
    separator();
    delete(queue, queueTwo);
    System.out.println("Очередь первая: " + queue);
    System.out.println("Очередь вторая: " + queueTwo);
    separator();
    example();

  }

  public static void example() {
    List<List<String>> biDemArrList = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      biDemArrList.add(i, new ArrayList<>());
      for (int j = 0; j < 8; j++) {
        biDemArrList.get(i).add(j, ((i + j) % 2 == 1 ? "●" : "◯"));
      }
    }
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.print(biDemArrList.get(i).get(j) + " ");
      }
      System.out.println();
    }
  }

  public static void delete(Queue<String> queue, Queue<String> queueTwo) {
    Random random = new Random();
    if (random.nextBoolean()) {
      queue.poll();
    } else {
      queueTwo.poll();
    }
  }

  private static void addHuman(String name, Queue<String> queue, Queue<String> queueTwo) {
    if (queue.size() == 5 && queueTwo.size() == 5) {
      System.out.println("Галя, бегом на кассу!");
      return;
    }
    if (queue.size() > queueTwo.size()) {
      queueTwo.offer(name);
    }
    if (queue.size() < queueTwo.size()) {
      queue.offer(name);
    }
  }

  public static void randomQueue(Queue<String> queue) {
    Random random = new Random();
    int size = random.nextInt(6);
    for (int i = 0; i < size; i++) {
      queue.offer(FULL_NAME.get(random.nextInt(FULL_NAME.size())));
    }
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
