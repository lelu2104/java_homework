package School;

public class School {
    private int time = 8;

    public synchronized void work() {
        while (8 >= time && time <= 14) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        time++;
        System.out.println("Прошел час");
        System.out.println("Время: " + time);
        notify();
    }

    public synchronized void rest() {
        while (time >= 8 && time <= 14) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        time--;
        System.out.println("Прошел час");
        System.out.println("Время: " + time);
        notify();
    }


}
