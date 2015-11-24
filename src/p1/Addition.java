package p1;

import javax.swing.*;

import java.awt.*;

import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class Addition extends JPanel {

    public Addition() {
        JPanel addPanel = createAdditionPanel();
        add(addPanel, BorderLayout.CENTER);
        setSize(640, 480);
    }

    private JPanel createAdditionPanel() {
        JPanel p = new JPanel(new MigLayout(""));
        JLabel lbl1 = new JLabel("How many values do you want to add ?");
        JTextField txtFieldNum = new JTextField();
        p.add(lbl1, "align left");
        p.add(txtFieldNum, "wrap ,span");

        return p;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Addition().setVisible(true);
            }
        });
    }
}
