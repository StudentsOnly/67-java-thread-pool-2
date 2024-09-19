public class PrintTask implements Runnable {
  private int id;

  public PrintTask(int id) {
    this.id = id;
  }

  @Override
  public void run() {
    System.out.println("Document " + id + " starts.");
    StringBuilder text = new StringBuilder("Document " + id + " is currently being printed");
    for (int i = 0; i < 5; i++) {
      System.out.println(text.append("."));
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("Document " + id + " is done.");
  }
}
