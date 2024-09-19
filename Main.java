import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) {

    try (ExecutorService executorService = Executors.newFixedThreadPool(3)) {

      PrintTask[] printTasks = {new PrintTask(1), new PrintTask(2), new PrintTask(3)};

      List.of(printTasks).forEach(executorService::submit);

      System.out.println("executorService.shutdown");
      executorService.shutdown();

      try {
        System.out.println("executorService.awaitTermination");
        executorService.awaitTermination(1, TimeUnit.HOURS);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Program terminates.");
  }
}
