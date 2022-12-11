package market;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Random;

public class Market {

  private final List<String> FULL_NAME = List.of("Елена Анатольевна", "Иван Геннадьевич",
      "Петр Анатольевич", "Евгений Александрович", "Николай Эдуардович", "Иван Леонидович",
      "Максим Сергеевич", "Александр Витальевич", "Ольга Николаевна", "Маргарита Леонидовна",
      "Маргарита Ивановна");
  private final String name;
  private final Queue<String> queue = new ArrayDeque<>(5);
  private final Queue<String> queueTwo = new ArrayDeque<>(5);
  private final Queue<String> queueThree = new ArrayDeque<>(5);

  public Market(String name) {
    this.name = (name != null && !name.trim().isEmpty()) ? name : "Магнит";
  }

  public void delete() {
    Random random = new Random();
    if (random.nextBoolean()) {
      queue.poll();
    } else {
      queueTwo.poll();
    }
  }

  public String randomQueue(Queue<String> queue) {
    Random random = new Random();
    int size = random.nextInt(6);
    for (int i = 0; i < size; i++) {
      queue.offer(FULL_NAME.get(random.nextInt(FULL_NAME.size())));
    }
    return null;
  }

  public void addHuman(String name) {
    if (queue.size() == 5 && queueTwo.size() == 5) {
      System.out.println("Галя, бегом на кассу №3!");
      queueThree.offer(name);
      return;
    }
    if (queue.size() > queueTwo.size()) {
      queueTwo.offer(name);
    }
    if (queue.size() < queueTwo.size()) {
      queue.offer(name);
    }
  }

  public String getName() {
    return name;
  }

  public Queue<String> getQueue() {
    return queue;
  }

  public Queue<String> getQueueTwo() {
    return queueTwo;
  }

  public Queue<String> getQueueThree() {
    return queueThree;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Market market = (Market) o;
    return Objects.equals(name, market.name) && Objects.equals(queue,
        market.queue) && Objects.equals(queueTwo, market.queueTwo)
        && Objects.equals(queueThree, market.queueThree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, queue, queueTwo, queueThree);
  }

  @Override
  public String toString() {
    return name +
        "\n, касса №1: " + getQueue() + "\n" +
        ", касса №2: " + getQueueTwo() + "\n" +
        ", касса №3: " + getQueueThree() + "\n";
  }
}
