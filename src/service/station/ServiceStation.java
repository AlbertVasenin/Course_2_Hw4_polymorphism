package service.station;

import auto.Auto;
import auto.Car;
import auto.Truck;
import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {

  private final Queue<Auto> autos = new ArrayDeque<>();

  private void addAutoStationService(Auto auto) {
    autos.offer(auto);
  }

  public void addAutoStationCar(Car car) {
    addAutoStationService(car);
  }

  public void addAutoStationTruck(Truck truck) {
    addAutoStationService(truck);
  }

  public void getService() {
    if (!autos.isEmpty()) {
      Auto auto = autos.poll();
      auto.getDiagnosed();
      if (!auto.getDiagnosed()) {
        System.out.println("Починен: " + auto.getBrand() + " " + auto.getModel());
      }
    }
  }
}
