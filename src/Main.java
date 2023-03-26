public class Main {
    public static void main(String[] args) {
        

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listener2 = System.out::println;

        Worker worker = new Worker(listener);
        Worker worker2 = new Worker(listener2);
        worker.start();
        worker2.start2();
}
