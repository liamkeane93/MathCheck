package p1;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import net.miginfocom.swing.MigLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener, ChangeListener {
	public Main() throws Exception {
		super("Math Check");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(750, 400);
		MigLayout mg = new MigLayout();
		setLayout(mg);

		JTabbedPane tab = new JTabbedPane();
		tab.addChangeListener(this);
		add(tab);

		Panel additionPanel = new Panel("Addition");
		MigLayout mg1 = new MigLayout();
		additionPanel.setLayout(mg1);
		tab.addTab("Addition", additionPanel);
		Addition a = new Addition(additionPanel, this);
	}

	public static void main(String[] args) {

	}

	@Override
	public void stateChanged(ChangeEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}

    