import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class AnnoyingBeep {

    Toolkit toolkit;
    Timer timer;

    public AnnoyingBeep() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.schedule(new RemindTask(),0, 1*1000);
    }

    class RemindTask extends TimerTask {

        int numWarningBeeps = 3;

        public void run() {
            if (numWarningBeeps > 0) {
                toolkit.beep();
                System.out.println("Síp!");
                numWarningBeeps--;
            } else {
                toolkit.beep();
                System.out.println("Idő lejárt!");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new AnnoyingBeep();
    }
}
