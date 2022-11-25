import auto.Auto;
import auto.Bus;
import auto.Car;
import auto.Competing;
import auto.Truck;

public class Main {

  public static void main(String[] args) {
    Car lada = new Car("Лада","Веста",1.8);
    Car kia = new Car("Киа", "Рио",1.6);
    Car skoda = new Car("Шкода", "Рапид",1.4);
    Car mazda = new Car("Мазда", "3",1.6);
    Truck kamaz = new Truck("КамАЗ","65115",3.0);
    Truck kamazTwo = new Truck("КамАЗ","6580",11.8);
    Truck kamazThree = new Truck("КамАЗ","43118",6.0);
    Truck kamazFour = new Truck("КамАЗ","45143",4.0);
    Bus bau = new Bus("BAU","Street Line",3.2);
    Bus paz = new Bus("ПАЗ","3237",4.5);
    Bus jac = new Bus("JAC","HK6105G",6.5);
    Bus vdl = new Bus("VDL","Citea LLE-120",6.0);
    lada.getBestTimeLap();
    kia.getMaxSpeed();
    kamazFour.pitStop();
    vdl.getBestTimeLap();

  }
  public static void separator(){
    System.out.println("==============================================================================================");
  }
}
