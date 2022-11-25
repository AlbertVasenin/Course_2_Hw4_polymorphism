import auto.Auto;
import auto.Bus;
import auto.Car;
import auto.Truck;

public class Main {

  public static void main(String[] args) {
    Auto lada = new Car("Лада","Веста",1.8);
    Auto kia = new Car("Киа", "Рио",1.6);
    Auto skoda = new Car("Шкода", "Рапид",1.4);
    Auto mazda = new Car("Мазда", "3",1.6);
    Auto kamaz = new Truck("КамАЗ","65115",3.0);
    Auto kamazTwo = new Truck("КамАЗ","6580",11.8);
    Auto kamazThree = new Truck("КамАЗ","43118",6.0);
    Auto kamazFour = new Truck("КамАЗ","45143",4.0);
    Auto bau = new Bus("BAU","Street Line",3.2);
    Auto paz = new Bus("ПАЗ","3237",4.5);
    Auto jac = new Bus("JAC","HK6105G",6.5);
    Auto vdl = new Bus("VDL","Citea LLE-120",6.0);
  }
}
