public class SingletonMain {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new FirstThread());
        Thread secondThread = new Thread(new SecondThread());
        firstThread.start();
        secondThread.start();
    }

    static class FirstThread implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("First");
            System.out.println(singleton.value);
        }
    }

    static class SecondThread implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Second");
            System.out.println(singleton.value);
        }
    }
}
