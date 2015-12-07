package p1;

import javax.swing.*;

import net.miginfocom.swing.MigLayout;

public class Main extends JFrame{
	public static void main(String[] args) {
		new Main();
		}
	
	public Main() {
    	JFrame frame = new JFrame("Math Check");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		JTabbedPane tab = new JTabbedPane();
		tab.add("Addition", new Addition());
		tab.add("Subtraction", new Subtraction());
		tab.add("Multiplication", new Multiplication());
		tab.add("LinearGraphs", new LinearGraph());
		frame.add(tab);
		try {
			// Set System L&F
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception e) {
			// handle exception
		}
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setSize(640, 480);
		frame.setVisible(true);
		}
}

    