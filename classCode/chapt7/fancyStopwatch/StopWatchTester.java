package classCode.chapt7.fancyStopwatch;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;

/**
 * An graphical application that allows the user to 
 * test a StopWatch object.
 */
public class StopWatchTester {

    @SuppressWarnings("serial")
    private static class GraphicalPanel extends JPanel {
        protected Dimension dimension;
        protected JLabel timeString;
        protected JButton startButton;
        protected JButton stopButton;
        protected JButton resetButton;
        protected Stopwatch stopWatch;
        protected Timer jTimer;

        public GraphicalPanel(int width, int height) {
            dimension = new Dimension(width, height);
            //setBackground(Color.WHITE);
            setLayout(new FlowLayout());
            stopWatch = new Stopwatch();
            timeString = new JLabel("00:00:00.0");
            timeString.setFont(new Font("SansSerif", Font.PLAIN, 36));
            add(timeString);
            startButton = new JButton("Start");
            stopButton = new JButton("Stop");
            resetButton = new JButton("Reset");
            JPanel buttonPanel = new JPanel();
            buttonPanel.add(startButton);
            buttonPanel.add(stopButton);
            buttonPanel.add(resetButton);
            add(buttonPanel);
            startButton.addActionListener((e) -> { startTimer(); });
            stopButton.addActionListener((e) -> { stopTimer(); });
            resetButton.addActionListener((e) -> { resetTimer(); });
            jTimer = new Timer(100, (e) -> { repaint(); });
            jTimer.start();
        }
        
        private void startTimer() {
            stopWatch.start();
        }

        private void stopTimer() {
            stopWatch.stop();
        }

        private void resetTimer() {
            stopWatch.reset();
        }

        @Override
        public Dimension getPreferredSize() {
            return dimension;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            double time = stopWatch.elapsed();
            int intTime = (int) (time * 10);  // 10s of milliseconds
            //System.out.println("msec = " + intTime);
            int hours = intTime / 36000;
            intTime %= 36000;
            int minutes = intTime / 600;
            intTime %= 600;
            int seconds = intTime / 10;
            intTime %= 10;
            int tenths = intTime;
            timeString.setText(String.format("%02d:%02d:%02d.%d", 
                               hours, minutes, seconds, tenths));
            
        }

    }

    /**
     * A convenience superclass for creating simple graphical applications.
     */
    @SuppressWarnings("serial")
    private static class ApplicationWindow extends JFrame {
        /**
         * Creates a new application window. The client provides application-specific
         * information.
         * 
         * @param title  the title of the window; appears in the window's title bar
         * @param x      the <i>x</i> coordinate of the window's top-left corner
         * @param y      the <i>y</i> coordinate of the window's top-left corner
         * @param width  the window's width
         * @param height the window's height
         * @param panel  the application's drawing area and application-specific
         *               functionality
         */
        public ApplicationWindow(String title, int x, int y, JComponent panel) {
            super(title);
            setLocation(x, y);
            getContentPane().add(panel);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            setResizable(false);
            pack();
            setVisible(true);
        }
    }


    /**
     * Starting point of the application's execution
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ApplicationWindow("Stop Watch Tester", 100, 100, 
                                  new GraphicalPanel(300, 100));
        });
    }


}