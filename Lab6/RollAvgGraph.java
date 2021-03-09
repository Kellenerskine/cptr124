package Lab6;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class RollAvgGraph {
	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser dialog = new JFileChooser();
		dialog.showOpenDialog(null);

		File f = dialog.getSelectedFile();
		Scanner scan = new Scanner(f);

		int numberOfEntries = scan.nextInt();
		int[] numbers = new int[numberOfEntries];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

        double[] rollingAvg = new double[numberOfEntries - 4];

        for (int i = 0; i < rollingAvg.length; i++){
            rollingAvg[i] = (numbers[i] + numbers[i + 1] + numbers[i + 2] + numbers[i + 3] + numbers[i + 4]) / 5.0;
        }

		Plotter.plot(numbers, 800, 300);
		Plotter.plot(rollingAvg, 800, 300);
	}
}