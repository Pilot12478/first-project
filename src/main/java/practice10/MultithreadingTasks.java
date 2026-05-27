package practice10;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class MultithreadingTasks {
    /*
    1. Задача: создание одного потока
Условие задачи: Напишите программу, в которой создается отдельный поток,
выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
2. Задача: создание двух потоков
Условие задачи: Создайте два потока.
 Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.

     */
    public static void printMessageFromThread(String message) {
        Thread thread = new Thread(() -> {
            try {
                int i = 0;
                while (i < 5 || Thread.currentThread().isInterrupted()) {
                    System.out.println(message);
                    i++;
                    TimeUnit.SECONDS.sleep(1);
                }
            } catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }

        });
        thread.start();
    }

    /*
    3. Задача: использование volatile
Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
 В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
     */
    private static class VolotileCounter implements Runnable {
        private volatile int counter = 0;
        private boolean stop;

        public int getCounter() {
            return counter;
        }

        public  void increase() throws InterruptedException {
            while (!stop) {
                counter++;
                Thread.sleep(1000);
                System.out.println(getCounter());
            }
        }

        public void stop() {
            this.stop = true;
        }

        @Override
        public void run() {
            try {
                this.increase();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
    public static class SynchronizedCounter implements Runnable{
        private int counter =0;
        public synchronized void increase(){
            IntStream.range(0,1000).forEach(i->counter++);
        }
        public int getCounter(){
            return counter;
        }

        @Override
        public void run() {
            this.increase();
        }
    }


    static void main() throws InterruptedException {
        printMessageFromThread("Привет из потока!");
        printMessageFromThread("A");
        printMessageFromThread("B");


        VolotileCounter volotileClass = new VolotileCounter();
        Thread thread = new Thread(volotileClass);
        thread.start();
        TimeUnit.SECONDS.sleep(5);
        volotileClass.stop();


        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();
        Thread thread1 = new Thread(synchronizedCounter);
        thread1.start();
        thread1.join();
        System.out.println(synchronizedCounter.getCounter());

    }
}
