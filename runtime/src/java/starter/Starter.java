package starter;

import api.EventBus;

import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ThreadLocalRandom;

public class Starter {

    public static void main(String[] args) {
        EventQueue eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
        eventQueue.push(EventBus.INSTANCE);

        try {
            EventQueue.invokeAndWait(() -> System.out.println("Run"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1500));
                    EventQueue queue = Toolkit.getDefaultToolkit().getSystemEventQueue();
                    queue.postEvent(RandomEventGenerator.generateRandomEvent());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();

        Thread thread1 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1500));
                    EventQueue queue = Toolkit.getDefaultToolkit().getSystemEventQueue();
                    queue.postEvent(RandomEventGenerator.generateRandomEvent());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1500));
                    EventQueue queue = Toolkit.getDefaultToolkit().getSystemEventQueue();
                    queue.postEvent(RandomEventGenerator.generateRandomEvent());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread2.start();
    }
}
