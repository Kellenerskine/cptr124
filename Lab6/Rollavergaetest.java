package Lab6;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class RollAvg {
    public static void main(String[] args) throws FileNotFoundException {
        JFileChooser dialog = new JFileChooser();
        dialog.showOpenDialog(null);

        File f = dialog.getSelectedFile();
        Scanner scan = new Scanner(f);

        int numberOfEntries = scan.nextInt();
        int[] entries = new int[numberOfEntries];
        for (int i = 0; i < entries.length; i++)
            entries[i] = scan.nextInt();
        scan.close();

        double[] ravg = new double[numberOfEntries - 4];

        for (int i = 0; i < ravg.length; i++) {
            int total = 0;
            for (int k = 0; k < 5; k++) {
                total += entries[i + k]; 
            }
            ravg[i] = (double) total / 5;
        }

        Plotter.plot(ravg, 800, 300);
    }
}