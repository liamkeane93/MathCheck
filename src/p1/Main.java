package p1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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
		frame.pack();
		frame.setLocationRelativeTo(null);
		setSize(640, 480);
		frame.setVisible(true);
		}
}

    