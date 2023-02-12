import javax.swing.*;
import java.awt.*;

public class ProgressBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    ProgressBar() {
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD,25));
        bar.setForeground(Color.blue);
        bar.setBackground(Color.green);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420,420);
        frame.setVisible(true);

        fill();

    }

    public void fill() {

        int counter = 0;

        while(counter <= 100) {

            bar.setValue(counter);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            counter += 10;
        }

        while(counter >= 0) {
            bar.setValue(counter);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter -= 10;
        }

        bar.setString("Done !");

    }


}
