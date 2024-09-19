import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        ArrayList<PrintTask> array = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            array.add(new PrintTask(i));
        }

        array.forEach(service::submit);

        service.shutdown();
        try {
            service.awaitTermination(1, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
