public class Exercise2 implements Runnable{
    public static void main(String[] args) {
        System.out.println("Start Timer");
        Exercise2 r = new Exercise2();
        r.run();
    }
    @Override
    public void run() {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;
        try {
            while (true) {
                Thread.sleep(10000);
                seconds += 10;
                minutes += seconds / 60;
                hours += minutes / 60;
                seconds %= 60;
                minutes %= 60;
                System.out.println("Timer: "+hours+":"+minutes+":"+seconds);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
