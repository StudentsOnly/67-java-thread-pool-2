import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        String[] documentNames = {
                "documents/doc1.txt",
                "documents/doc2.txt",
                "documents/doc3.txt",
                "documents/doc4.txt"
        };

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (String documentName : documentNames) {
            PrintTask printTask = new PrintTask(documentName);
            System.out.println("Submitting task ... " + documentName);
            executorService.submit(printTask);
        }

        try {
            executorService.awaitTermination(6, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
        System.out.println("Shutting down printing service ...");
    }
}