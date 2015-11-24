package p1;

import javax.swing.JTextField;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import net.miginfocom.swing.MigLayout;

public class Addition extends JPanel {

    public Addition() {
        JPanel Panel = new JPanel(new MigLayout());
        JLabel lbl1 = new JLabel("How many values do you want to add ?");
        Panel.add(lbl1);
        Panel.setVisible(true);
    }

}
