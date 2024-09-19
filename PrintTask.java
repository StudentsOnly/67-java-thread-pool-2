public class PrintTask implements Runnable {
    private int id;

    public PrintTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Printing document #" + id);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
