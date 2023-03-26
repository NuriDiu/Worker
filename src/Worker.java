public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result2);
    }

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 67; i++) {
            callback.onDone("Task " + i + " is done");
        }
    }

    public void start2() {
        for (int i = 67; i < 100; i++) {
            errorCallback.onError("Task " + i + "  with error");
        }
    }




}


