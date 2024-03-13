package Task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ExecutorServiceImplementation {

    private final int numThreads;
    private final List<WorkerThread> threads;
    private final BlockingQueue<Runnable> taskQueue;

    public ExecutorServiceImplementation(int numThreads) {
        this.numThreads = numThreads;
        this.threads = new ArrayList<>();
        this.taskQueue = new LinkedBlockingDeque<>();

        for (int i = 0; i < numThreads; i++) {
            WorkerThread worker = new WorkerThread(taskQueue);
            threads.add(worker);
            worker.start();
        }
    }

    public void submit(Runnable task) {
        try {
            taskQueue.put(task);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void shutDown() {
        for (WorkerThread worker : threads) {
            worker.interrupt();
        }
    }
}
