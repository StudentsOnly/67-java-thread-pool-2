import java.io.*;
import java.util.Scanner;

class PrintTask implements Runnable {
    private final String documentName;

    public PrintTask(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public void run() {
        System.out.println("Printing document: " + documentName);
        printDocument();
    }

    private void printDocument() {
        try (Scanner scanner = new Scanner(new File(documentName))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                Thread.sleep(500);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found: " + documentName);
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Printing interrupted for: " + documentName);
        }
    }
}
