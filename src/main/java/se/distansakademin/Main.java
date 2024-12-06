package se.distansakademin;

public class Main {
    public static void main(String[] args) {

        printEnv("MY_NAME");
        printEnv("DB_NAME");
        printEnv("PIPPILÅNGSTRUMP");

        startStopWatch(5);

    }

    private static void printEnv(String name) {
        String value = System.getenv(name);
        System.out.println(name + ": " + value);
    }

    private static void startStopWatch(int seconds) {
        for (int i = 0; i <= seconds; i++) {
            System.out.println(i);
            tryCatchSleep(1000);
        }
    }

    private static void tryCatchSleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}