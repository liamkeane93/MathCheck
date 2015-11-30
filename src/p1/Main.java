package p1;

import javax.swing.*;
import javax.swing.text.EditorKit;

import net.miginfocom.swing.MigLayout;

public class Main extends JFrame{
	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception e) {

		}
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
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		}
}

    