public class calculator_threading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.start();

        synchronized (cal){
            try{
                System.out.println("Waiting for calculator");
                cal.wait();
                System.out.println("Calculator finished -> "+cal.total);
            }
            catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }
    }
}

class Calculator extends Thread{
    int total;
    public void run(){
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total += 1;
            }
            notify();
        }
    }
}
